   
  // Helper function to serialize all the form fields into a JSON string

	

	function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val(),
        	 "catname": $('#name').val(),
       	 "bannerContent": CKEDITOR.instances['bannerContent'].getData(),
        	 "customName": $('#customName').val(),
//        	 "createdDate": $('#createdDate').val(),
//        	 "modifiedDate": $('#modifiedDate').val(), 
//        	 
       	  "catDesc": CKEDITOR.instances['longDescription'].getData(),  
             "catShortDesc": CKEDITOR.instances['shortDescription'].getData(),
              "isActive": $('#isActive').val(),
             "imagepath": $('#imagepath').val()
              
              
  
         });
     }   
     

  function addUpdateRecord()  {
	  var url="category/add";
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
     
    	
  		 
    	
     function AddCategory() {
         $('#Categoryform').get(0).reset();      	
         $('#AddEditCategoryModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#Categoryform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         $('#name').val(Row_Data['catname']);
         $('#customName').val(Row_Data['customName']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         $('#isActive').val(Row_Data['isActive']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['catDesc']),
         CKEDITOR.instances['shortDescription'].setData(Row_Data['catShortDesc']),
         $('#imagepath').val(Row_Data['imagepath']);
        
         $('#AddEditCategoryModal').modal('show');
         
         
        
         
         
     
//       var Row_Data = $("#multiple37").getRowData(RowID);         
//       $('#id').val(Row_Data['id']);
//       
//       $('#name').val(Row_Data['catname']);
//       CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
//       $('#isActive').val(Row_Data['isActive']);
//       CKEDITOR.instances['longDescription'].setData(Row_Data['catDesc']),
//       CKEDITOR.instances['shortDescription'].setData(Row_Data['catShortDesc']),
//       $('#imagepath').val(Row_Data['imagepath']);
//       
         
         
         
         
         
         
         
     }
     
     
     function displayButtons(cellvalue, options, rowObject) {       
         var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup(" + options.rowId + ")' >Edit </span>";
         return edit;
 }
     

     
     function testUpload()
     { 
    	 
    	 var formData = new FormData($('#Categoryform')[0]);
    	 var url=hosting_url+"Admin/Category/upload";
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
  
     
     
//     function pdfUpload()
//     {
//    	 var formData = new FormData($('#Categoryform')[0]);
//		 // var// url="Article/add"; var u rl="ht
//tp://localhost:8080/MBC-Java/Article/pdfupload";
//		$.ajax({
//		    url: url,
//		    type: "POST",
//		    dataType: 'text',
//		    contentType: false,
//		    processData: false,
//		    cache: false,
//		    data: formData,
//		    success: function(response) {
//		        alert("Pdf Uploaded successfully");
//		    },
//		    error: function() {
//		        alert("unable to create the record");
//		    }
//	});
//     }
  
     
     
     $(document).ready(function () {         
         $("#multiple37").jqGrid({
         	url: hosting_url+"Admin/Category/getCategory",              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
            	 
            	 
                 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'bannerContent', name: 'bannerContent', width: 150 },
                 { label: 'catname', name: 'catname', width: 150 },
                 { label: 'customName', name: 'customName', width: 150 },
              //   { label: 'createdDate', name: 'createdDate', width: 150 },

                 { label: 'imagepath', name: 'imagepath', width: 150 },
               
                 { label: 'longDescription', name: 'catDesc', width: 150 },
                
                 { label: 'shortDescription', name: 'catShortDesc', width: 150 },

                 { label: 'isActive', name: 'isActive', width: 150 }, 
                 
                 { label: 'Action', name: 'Action', width: 82, formatter: displayButtons },
             ],
             autowidth: true,
             viewrecords: true,
             height: "auto",
             //mult// iselect: true,
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
     