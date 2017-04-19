function addUpdateCommonRecord(url,data) {alert("common");
    	    console.log('addWine');
    	    $.ajax({
    	        type: 'POST',
    	        contentType: 'application/json',
    	        url: url,
    	        dataType: "json",
    	        data: formToJSON(),
    	        success: function(data, textStatus, jqXHR){
    	        	$('.modal').modal('hide');
    	            alert('Record saved successfully');
    	            jQuery(".ui-jqgrid-btable").trigger("reloadGrid");
    	            
    	           
//     	            $('#btnDelete').show();
//     	            $('#wineId').val(data.id);
    	        },
    	        error: function(jqXHR, textStatus, errorThrown){
    	            alert('error: ' + textStatus);
    	        }
    	    });
    	}

CKEDITOR.disableAutoInline = true;
CKEDITOR.replaceClass = 'ckeditor';
