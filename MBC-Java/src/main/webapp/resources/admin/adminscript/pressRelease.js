   
  // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val(),
        	 "bannerContent": CKEDITOR.instances['bannerContent'].getData(),
        	 "name": $('#name').val(),
        	 "metaDescription": $('#metaDescription').val(),
        	 "metaKeyword": $('#metaKeyword').val(),
        	 "linkurl": $('#linkurl').val(), 
        	 "heading": $('#heading').val(),
        	  
        	  "longDescription": CKEDITOR.instances['longDescription'].getData(),
              
              "shortDescription": CKEDITOR.instances['shortDescription'].getData(),
              "categoryid": $('#categoryid').val(),
              "specialityid": $('#specialityid').val(),
              "isActive": $('#isActive').val(),
              "imagepath": $('#imagepath').val(),
              "uploaddate": $('#uploaddate').val()
              
//              "pdfupload": $('#pdfupload').val(),
//              


//             
//              "uploadImage": $('#uploadImage').val()
//            
             
           
         });
     }   
     
  function addUpdateRecord()  {
	  var url="PressRelease/add?specialityId="+$('#SpecialityDrpdown').val();
	  addUpdateCommonRecord(url,formToJSON())
  }  	 
  
  
  
  
  
  
  
  
    	function deleteRecord() {
    	    console.log('deleteRecord');
    	    $.ajax({
    	        type: 'DELETE',
    	        url: rootURL + '/' + $('#wineId').val(),
    	        success: function(data, textStatus, jqXHR){
    	            alert('Record deleted successfully');
    	        },
    	        error: function(jqXHR, textStatus, errorThrown){
    	            alert('delete Record error');
    	        }
    	    });
    	}
     
    	
    	
    	
    	
    	
        
        $(document).ready(function () {
       	 $.getJSON("http://localhost:8080/MBC-Java/speciality/getSpeciality1", function (data)  
       		        {        
       		            $.each(data, function (i, data)  
       		            {       
       		            	//alert(data.name);
       		                 $('<option>',  
       		                    {  
       		                        value: data.id,  
       		                        text: data.name  
       		                    }).html(data.name).appendTo("#SpecialityDrpdown");  
       		                });  
       		 
       		        
       		     });  
   		   
       		    
        });  
  		 
    	
    	
    	
    	
    	
    	
    	
     
     function AddPressRelease() {
         $('#PressReleaseform').get(0).reset();      	
         $('#AddEditPressReleaseModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#PressReleaseform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         
         
         
         $('#isActive').val(Row_Data['isActive']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),
         
         $('#name').val(Row_Data['name']);
         CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditPressReleaseModal').modal('show');
     }
     
     
     function displayButtons(cellvalue, options, rowObject) {       
         var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup(" + options.rowId + ")' >Edit </span>";
         return edit;
 }
     

     
     function testUpload()
     {
    	 var formData = new FormData($('#PressReleaseform')[0]);
		 // var url="PressRelease/add";
	var url="http://localhost:8080/MBC-Java/PressRelease/upload";
		$.ajax({
		    url: url,
		    type: "POST",
		    dataType: 'text',
		    contentType: false,
		    processData: false,
		    cache: false,
		    data: formData,
		    success: function(response) {
		    	$("#imagepath").val(response)
		        alert("success");
		    },
		    error: function() {
		        alert("unable to create the record");
		    }
	});
     }
  
     
     
     function pdfUpload()
     {
    	 var formData = new FormData($('#PressReleaseform')[0]);
		 // var url="PressRelease/add";
	var url="http://localhost:8080/MBC-Java/PressRelease/pdfupload";
		$.ajax({
		    url: url,
		    type: "POST",
		    dataType: 'text',
		    contentType: false,
		    processData: false,
		    cache: false,
		    data: formData,
		    success: function(response) {
		        alert("Pdf Uploaded successfully");
		    },
		    error: function() {
		        alert("unable to create the record");
		    }
	});
     }
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     $(document).ready(function () {         
         $("#multiple37").jqGrid({
         	url: 'http://localhost:8080/MBC-Java/PressRelease/getPressRelease',              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'Id', name: 'id', key: true, width: 75 },
                 { label: 'BannerContent', name: 'bannerContent', width: 150 },
                 { label: 'Name', name: 'name', width: 150 },
                 { label: 'MetaDescription', name: 'metaDescription', width: 150 },
                 { label: 'MetaKeyword', name: 'metaKeyword', width: 150 },
                 { label: 'Linkurl', name: 'linkurl', width: 150 },
                 { label: 'Heading', name: 'heading', width: 150 },
                 { label: 'UploadImage', name: 'uploadImage', width: 150 },
               
                 { label: 'LongDescription', name: 'longDescription', width: 150 },
                
                 { label: 'ShortDescription', name: 'shortDescription', width: 150 },
                 { label: 'UploadImage', name: 'uploadImage', width: 150 }, 
                 
                 { label: 'Pdfupload', name: 'pdfupload', width: 150 }, 
                 { label: 'Uploaddate', name: 'uploaddate', width: 150 }, 
                 { label: 'Categoryid', name: 'categoryid', width: 150 }, 
                 { label: 'Specialityid', name: 'specialityid', width: 150 }, 
                 { label: 'IsActive', name: 'isActive', width: 150 }, 
                 
                 { label: 'Action', name: 'Action', width: 82, formatter: displayButtons },
             ],
             autowidth: true,
             viewrecords: true,
             height: "auto",
             //multiselect: true,
             multiboxonly: true,
             pager: "#pmultiple37",
             rowNum: 10,
             rowList: [5, 10, 20, 30, 40],
             jsonReader: {
                 root: "rows",
                 page: "page",
                 total: "total",
                 records: "records",
                 repeatitems: false,
                 Id: "0"
             },
         });            
     });
     