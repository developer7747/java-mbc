
     
  // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val(),
        	 "bannerContent": CKEDITOR.instances['bannerContent'].getData(),
             "intial": $('#intial').val(),   
             "activeornot132": $('#activeornot132').val(),
             "longDescription": CKEDITOR.instances['longDescription'].getData(),
             "name": $('#name').val(),
             "shortDescription": CKEDITOR.instances['shortDescription'].getData(),
             "imagepath": $('#imagepath').val()
         });
     }   
     
  function addUpdateRecord()  {
	  var url="state/add";
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
     
    	
    	
    	
     
     function AddState() {
         $('#stateform').get(0).reset();      	
         $('#AddEditStateModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#stateform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         
         
         $('#intial').val(Row_Data['intial']);
         $('#activeornot132').val(Row_Data['activeornot132']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),
         
         $('#name').val(Row_Data['name']);
         CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditStateModal').modal('show');
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
     
     
     
     
     
     
     
     
     function testUpload()
     {
    	 var formData = new FormData($('#stateform')[0]);
		 // var url="Article/add";
	var url=hosting_url+"Admin/state/upload";
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
     
     
     
     
     
     
     
     
     
     $(document).ready(function () {       
    	 
    	 $("#bt").click(function() {
    			alert("HHHH");
    		
    			var formData = new FormData($('#uploadForm')[0]);
    			var url=hosting_url+"Admin/state/upload";
    			$.ajax({
    			    url: url,
    			    type: "POST",
    			    dataType: 'text',
    			    contentType: false,
    			    processData: false,
    			    cache: false,
    			    data: formData,
    			    success: function(response) {
    			        alert("success");
    			    },
    			    error: function() {
    			        alert("unable to create the record");
    			    }
    		});
    	 });
    	 
         $("#multiple37").jqGrid({
         	url: hosting_url+"Admin/state/getState",              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'Id', name: 'id', key: true, width: 75 },
                 { label: 'BannerContent', name: 'bannerContent', width: 150 },
                 { label: 'Intial', name: 'intial', width: 150 },
//                 { label: 'activeornot132', name: 'activeornot132', width: 150 },
                 { label: 'Isactive', name: 'activeornot132', width: 150 },
                 { label: 'LongDescription', name: 'longDescription', width: 150 },
                 { label: 'Name', name: 'name', width: 150 },
                 { label: 'ShortDescription', name: 'shortDescription', width: 150 },
                 { label: 'UploadImage', name: 'uploadImage', width: 150 },                 
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
     