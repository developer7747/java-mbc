   
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
              "category": $('#category').val(),
              "speciality": $('#speciality').val(),
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
	  var url="Article/add";
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
     
    	
    	
    	
     
     function AddArticle() {
         $('#Articleform').get(0).reset();      	
         $('#AddEditArticleModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#Articleform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         
         
         
         $('#isActive').val(Row_Data['isActive']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),
         
         $('#name').val(Row_Data['name']);
         CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditArticleModal').modal('show');
     }
     
     
     function displayButtons(cellvalue, options, rowObject) {       
         var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup(" + options.rowId + ")' >Edit </span>";
         return edit;
 }
     

     
     function testUpload()
     {
    	 var formData = new FormData($('#Articleform')[0]);
		 // var url="Article/add";
	var url="http://localhost:8080/MBC-Java/Article/upload";
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
    	 var formData = new FormData($('#Articleform')[0]);
		 // var url="Article/add";
	var url="http://localhost:8080/MBC-Java/Article/pdfupload";
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
         	url: 'http://localhost:8080/MBC-Java/Article/getArticle',              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'bannerContent', name: 'bannerContent', width: 150 },
                 { label: 'name', name: 'name', width: 150 },
                 { label: 'metaDescription', name: 'metaDescription', width: 150 },
                 { label: 'metaKeyword', name: 'metaKeyword', width: 150 },
                 { label: 'linkurl', name: 'linkurl', width: 150 },
                 { label: 'heading', name: 'heading', width: 150 },
                 { label: 'uploadImage', name: 'uploadImage', width: 150 },
               
                 { label: 'longDescription', name: 'longDescription', width: 150 },
                
                 { label: 'shortDescription', name: 'shortDescription', width: 150 },
                 { label: 'uploadImage', name: 'uploadImage', width: 150 }, 
                 
                 { label: 'pdfupload', name: 'pdfupload', width: 150 }, 
                 { label: 'uploaddate', name: 'uploaddate', width: 150 }, 
                 { label: 'category', name: 'category', width: 150 }, 
                 { label: 'speciality', name: 'speciality', width: 150 }, 
                 { label: 'isActive', name: 'isActive', width: 150 }, 
                 
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
     