<jsp:include page="/WEB-INF/views/common/header.jsp"/>

<jsp:include page="/WEB-INF/views/common/leftside.jsp"/>

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <link rel="stylesheet" href="<c:url value="/resources/admin/common-cs/common.css"/>">
     
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/jquery.jqGrid.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="http://www.workflow.dhsmedicalbilling.com/Content/JQGrid/ui.jqgrid-bootstrap.css"/>
     
     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
   
   
<%--    <form method="POST" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data"> --%>
<!--     <input type="file" name="file" /><br/><br/> -->
<!--     <input type="submit" value="Submit" /> -->
<!-- </form> -->
   
<!-- Modal -->
<script>


</script>
<!-- <form id="uploadForm"> -->
<!--      <input type="file" name="myimage" id="imageid" accept=".png" /> -->
<!--      <input id="bt" type="button"  value="s"/> -->
<!-- </form> -->

<!-- <div id="AddEditStateModal" class="Form-horizontal" class="modal fade" role="dialog"> -->
<!--   <div class="modal-dialog" style=" width:90%;"> -->

<!--     Modal content -->
<!--     <div class="modal-content"> -->
<!--         <div class="modal-header"> -->
<!--             <button type="button" class="close" data-dismiss="modal">&times;</button> -->
<!--             <h4 class="modal-title">User Information</h4> -->
<!--         </div> -->
<!--         <form id="stateform"  method="post"> -->
<!--         <div class="modal-body"> -->
               
         
<!--             <input class="form-control" type="text" id="id" name="id" value=""/> -->
           
           
         
<!--              <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	   name -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="name" name="name" value=""/> -->
<!--                 </div> -->
<!--             </div> -->
            
           
           
          
           
           
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                      	bannerContent -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
                   
<!--                        <textarea cols="80" class="ckeditor" id="bannerContent" name="bannerContent" rows="10" ></textarea> -->
	

<!--                 </div> -->
<!--             </div> -->
            
            
<!--             <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     intial -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                <input class="form-control" type="text" id="intial" name="intial" value=""/> -->
               

	

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
            

<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     isActive -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="activeornot132" name="activeornot132" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->



<!-- <div class="form-group"> -->
<!--                 <div class="col-sm-4"> -->
<!--                     uploadImage -->
<!--                 </div> -->
<!--                 <div class="col-sm-8"> -->
<!--                     <input class="form-control" type="text" id="uploadImage" name="uploadImage" value=""/> -->
<!--                 </div> -->
<!--             </div>    -->
            
         










<!--         </div> -->
<!--             <div class="modal-footer"> -->
<!--                 <button class="btn btn-theme" onclick="addUpdateRecord();" type="button">Submit</button> -->
<!--                 <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
<!--             </div> -->
<!--        </form> -->
<!--     </div> -->

<!--   </div> -->
<!-- </div> -->
<!-- <!--  End Bootstrap modal --> 
     
<!--       <button type="button" onclick="AddState()" class="btn btn-default" data-dismiss="modal">New User</button> -->
<!--       <div style="margin-left:20px"> -->
<!--     <table id="multiple37"></table> <div id="pmultiple37" ></div> -->
<!-- </div>    -->
<!--     </section> -->

    <!-- Main content -->
   
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
<!--  <script src="resources/admin/adminscript/state.js"></script> -->

















<!--  <main class="cd-main-content"> -->

<!--         <div class="banner-section"> -->
<!--             <div class="container"> -->
                <?php include ('includes/header-area.php'); ?>

<!--                 <div class="banner-meta"> -->
<!--                 <div class=""> -->
<!--                         <div class="icon-box"> -->
<!--                             <div class="row"> -->


<!--                                 <div class="col-xs-6 col-sm-6 col-md-3 patch-1"> -->
<!--                                     <a data-toggle="modal" href="#responsive"> -->
<!--                                     <div class="icon-cont"><img src="images/icon-1.png"></div> -->
<!--                                     <div class="text-cont">Medical Billing Services</div> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 <div class="col-xs-6 col-sm-6 col-md-3 patch-2"> -->
<!--                                     <a href="#"> -->
<!--                                     <div class="icon-cont"><img src="images/icon-2.png"></div> -->
<!--                                     <div class="text-cont">RCM Services</div> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="row"> -->
<!--                                 <div class="col-xs-6 col-sm-6 col-md-3 patch-3"> -->
<!--                                     <a href="#"> -->
<!--                                     <div class="icon-cont"><img src="images/icon-3.png"></div> -->
<!--                                     <div class="text-cont">Medical Coding Services</div> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 <div class="col-xs-6 col-sm-6 col-md-3 patch-4"> -->
<!--                                     <a href="#"> -->
<!--                                     <div class="icon-cont"><img src="images/icon-4.png"></div> -->
<!--                                     <div class="text-cont">Medical Health Records</div> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->





<!--             </div> -->




<!--         </div>/.banner-section end -->

<!--         <div class="site-info"> -->
<!--             <div class="container"> -->
<!--                 <div class="row"> -->
<!--                     <div class="col-xs-6 col-sm-3 col-md-3"> -->
<!--                         <div class="row"> -->
<!--                             <div class="col-xs-3 col-md-4 num-cont">16</div> -->
<!--                             <div class="col-xs-9 col-md-8 text-cont"><p>Years of Experience</p></div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-xs-6 col-sm-3"> -->
<!--                         <div class="row"> -->
<!--                             <div class="col-xs-3 col-md-4 num-cont">40</div> -->
<!--                             <div class="col-xs-9 col-md-8 text-cont"><p>Specialities we Handle</p></div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-xs-6 col-sm-3"> -->
<!--                         <div class="row"> -->
<!--                             <div class="col-xs-3 col-md-4 num-cont">50</div> -->
<!--                             <div class="col-xs-9 col-md-8 text-cont"><p>States, Our Presence</p></div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-xs-6 col-sm-3"><a href="#" class="support">24/7 Support</a></div> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </div>/.site-info end -->

<!--         <div class="white-section"> -->
<!--             <div class="container"> -->
<!--             <h1>Save 35%</h1>  -->
<!--             <p class="lead">by hiring us as Your Billing Partner</p> -->
<!--             <p>Medicalbillersandcoders.com is the ultimate Medical Billing organization in US with incomparable expertise in all areas of billing & coding. Our billing specialists provide support to practitioners based in all states & our experts handle billing for over 40 specialties.</p> -->

<!--             Hundreds of physician groups, Clinics & Hospitals have been benefited from the revenue management accuracy & expertise provided by us. -->
<!--             </div> -->

<!--             <div class="gray-section"> -->
<!--                 <div class="container"> -->
<!--                     <div class="row"> -->
<!--                         <div class="col-md-6"><a href="#">Why Physicians prefer our RCM Services?</a></div> -->
<!--                         <div class="col-md-6"><a href="#">Upgrading to ICD-10</a></div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </div>/.gray-section end -->
<!--         </div>/.white-section end -->

<!--         <div class="green-section"> -->
<!--             <div class="container"> -->
<!--                 <h1>A WIDE LOOK ON SERVICES WE OFFER</h1> -->
<!--                 <p>MBC is the ultimate Medical Billing organization in US with incomparable expertise in all areas of billing & coding. Our billing specialists provide support to practitioners based in all states & our experts handle billing for over 40 specialties.</p> -->

<!--                 <p>Hundreds of physician groups, Clinics & Hospitals have been benefited from the revenue management accuracy & expertise provided by us.</p> -->
<!--                 <div class="row sq-box-cont"> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-5.png"></div> -->
<!--                             <h2>RCM</h2> -->
<!--                             <p>We connect medical billers and coders with industry practitioners across all 50 US states and nearly 42 specialties!</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-6.png"></div> -->
<!--                             <h2>Medical Billing</h2> -->
<!--                             <p>Our Billers can take care of your end to end Medical Billing requirements services or  support your practice where the practice is overloaded.</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-7.png"></div> -->
<!--                             <h2>ICD-10</h2> -->
<!--                             <p>The most important step in a long journey is always the first! We call upon Medical Billing & Coding Professionals.</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="row sq-box-cont"> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-8.png"></div> -->
<!--                             <h2>Consultancy</h2> -->
<!--                             <p>We connect medical billers and coders with industry practitioners across all 50 US states and nearly 42 specialties!</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-9.png"></div> -->
<!--                             <h2>EHR</h2> -->
<!--                             <p>Our Billers can take care of your end to end Medical Billing requirements services or  support your practice where the practice is overloaded.</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                     <div class="col-md-12 col-sm-4 col-md-4"> -->
<!--                         <div class="box"> -->
<!--                             <div class="icon-cont"><img src="images/icon-10.png"></div> -->
<!--                             <h2>Medical Coding</h2> -->
<!--                             <p>The most important step in a long journey is always the first! We call upon Medical Billing & Coding Professionals.</p> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </div>/.gray-section end -->

<!--         <div class="gray-icon-section"> -->
<!--             <h1>Most Trusted Billing Provider nationwide</h1> -->
<!--             <div class="container"> -->
<!--                 <div class="col-md-4"> -->
<!--                     <div class="box box-co-1"> -->
<!--                         <div class="icon-cont"><img src="images/icon-11.png"></div> -->
<!--                         <h2>Specialty We Excel</h2> -->
<!--                         <ul class="clearfix"> -->
<!--                             <li><a href="#">Internal medicine</a></li> -->
<!--                             <li><a href="#">Cardiology</a></li> -->
<!--                             <li><a href="#">Podiatry</a></li> -->
<!--                             <li><a href="#">Family practice</a></li> -->
<!--                             <li><a href="#">Radiology</a></li> -->
<!--                             <li><a href="#">Orthopedic</a></li> -->
<!--                         </ul> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4"> -->
<!--                     <div class="box box-co-2"> -->
<!--                         <div class="icon-cont"><img src="images/icon-12.png"></div> -->
<!--                         <h2>States We Dominate</h2> -->
<!--                         <ul class="clearfix"> -->
<!--                             <li><a href="#">Ohio </a></li> -->
<!--                             <li><a href="#">Florida</a></li> -->
<!--                             <li><a href="#">Texas</a></li> -->
<!--                             <li><a href="#">New York</a></li> -->
<!--                             <li><a href="#">New Jersey</a></li> -->
<!--                             <li><a href="#">Pennsylvania</a></li> -->
<!--                         </ul> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-md-4"> -->
<!--                     <div class="box box-co-3"> -->
<!--                         <div class="icon-cont"><img src="images/icon-13.png"></div> -->
<!--                         <h2>Save Money</h2> -->
<!--                         <ul class="clearfix"> -->
<!--                             <li><a href="#">Flat 4.5 Charge </a></li> -->
<!--                             <li><a href="#">AR Clean Up </a></li> -->
<!--                             <li><a href="#">30% OFF on your first 3 invoices</a></li> -->
<!--                             <li><a href="#">Free Billing Services </a></li> -->
<!--                             <li><a href="#">AR Cleanup First</a></li> -->
<!--                             <li><a href="#">40% Discount for Social Media</a></li> -->
<!--                         </ul> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </div>/.gray-section end -->



<!-- <!-- pop up content start--> -->
<!-- <div id="responsive" class="modal fade" tabindex="-1" aria-hidden="true"> -->
<!--     <div class="modal-dialog"> -->
<!--         <div class="modal-content"> -->
<!--             <div class="modal-header"> -->
<!--                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button> -->
                
<!--             </div> -->
<!--             <div class="modal-body"> -->
<!--                 <div class="scroller" style="height:210px; overflow:auto;" data-always-visible="1" data-rail-visible1="1"> -->
                    
<!--                             <div class="popup-box-content"> -->
<!--                                 <div class="popup-box-blue"> -->
<!--                                     <h3>Physician Services</h3> -->
<!--                                     <h5>title and short description</h5> -->
<!--                                     <button class="btn"><a href="#">see more...</a></button> -->
<!--                                 </div> -->
<!--                             </div> -->
                        
<!--                             <div class="popup-box-content"> -->
<!--                                 <div class="popup-box-green"> -->
<!--                                     <h3>Jobs</h3> -->
<!--                                     <h5>title and short description</h5> -->
<!--                                     <button class="btn"><a href="#">see more...</a></button> -->
<!--                                 </div> -->
<!--                             </div> -->
                        
<!--                             <div class="popup-box-content"> -->
<!--                                 <div class="popup-box-gray"> -->
<!--                                     <h3>ICD-10</h3> -->
<!--                                     <h5>title and short description</h5> -->
<!--                                     <button class="btn"><a href="#">see more...</a></button> -->
<!--                                 </div> -->
<!--                             </div> -->

<!--                 </div> -->
<!--             </div> -->
            
<!--         </div> -->
<!--     </div> -->
<!-- </div> -->
<!-- <!-- pop up content start--> -->

        <?php include ('includes/footer.php'); ?>

<!--     </main>/.cd-main-content end -->
    
<!-- <div class="navigation-area">     -->
	<?php include ('includes/navigation.php'); ?>
<!-- </div> -->
      
      
<!--     jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!--     <script src="libraries/jquery-1.11.1.min.js"></script> -->
<!--     Include all compiled plugins (below), or include individual files as needed -->
<!--     <script src="libraries/bootstrap/js/bootstrap.min.js"></script> -->
    
<!--     Dropdown Menu -->
<!--     <script src="libraries/menu/js/cbpHorizontalMenu.min.js"></script> -->
<!--     <script src="libraries/new-menu.js"></script> -->
    
<!-- 	<script src="libraries/sliding-reload/slidingwithreload.js"></script> -->
  





























<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
</body>
</html>