<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<jsp:include page="/WEB-INF/views/common/leftside.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      
      
      
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/jquery.jqGrid.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/ui.jqgrid-bootstrap.css"/>
     
     
<!--      <form id="uploadForm"> -->
<!--      <input type="file" name="myimage" id="imageid" accept=".png" /> -->
<!--      <input id="bt" type="button"  value="s"/> -->
<!-- </form> -->
   
   
   
<!-- Modal -->
<div id="AddEditPressReleaseModal"   class="modal fade Form-horizontal" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Press Release </h4>
        </div>
        <form id="PressReleaseform"  method="post">
        <div class="modal-body">
               
         
            <input class="form-control" type="hidden" id="id" name="id" value=""/>
           
           
             <div class="form-group">
                <div class="col-sm-4">
                     	   Name
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="name" name="name" value=""/>
                </div>
            </div>
            
           
           
          
           
           
            <div class="form-group">
                <div class="col-sm-4">
                     	Banner Content
                </div>
                <div class="col-sm-8">
                   
                       <textarea cols="80" class="ckeditor" id="bannerContent" name="bannerContent" rows="10" ></textarea>
	

                </div>
            </div>
            
            
           
             <div class="form-group">
                <div class="col-sm-4">
                     	   MetaDescription
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="metaDescription" name="metaDescription" value=""/>
                </div>
            </div>
              <div class="form-group">
                <div class="col-sm-4">
                     	   MetaKeyword
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="metaKeyword" name="metaKeyword" value=""/>
                </div>
            </div>
            
           
            <div class="form-group">
                <div class="col-sm-4">
                     	 Linkurl
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="linkurl" name="linkurl" value=""/>
                </div>
            </div>
           
           <div class="form-group">
                <div class="col-sm-4">
                     	Heading
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="heading" name="heading" value=""/>
                </div>
            </div>
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	BannerContent -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="bannerContent" name="bannerContent" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
           
           
           
            
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
                   IsActive
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="isActive" name="isActive" value=""/>
                </div>
            </div>   


<div class="form-group">
                <div class="col-sm-4">
                    Upload Date
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="uploaddate" name="uploaddate" value=""/>
                </div>
            </div>   

<div class="form-group">
                <div class="col-sm-4">
                    Category
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="categoryid" name="categoryid" value=""/>
                </div>
            </div>   
<div class="form-group">
                <div class="col-sm-4">
                  Speciality
                </div>
                <div class="col-sm-8">
<!--                     <input class="form-control" type="text" id="specialityid" name="specialityid" value=""/> -->
                <select id="SpecialityDrpdown">
                   
                   </select>
                </div>
            </div>   


<div class="form-group">
                <div class="col-sm-4">
                    UploadImage
                </div>
                <div class="col-sm-8">

                    <input class="form-control"  type="file"    onchange="testUpload()" name="uploadImage" id="uploadImage" />
      
               <input class="form-control" type="hidden"  id="imagepath" name="imagepath"   />
        
                
                </div>
            </div>   
            
         <div class="form-group">
                <div class="col-sm-4">
                    Pdf Upload
                </div>
                <div class="col-sm-8">

                    <input class="form-control"  type="file"   onchange="pdfUpload()" name="pdfupload" id="pdfupload" />

               
                
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
     
   
     
     
      <button type="button" onclick="AddPressRelease()" class="btn btn-default" data-dismiss="modal">New PR</button>
      <div style="margin-left:20px">
    <table id="multiple37"  ></table> <div  class="pagination-div" id="pmultiple37" ></div>
<!-- #535F6B     -->
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="resources/admin/adminscript/pressRelease.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>