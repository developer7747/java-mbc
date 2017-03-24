<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<jsp:include page="/WEB-INF/views/common/leftside.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      
      
      
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/jquery.jqGrid.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/ui.jqgrid-bootstrap.css"/>
     
     
     
   
   
   
<!-- Modal -->
<div id="AddEditCityModal" class="modal fade" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">City Information</h4>
        </div>
        <form id="stateform"  method="post">
        <div class="modal-body">
               
         
            <input class="form-control" type="text" id="id" name="id" value=""/>
           
           
             <div class="form-group">
                <div class="col-sm-4">
                     	   name
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="cityName" name="cityName" value=""/>
                </div>
            </div>
            
            
            
                <div class="form-group">
                <div class="col-sm-4">
                     	   State
                </div>
                <div class="col-sm-8">
                   <select id="stateDrpdown">
                   
                   </select>
                </div>
            </div>
            
           
           
          
           
           
            <div class="form-group">
                <div class="col-sm-4">
                     	CityshortDescription
                </div>
                <div class="col-sm-8">
                   
                       <textarea cols="80" class="ckeditor" id="CityshortDescription" name="CityshortDescription" rows="10" ></textarea>
	

                </div>
            </div>
            
            
            
            
             <div class="form-group">
                <div class="col-sm-4">
                    CitylongDescription
                </div>
                <div class="col-sm-8">

  <textarea cols="80" class="ckeditor" id="CitylongDescription" name="CitylongDescription" rows="10" ></textarea>
	
   
                </div>
            </div>          
            

            

<div class="form-group">
                <div class="col-sm-4">
                    CityZipCode
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="CityZipCode" name="CityZipCode" value=""/>
                </div>
            </div>   



<div class="form-group">
                <div class="col-sm-4">
                    isPopular
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="isPopular" name="isPopular" value=""/>
                </div>
            </div>   
            
            
            <div class="form-group">
                <div class="col-sm-4">
                    isActive
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="isActive" name="isActive" value=""/>
                </div>
            </div> 

        </div>
            <div class="modal-footer">
                <button class="btn btn-theme" onclick="addUpdateRecord();" type="button">Submit</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
       </form>
    </div>

  </div>
</div>
<!--  End Bootstrap modal -->
     
      <button type="button" onclick="AddState()" class="btn btn-default" data-dismiss="modal">New User</button>
      <div style="margin-left:20px">
    <table id="city_JQ_Grid"></table> <div id="pcity_JQ_Grid" ></div>
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="resources/admin/adminscript/city.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>