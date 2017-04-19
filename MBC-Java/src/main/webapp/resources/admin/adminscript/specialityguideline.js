   
  // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
	    "id" : $('#id').val(),
		"bannerContent" : CKEDITOR.instances['bannerContent'].getData(),
		"longDescription" : CKEDITOR.instances['longDescription'].getData(),
		"title" : $('#Title').val(),
		"shortDescription" : CKEDITOR.instances['shortDescription'].getData(),
		"imagepath" : $('#imagepath').val(),
		//"categoryid" : $('#categoryid').val(),
		"uploadDate" : $('#uploadDate').val()
            	
            // "uploadImage": $('#uploadImage').val()
         });
     }   
     
  function addUpdateRecord()  {
	  var url="specialityguideline/add?categoryid="+$('#CategoryDrpdown').val();
	// var url="specialityguideline/add;
	  
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
     
    	
    	
    	
    	$(document).ready(function() {
    		$.getJSON(hosting_url+"Admin/Category/getCategory1", function(data) {
    			$.each(data, function(i, data) {
    				//alert(data.name);
    				$('<option>', {
    					value : data.id,
    					text : data.catname
    				}).html(data.catname).appendTo("#CategoryDrpdown");
    			});

    		});

    	});

    	
    	
    	
    	
    	
    	
    	
        function testUpload()
        {
       	 var formData = new FormData($('#SpecialityGuidelineform')[0]);
   		 // var url="Article/add";
   	var url=hosting_url+"Admin/specialityguideline/upload";
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
        
        
    
     function AddSpecialityGuideline() {
         $('#SpecialityGuidelineform').get(0).reset();      	
         $('#AddEditSpecialityGuidelineModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#SpecialityGuidelineform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         
         
         
         $('#isActive').val(Row_Data['isActive']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),
         
         $('#Title').val(Row_Data['Title']);
         CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditSpecialityGuidelineModal').modal('show');
     }
     
     
     function displayButtons(cellvalue, options, rowObject) {       
         var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup(" + options.rowId + ")' >Edit </span>";
         return edit;
 }
     
  // We need to turn off the automatic editor creation first.
	
//		CKEDITOR.replaceClass( 'ckeditor', {
//			extraPlugins: 'sourcedialog',
//			removePlugins: 'sourcearea'
//		} );
     
     
     
     
     $(document).ready(function () {         
         $("#multiple37").jqGrid({
         	url: hosting_url+"Admin/SpecialityGuideline/getSpecialityGuideline",              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                
            	 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'bannerContent', name: 'bannerContent', width: 150 },
              
                 { label: 'longDescription', name: 'longDescription', width: 150 },
                 { label: 'Title', name: 'title', width: 150 },
                 { label: 'shortDescription', name: 'shortDescription', width: 150 },
                 { label: 'uploadDate', name: 'uploadDate', width: 150 },                 
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
     