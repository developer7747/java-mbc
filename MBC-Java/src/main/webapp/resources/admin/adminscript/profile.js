// Helper function to serialize all the form fields into a JSON string
function formToJSON() {
	// alert(parseInt($('#isActive').val()));
	return JSON.stringify({
		"id" : $('#id').val(),
		"name" : $('#name').val(),
		"billersname" : $('#Billersname').val(),
		"metaDescription" : $('#metaDescription').val(),
		"metaKeyword" : $('#metaKeyword').val(),
		"bannerContent" : CKEDITOR.instances['bannerContent'].getData(),
		"heading" : $('#heading').val(),
		"shortDescription" : CKEDITOR.instances['shortDescription'].getData(),
		"longDescription" : CKEDITOR.instances['longDescription'].getData(),
		"imagepath" : $('#imagepath').val(),
		"profileAddress" : $('#ProfileAddress').val(),
		"phoneNumber" : $('#PhoneNumber').val(),
		"email" : $('#Email').val(),
		"zipcode" : $('#Zipcode').val(),
		"uploaddate" : $('#uploaddate').val(),
		"categoryid" : $('#categoryid').val(),
		"isActive" : $('#isActive').val(),
		"experience" : $('#Experience').val(),
		"software" : $('#Software').val(),
		"certification" : $('#Certification').val(),
		"specificInterest" : $('#SpecificInterest').val(),
		"status" : $('#Status').val()

	});
}

function addUpdateRecord() {
	var url = "Profile/add?specialityId=" + $('#SpecialityDrpdown').val()
			+ "&stateId=" + $('#StateDrpdown').val() + "&cityId="
			+ $('#CityDrpdown').val();

	//  var url="Profile/add";
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

$(document).ready(
		function() {
			$.getJSON(
					"http://localhost:8080/MBC-Java/speciality/getSpeciality1",
					function(data) {
						$.each(data, function(i, data) {
							//alert(data.name);
							$('<option>', {
								value : data.id,
								text : data.name
							}).html(data.name).appendTo("#SpecialityDrpdown");
						});

					});

		});

$(document).ready(function() {
	$.getJSON("http://localhost:8080/MBC-Java/state/getState1", function(data) {
		$.each(data, function(i, data) {
			//alert(data.name);
			$('<option>', {
				value : data.id,
				text : data.name
			}).html(data.name).appendTo("#StateDrpdown");
		});

	});

});

$(document).ready(function() {
	$.getJSON("http://localhost:8080/MBC-Java/city/getCity1", function(data) {
		$.each(data, function(i, data) {
			//alert(data.name);
			$('<option>', {
				value : data.id,
				text : data.cityName
			}).html(data.cityName).appendTo("#CityDrpdown");
		});

	});

});

function AddProfile() {
	$('#Profileform').get(0).reset();
	$('#AddEditProfileModal').modal('show');
}
function UpdateRecordPopup(RowID) {
	$('#Profileform').get(0).reset();
	var Row_Data = $("#multiple37").getRowData(RowID);
	$('#id').val(Row_Data['id']);
	//  CKEDITOR.instances['bannerContent'].setData(Row_Data['bannerContent']),

	$('#isActive').val(Row_Data['isActive']);
	CKEDITOR.instances['longDescription'].setData(Row_Data['longDescription']),

	$('#name').val(Row_Data['name']);
	CKEDITOR.instances['shortDescription']
			.setData(Row_Data['shortDescription']),

	$('#AddEditProfileModal').modal('show');
}

function displayButtons(cellvalue, options, rowObject) {
	var edit = "<span class='glyphicon glyphicon-edit' style='color:brown;cursor:pointer' onclick='UpdateRecordPopup("
			+ options.rowId + ")' >Edit </span>";
	return edit;
}

function testUpload() {
	var formData = new FormData($('#Profileform')[0]);
	// var url="Profile/add";
	var url = "http://localhost:8080/MBC-Java/Profile/upload";
	$.ajax({
		url : url,
		type : "POST",
		dataType : 'text',
		contentType : false,
		processData : false,
		cache : false,
		data : formData,
		success : function(response) {
			$("#imagepath").val(response)
			alert("success");
		},
		error : function() {
			alert("unable to create the record");
		}
	});
}

function pdfUpload() {
	var formData = new FormData($('#Profileform')[0]);
	// var url="Profile/add";
	var url = "http://localhost:8080/MBC-Java/Profile/pdfupload";
	$.ajax({
		url : url,
		type : "POST",
		dataType : 'text',
		contentType : false,
		processData : false,
		cache : false,
		data : formData,
		success : function(response) {
			alert("Pdf Uploaded successfully");
		},
		error : function() {
			alert("unable to create the record");
		}
	});
}

$(document).ready(function() {
	$("#multiple37").jqGrid({
		url : 'http://localhost:8080/MBC-Java/Profile/getProfile',
		mtype : "GET",
		styleUI : 'Bootstrap',
		datatype : "json",
		colModel : [ {
			label : 'id',
			name : 'id',
			key : true,
			width : 75
		}, {
			label : 'bannerContent',
			name : 'bannerContent',
			width : 150
		}, {
			label : 'name',
			name : 'name',
			width : 150
		}, {
			label : 'metaDescription',
			name : 'metaDescription',
			width : 150
		}, {
			label : 'metaKeyword',
			name : 'metaKeyword',
			width : 150
		}, {
			label : 'linkurl',
			name : 'linkurl',
			width : 150
		}, {
			label : 'heading',
			name : 'heading',
			width : 150
		}, {
			label : 'uploadImage',
			name : 'uploadImage',
			width : 150
		},

		{
			label : 'longDescription',
			name : 'longDescription',
			width : 150
		},

		{
			label : 'shortDescription',
			name : 'shortDescription',
			width : 150
		}, {
			label : 'uploadImage',
			name : 'uploadImage',
			width : 150
		},

		{
			label : 'pdfupload',
			name : 'pdfupload',
			width : 150
		}, {
			label : 'uploaddate',
			name : 'uploaddate',
			width : 150
		}, {
			label : 'categoryid',
			name : 'categoryid',
			width : 150
		}, {
			label : 'specialityid',
			name : 'specialityid',
			width : 150
		}, {
			label : 'isActive',
			name : 'isActive',
			width : 150
		},

		{
			label : 'Action',
			name : 'Action',
			width : 82,
			formatter : displayButtons
		}, ],
		autowidth : true,
		viewrecords : true,
		height : "auto",
		//multiselect: true,
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
