
     
     // Helper function to serialize all the form fields into a JSON string
     function formToJSON() {
    	// alert(parseInt($('#isActive').val()));
         return JSON.stringify({
        	 "id": $('#id').val()
//"name": $('#name').val(),
//       	   "Logo": $('#Logo').val(),
//        	   "LatestVersion": $('#LatestVersion').val(),  
//        	   "Certification": $('#Certification').val(),  
//      	   "CertificationPeriod": $('#CertificationPeriod').val(),
//       	   "EnvironmentRequired": $('#EnvironmentRequired').val(),
//        	   "Integration": $('#Integration').val(),
////        	   "SupportHospitalClaim": $('#SupportHospitalClaim').val(),
////        	   "CreateDate": $('#CreateDate').val(),
////        	   "ModifiedDate": $('#ModifiedDate').val(),
////        	   "SpecialtiesId": $('#SpecialtiesId').val(),
////        	   "isPopular": $('#isPopular').val(),
////             "Description": CKEDITOR.instances['DescriptionContent'].getData(),
////             "Features": CKEDITOR.instances['Features'].getData()
//            
             
         });
     }   
     
  function addUpdateRecord()  {
	  var url="EmrSoftware/add";
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
     
    	
    	
     
     function AddEmrSoftware() {
         $('#EmrSoftwareform').get(0).reset();      	
         $('#AddEditEmrSoftwareModal').modal('show');
     }
     
     
     $(document).ready(function () {         
         $("#multiple37").jqGrid({
         	url: 'http://localhost:8080/MBC-Java/emrsoftware/getEmrSoftware',              
             mtype: "GET",
             styleUI: 'Bootstrap',
             datatype: "json",
             colModel: [
                 { label: 'id', name: 'id', key: true, width: 75 },
                 { label: 'EmrSoftware Name', name: 'name', width: 150 },
               
                 { label: 'Logo', name: 'uploadImage', width: 150 },
                 { label: 'Description', name: 'DescriptionContent', width: 150 },
                 { label: 'Recent Release', name: 'RecentRelease', width: 150 },
                 { label: 'Latest Version', name: 'LatestVersion', width: 150 },
                 { label: 'Certification', name: 'Certification', width: 150 },    
                 { label: 'Certification Period', name: 'CertificationPeriod', width: 150 }, 
                 { label: 'Environment Required', name: 'EnvironmentRequired', width: 150 },  
                 { label: 'Integration', name: 'Integration', width: 150 }, 
                 { label: 'Support HospitalClaim', name: 'SupportHospitalClaim', width: 150 },
                 { label: 'Features', name: 'Features', width: 150 },
                 { label: 'MarketReach', name: 'MarketReach', width: 150 },
                 { label: 'CreateDate', name: 'CreateDate', width: 150 },
                 { label: 'ModifiedDate', name: 'ModifiedDate', width: 150 },
                 { label: 'SpecialtiesId', name: 'SpecialtiesId', width: 150 },
                 { label: 'IsPopular', name: 'isPopular', width: 150 },
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
    	 var formData = new FormData($('#EmrSoftwareform')[0]);
		 // var url="EmrSoftware/add";
	var url="http://localhost:8080/MBC-Java/EmrSoftware/upload";
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
     }
     
    
     
     
     
     
     
     