<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<jsp:include page="/WEB-INF/views/common/leftside.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      
      
      
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/jquery.jqGrid.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/ui.jqgrid-bootstrap.css"/>
     <link href="resources/admin/adminscript/date-picker/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />  
    <script src="resources/admin/adminscript/date-picker/bootstrap-datepicker.min.js" type="text/javascript"></script>        

<script src="resources/admin/adminscript/date-picker/components-date-time-pickers.min.js" type="text/javascript"></script>
     
    
   
   
   
<!-- Modal -->
<div id="AddEditSpecialityGuidelineModal" class="modal fade Form-horizontal" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Speciality Guideline  Information</h4>
        </div>
        <form id="SpecialityGuidelineform"  method="post">
        <div class="modal-body">
               
         
            <input class="form-control" type="hidden" id="id" name="id"   value=""/>
           
           
             <div class="form-group">
                <div class="col-sm-4">
                     	  Title
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="Title" name="Title" value=""/>
                </div>
            </div>
            
           
           
          
           
           
            <div class="form-group">
                <div class="col-sm-4">
                     	BannerContent
                </div>
                <div class="col-sm-8">
                   
                       <textarea cols="80" class="ckeditor" id="bannerContent" name="bannerContent" rows="10" ></textarea>
	

                </div>
            </div>
            
            
           
            
             <div class="form-group">
                <div class="col-sm-4">
                   ShortDescription
                </div>
                <div class="col-sm-8">

  <textarea cols="80" class="ckeditor" id="shortDescription" name="shortDescription" rows="10" ></textarea>
	
   
                </div>
            </div>          
            
 <div class="form-group">
                <div class="col-sm-4">
                     	  LongDescription
                </div>
                <div class="col-sm-8">
              <textarea cols="80" class="ckeditor" id="longDescription" name="longDescription" rows="10" ></textarea>
                  
                 
                   
                </div>
            </div>
            
  


<div class="form-group">
                <div class="col-sm-4">
                   Upload Date
                </div>
                <div class="col-sm-8">

<div id="defaultrange" class="input-group">
                                        
               
                          
                    <input type= "text"  name="uploadDate"  class="form-control form-control-inline input-medium date-picker" value = "" />
                        </div>
                </div>
            </div>   



<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     UploadImage -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="uploadImage" name="uploadImage" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
            
         <div class="form-group">
                <div class="col-sm-4">
                    UploadImage
                </div>
                <div class="col-sm-8">

                    <input class="form-control"  type="file"    onchange="testUpload()" name="uploadImage" id="uploadImage" />
      
               <input class="form-control" type="hidden"  id="imagepath" name="imagepath"   />
        
                
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
     
      <button type="button" onclick="AddSpecialityGuideline()" class="btn btn-default" data-dismiss="modal">New User</button>
      <div style="margin-left:20px">
    <table class="tb-header1" id="multiple37"></table> <div class="pagination-div" id="pmultiple37" ></div>
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="resources/admin/adminscript/specialityguideline.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>