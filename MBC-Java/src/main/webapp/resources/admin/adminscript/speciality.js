   
  // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val(),
        	 "bannerContent": CKEDITOR.instances['bannerContent'].getData(),
               
             "isActive": $('#isActive').val(),
             "longDescription": CKEDITOR.instances['longDescription'].getData(),
             "name": $('#name').val(),
             "shortDescription": CKEDITOR.instances['shortDescription'].getData(),
             "uploadImage": $('#uploadImage').val()
         });
     }   
     
  function addUpdateRecord()  {
	  var url="speciality/add";
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
     
    	
    	
    	
     
     function AddSpeciality() {
         $('#Specialityform').get(0).reset();      	
         $('#AddEditSpecialityModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#Specialityform').get(0).reset();
         var Row_Data = $("#multiple37").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
         CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),
         
         
         
         $('#isActive').val(Row_Data['isActive']);
         CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),
         
         $('#name').val(Row_Data['name']);
         CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditSpecialityModal').modal('show');
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
         	url: 'http://localhost:8080/MBC-Java/speciality/getSpeciality',              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'bannerContent', name: 'bannerContent', width: 150 },
               
                 { label: 'isActive', name: 'isActive', width: 150 },
                 { label: 'longDescription', name: 'longDescription', width: 150 },
                 { label: 'name', name: 'name', width: 150 },
                 { label: 'shortDescription', name: 'shortDescription', width: 150 },
                 { label: 'uploadImage', name: 'uploadImage', width: 150 },                 
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
     