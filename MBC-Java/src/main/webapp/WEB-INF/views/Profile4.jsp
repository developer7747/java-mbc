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
<div id="AddEditProfileModal" class="modal fade" role="dialog">
  <div class="modal-dialog" style=" width:90%;">

    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Profile Information</h4>
        </div>
        <form id="Profileform"  method="post">
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
            
           
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	 BillersName -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Billersname" name="Billersname" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
            
<!--               <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	MetaDescription -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="metaDescription" name="metaDescription" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
<!--               <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	MetaKeyword -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="metaKeyword" name="metaKeyword" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
            
           
          
           
           
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	BannerContent -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
                   
<!--                        <textarea cols="80" class="ckeditor" id="bannerContent" name="bannerContent" rows="10" ></textarea> -->
	

<!--                 </div> -->
<!--             </div> -->
            
            
           
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	Heading -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="heading" name="heading" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
           
            
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     shortDescription -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->

<!--   <textarea cols="80" class="ckeditor" id="shortDescription" name="shortDescription" rows="10" ></textarea> -->
	
   
<!--                 </div> -->
<!--             </div>           -->
            
<!--  <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	   longDescription -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--               <textarea cols="80" class="ckeditor" id="longDescription" name="longDescription" rows="10" ></textarea> -->
                  
                 
                   
<!--                 </div> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     uploadImage -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->

<!--                     <input class="form-control"  type="file"    onchange="testUpload()" name="uploadImage" id="uploadImage" /> -->
      
<!--                <input class="form-control" type="hidden"  id="imagepath" name="imagepath"   /> -->
        
                
<!--                 </div> -->
<!--             </div>  -->
            
            
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                    ProfileAddress -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="ProfileAddress" name="ProfileAddress" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
            
               
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                   PhoneNumber -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="PhoneNumber" name="PhoneNumber" value=""/> -->
<!--                 </div> -->
<!--             </div>   -->
            
            
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                Email -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Email" name="Email" value=""/> -->
<!--                 </div> -->
<!--             </div>     -->


 
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                Zipcode -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Zipcode" name="Zipcode" value=""/> -->
<!--                 </div> -->
<!--             </div>     -->
            
            
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     Upload Date -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="uploaddate" name="uploaddate" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
            
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     Category -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="categoryid" name="categoryid" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     isActive -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="isActive" name="isActive" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                   Experience -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Experience" name="Experience" value=""/> -->
<!--                 </div> -->
<!--             </div>   -->

<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                   Software -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Software" name="Software" value=""/> -->
<!--                 </div> -->
<!--             </div>   -->

<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                 Certification -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Certification" name="Certification" value=""/> -->
<!--                 </div> -->
<!--             </div>  <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                 Specific  Interest -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="SpecificInterest" name="SpecificInterest" value=""/> -->
<!--                 </div> -->
<!--             </div>   -->
            
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                 Status -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="Status" name="Status" value=""/> -->
<!--                 </div> -->
<!--             </div>   -->

<div class="form-group">
                <div class="col-sm-4">
                State
                </div>
                <div class="col-sm-8">

                <select id="StateDrpdown">
                   
                   </select>
                </div>
            </div>   
<div class="form-group">
                <div class="col-sm-4">
                City
                </div>
                <div class="col-sm-8">

                <select id="CityDrpdown">
                   
                   </select>
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
     
      <button type="button" onclick="AddProfile()" class="btn btn-default" data-dismiss="modal">New User</button>
      <div style="margin-left:20px">
    <table id="multiple37"></table> <div id="pmultiple37" ></div>
</div>   
    </section>

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <script src="resources/admin/adminscript/profile.js"></script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>