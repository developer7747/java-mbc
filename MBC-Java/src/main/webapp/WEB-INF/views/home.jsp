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
<div id="AddEditStateModal" class="modal fade" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">User Information</h4>
        </div>
        <form id="stateform"  method="post">
        <div class="modal-body">
               
         
            <input class="form-control" type="text" id="id" name="id" value=""/>
           
           
             <div class="form-group">
                <div class="col-sm-4">
                     	   name
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="name" name="name" value=""/>
                </div>
            </div>
            
           
           
          
           
           
            <div class="form-group">
                <div class="col-sm-4">
                     	bannerContent
                </div>
                <div class="col-sm-8">
                   
                       <textarea cols="80" class="ckeditor" id="bannerContent" name="bannerContent" rows="10" ></textarea>
	

                </div>
            </div>
            
            
            <div class="form-group">
                <div class="col-sm-4">
                    intial
                </div>
                <div class="col-sm-8">
               <input class="form-control" type="text" id="intial" name="intial" value=""/>
               

	

                </div>
            </div>
            
             <div class="form-group">
                <div class="col-sm-4">
                    shortDescription
                </div>
                <div class="col-sm-8">

  <textarea cols="80" class="ckeditor" id="shortDescription" name="shortDescription" rows="10" ></textarea>
	
   
                </div>
            </div>          
            
 <div class="form-group">
                <div class="col-sm-4">
                     	   longDescription
                </div>
                <div class="col-sm-8">
              <textarea cols="80" class="ckeditor" id="longDescription" name="longDescription" rows="10" ></textarea>
                  
                 
                   
                </div>
            </div>
            

<div class="form-group">
                <div class="col-sm-4">
                    isActive
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="activeornot132" name="activeornot132" value=""/>
                </div>
            </div>   



<div class="form-group">
                <div class="col-sm-4">
                    uploadImage
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="uploadImage" name="uploadImage" value=""/>
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
    <table id="multiple37"></table> <div id="pmultiple37" ></div>
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="resources/admin/adminscript/state.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>