
     
  // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val(),
        	 "cityZipCode": $('#CityZipCode').val(),  
             "citylongDescription": CKEDITOR.instances['CitylongDescription'].getData(),         
             "cityshortDescription": CKEDITOR.instances['CityshortDescription'].getData(),       
             "cityName": $('#cityName').val(),
             "stateId": $('#stateDrpdown').val()
         });
     }   
     
  function addUpdateRecord()  {
	  var url="city/add";
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
         $('#AddEditCityModal').modal('show');
     }
     function UpdateRecordPopup(RowID)
     {
    	 $('#stateform').get(0).reset();
         var Row_Data = $("#city_JQ_Grid").getRowData(RowID);         
         $('#id').val(Row_Data['id']);
    
         
         $('#cityZipCode').val(Row_Data['cityZipCode']);
         CKEDITOR.instances['citylongDescription'].setData(Row_Data['citylongDescription']),
         
         CKEDITOR.instances['cityshortDescription'].setData(Row_Data['cityshortDescription']),
         $('#cityName').val(Row_Data['cityName']);
         $('#isActive').val(Row_Data['isActive']);
         $('#isPopular').val(Row_Data['isPopular']);         
        // $('#shortDescription').val(Row_Data['shortDescription']);         
         $('#AddEditCityModal').modal('show');
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
    	 $.getJSON("http://localhost:8080/MBC-Java/state/getState1", function (data)  
    		        {        
    		            $.each(data, function (i, data)  
    		            {       
    		            	alert(data.name);
    		                 $('<option>',  
    		                    {  
    		                        value: data.id,  
    		                        text: data.name  
    		                    }).html(data.name).appendTo("#stateDrpdown");  
    		                });  
    		        })  ;
    		        
    		        
    		         
    	 
    	 

         $("#city_JQ_Grid").jqGrid({
         	url: 'http://localhost:8080/MBC-Java/city/getcity',              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'cityZipCode', name: 'cityZipCode', width: 150 },
                 { label: 'citylongDescription', name: 'citylongDescription', width: 150 },
                 { label: 'cityshortDescription', name: 'cityshortDescription', width: 150 },
                 { label: 'cityName', name: 'cityName', width: 150 },
                 { label: 'isActive', name: 'isActive', width: 150 },
                 { label: 'isPopular', name: 'isPopular', width: 150 },
                 { label: 'stateIdIndex', name: 'stateIdIndex', width: 150 },                 
                 { label: 'Action', name: 'Action', width: 82, formatter: displayButtons },
             ],
             autowidth: true,
             viewrecords: true,
             height: "auto",
             //multiselect: true,
             multiboxonly: true,
             pager: "#pcity_JQ_Grid",
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
     