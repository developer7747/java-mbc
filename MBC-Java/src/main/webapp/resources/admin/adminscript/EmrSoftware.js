
// Helper function to serialize all the form fields into a JSON string
function formToJSON() {
	// alert(parseInt($('#isActive').val()));
	return JSON.stringify({
		"id" : $('#id').val(),
		"name" : $('#name').val(),
		"logo" : $('#uploadImage').val(),
		"latestVersion" : $('#LatestVersion').val(),
		"certification" : $('#Certification').val(),
		"certificationPeriod" : $('#CertificationPeriod').val(),
		"environmentrequired" : $('#EnvironmentRequired').val(),
		"integration" : $('#Integration').val(),
	    "supportHospitalClaim" : $('#SupportHospitalClaim').val(),
		//"createDate" : $('#CreateDate').val(),
		//"modifiedDate" : $('#ModifiedDate').val(),
	     "specialtiesId" : $('#SpecialtiesId').val(),
		//"isPopular" : $('#isPopular').val(),
		//"isActive" : $('#isActive').val(),
		"description" : CKEDITOR.instances['DescriptionContent'].getData(),
		"features" : CKEDITOR.instances['Features'].getData(),
		"shortDescription" : CKEDITOR.instances['shortDescription'].getData(),
		"certificationType" : $('#CertificationType').val()
	});
}

function addUpdateRecord() {
	var url = "EmrSoftware/add";
	addUpdateCommonRecord(url, formToJSON())
}
function deleteRecord() {
	console.log('deleteRecord');
	$.ajax({
		type : 'DELETE',
		url : rootURL + '/' + $('#wineId').val(),
		success : function(data, textStatus, jqXHR) {
			alert('Record deleted successfully');
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('delete Record error');
		}
	});
}

function UpdateRecordPopup(RowID)
{
	 $('#EmrSoftwareform').get(0).reset();
    var Row_Data = $("#multiple37").getRowData(RowID);         
    $('#id').val(Row_Data['id']);
    
    
    
    $('#isActive').val(Row_Data['isActive']);
   
    $('#name').val(Row_Data['EmrSoftware Name']);
    CKEDITOR.instances['shortDescription'].setData(Row_Data['shortDescription']),
   // $('#shortDescription').val(Row_Data['shortDescription']);         
    $('#AddEditEmrSoftwareModal').modal('show');
}










function AddEmrSoftware() {
	$('#EmrSoftwareform').get(0).reset();
	$('#AddEditEmrSoftwareModal').modal('show');
}










$(document).ready(function() {
	$("#multiple37").jqGrid({
		url : hosting_url+"Admin/EmrSoftware/getEmrSoftware",
		mtype : "GET",
		styleUI : 'Bootstrap',
		datatype : "json",
		colModel : [ {
			label : 'id',
			name : 'id',
			key : true,
			width : 75
		}, {
			label : 'EmrSoftware Name',
			name : 'name',
			width : 150
		},

		{
			label : 'Logo',
			name : 'imagepath',
			width : 150
		}, {
			label : 'Description',
			name : 'descriptionContent',
			width : 150
		}, {
			label : 'Recent Release',
			name : 'recentRelease',
			width : 150
		}, {
			label : 'Latest Version',
			name : 'latestVersion',
			width : 150
		}, {
			label : 'Certification',
			name : 'certification',
			width : 150
		}, {
			label : 'Certification Period',
			name : 'certificationPeriod',
			width : 150
		}, {
			label : 'Environment Required',
			name : 'environmentRequired',
			width : 150
		}, {
			label : 'Integration',
			name : 'integration',
			width : 150
		}, {
			label : 'Support HospitalClaim',
			name : 'supportHospitalClaim',
			width : 150
		}, {
			label : 'Features',
			name : 'features',
			width : 150
		}, {
			label : 'MarketReach',
			name : 'marketReach',
			width : 150
		}, {
			label : 'CreateDate',
			name : 'createDate',
			width : 150
		}, {
			label : 'ModifiedDate',
			name : 'modifiedDate',
			width : 150
		}, {
			label : 'SpecialtiesId',
			name : 'speciality',
			width : 150
		}, {
			label : 'IsPopular',
			name : 'isPopular',
			width : 150
		}, {
			label : 'shortDescription',
			name : 'shortDescription',
			width : 150
		}, {
			label : 'Action',
			name : 'Action',
			width : 82,
			formatter : displayButtons
		}, ],
		autowidth : true,
		viewrecords : true,
		height : "auto",
		// multiselect: true,
		multiboxonly : true,
		pager : "#pmultiple37",
		rowNum : 10,
		rowList : [ 5, 10, 20, 30, 40 ],
		jsonReader : {
			root : "rows",
			page : "page",
			total : "total",
			records : "records",
			repeatitems : false,
			Id : "0"
		},
	});
});

function displayButtons(cellvalue, options, rowObject) {
	var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup("
			+ options.rowId + ")' >Edit </span>";
	return edit;
}

// We need to turn off the automatic editor creation first.

// CKEDITOR.replaceClass( 'ckeditor', {
// extraPlugins: 'sourcedialog',
// removePlugins: 'sourcearea'
// } );

function testUpload() {
	var formData = new FormData($('#EmrSoftwareform')[0]);
	// var url="EmrSoftware/add";
	var url = hosting_url+"Admin/EmrSoftware/upload";
	$.ajax({
		url : url,
		type : "POST",
		dataType : 'text',
		contentType : false,
		processData : false,
		cache : false,
		data : formData,
		success : function(response) {
			alert("success");
		},
		error : function() {
			alert("unable to create the record");
		}
	});
}
