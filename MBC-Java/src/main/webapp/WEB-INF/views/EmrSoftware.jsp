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
<div id="AddEditEmrSoftwareModal" class="modal fade" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">EmrSoftware Details</h4>
        </div>
        <form id="EmrSoftwareform" class="Form-horizontal"  method="post">
        <div class="modal-body">
               
         
            <input class="form-control" type="hidden" id="id" name="id" value=""/>
           
           
             <div class="form-group">
                <div class="col-sm-4">
                     	 EmrSoftware Name
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="name" name="name" value=""/>
                </div>
            </div>
            
           
           <div class="form-group">
                <div class="col-sm-4">
                    Logo
                </div>
                <div class="col-sm-8">

                    <input class="form-control"  type="file"   onchange="testUpload()" name="uploadImage" id="uploadImage" />
               
                
             
      
               <input class="form-control" type="hidden"  id="imagepath" name="imagepath"   />
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
                     	Description
                </div>
                <div class="col-sm-8">
                   
                       <textarea cols="80" class="ckeditor" id="DescriptionContent" name="DescriptionContent" rows="10" ></textarea>
	

                </div>
            </div>
            
            <div class="form-group">
                <div class="col-sm-4">
                    Recent Release
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="RecentRelease" name="RecentRelease" value=""/>
                </div>
            </div>  
            
            
              <div class="form-group">
                <div class="col-sm-4">
                    Latest Version
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="LatestVersion" name="LatestVersion" value=""/>
                </div>
            </div>  
            
            
             <div class="form-group">
                <div class="col-sm-4">
                    Certification
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="Certification" name="Certification" value=""/>
                </div>
            </div>  
            
            <div class="form-group">
                <div class="col-sm-4">
                    Certification Period
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="CertificationPeriod" name="CertificationPeriod" value=""/>
                </div>
            </div>  
            <div class="form-group">
                <div class="col-sm-4">
                  Environment Required
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="EnvironmentRequired" name="EnvironmentRequired" value=""/>
                </div>
            </div>  
         
         
         
          <div class="form-group">
                <div class="col-sm-4">
                 Integration
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="Integration" name="Integration" value=""/>
                </div>
            </div>  
            
            
            
             <div class="form-group">
                <div class="col-sm-4">
                 Support HospitalClaim
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="SupportHospitalClaim" name="SupportHospitalClaim" value=""/>
                </div>
            </div>  
  
            
             <div class="form-group">
                <div class="col-sm-4">
                   Features
                </div>
                <div class="col-sm-8">

  <textarea cols="80" class="ckeditor" id="Features" name="Features" rows="10" ></textarea>
	
   
                </div>
            </div>          
            
             
             <div class="form-group">
                <div class="col-sm-4">
               MarketReach
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="MarketReach" name="MarketReach" value=""/>
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
           CreateDate
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="CreateDate" name="CreateDate" value=""/>
                </div>
            </div>  
               <div class="form-group">
                <div class="col-sm-4">
           ModifiedDate
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="ModifiedDate" name="ModifiedDate" value=""/>
                </div>
            </div>  
            
            
            
              <div class="form-group">
                <div class="col-sm-4">
           SpecialtiesId
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="SpecialtiesId" name="SpecialtiesId" value=""/>
                </div>
            </div>  
                <div class="form-group">
                <div class="col-sm-4">
           IsPopular
                </div>
                <div class="col-sm-8">
                    <input class="form-control" type="text" id="isPopular" name="isPopular" value=""/>
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
     
      <button type="button" onclick="AddEmrSoftware()" class="btn btn-default" data-dismiss="modal">New User</button>
      <div style="margin-left:20px">
    <table id="multiple37"></table> <div class="pagination-div" id="pmultiple37" ></div>
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="../resources/admin/adminscript/EmrSoftware.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>