
<jsp:include page="/WEB-INF/views/UI/Static-Pages/main-static.jsp" />

<div class="banner-inner baner-bg-dgray">
          	
            <style>
            .banner-thanks-area1
            {
            margin: 8% 0 0 -2%;
    padding: 12px 9px 11px 0;
    width: 90%;
                
                }
            
            
            </style>
            
            <div class="container">
            	<div class="col-sm-6">
               	  <h3 class="text-white">Contact Us</h3>
               	  	<div class="g-recaptcha"
									data-sitekey="6LeEDSUTAAAAAHM4ISRO_ItbCWPsc4XqZcUujZmI"></div>
                  <div class="banner-thanks-area banner-thanks-area1">
                  	<h4>Thank You for Your Interest in Our Services!</h4>
                    <h5>Medical billing services over 40 specialties across all 50 US States</h5>
                  </div>
                  <div class="row">
                    	
                  </div>
  </div>
<div class="col-sm-6">

<iframe allowfullscreen="" style="border:0" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3053.949863423269!2d-82.86978438514124!3d40.054219785531444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x883860569aec26d3%3A0x649633718cbcb0b8!2s%23208%2C+Gahanna%2C+OH+43230%2C+USA!5e0!3m2!1sen!2sin!4v1466058614015" frameborder="0" height="302" width="488"></iframe>
  <br>
   <!-- <small><a href="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d48887.26332000884!2d-82.880038!3d40.020643!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88386176b17c5fe5%3A0x174eec132a1ec812!2sGahanna%2C+OH%2C+USA!5e0!3m2!1sen!2sin!4v1466057170621">View Larger Map</a></small> -->


</div>
            </div>

            
        </div>
   <div class="container">
           <div class="white-section"> 
            <div class="row">
            	 <div class="col-sm-6"><div class="contact-form-area">
                
                      
<script type="text/javascript">
    function Check(textBox, maxLength) {
        if (textBox.value.length > maxLength) {
            textBox.value = textBox.value.substr(0, maxLength);
        }
    }

</script>
<div id="ctl00_ContentPlaceHolder1_centerform_UpdatePanel1">
	
        <!-- form -->
        
        
        
        
        
        <form action="contact-us" method="POST">
        
        
		<div>

			<div>

				<div class="">
					<div class="col-sm-12">
						<p id="contact"
							style="color: White; padding-left: 218px; font-weight: bold;">CONTACT
							US NOW</p>
					</div>




					<div class="col-sm-6">
						<select class="form-control selected" name="Lead_Type">
							<option selected="selected" value="--Select--">What are
								you looking for</option>
							<option value="Billing services"
								title="Billing services for your Practice">Billing
								services for your Practice</option>
							<option value="Inhouse billers"
								title="In-house Medical Biller for your Practice">In-house
								Medical Biller for your Practice</option>
							<option value="seeking Job" title="Medical Billing / Coding Jobs">Medical
								Billing / Coding Jobs</option>
							<option value="Training"
								title="Medical Billing / ICD-10 Training">Medical
								Billing / ICD-10 Training</option>
							<option value="other" title="Other">Other</option>

						</select>
					</div>
					




						<div class="col-sm-6"></div>
					</div>
					<div class="col-sm-6">

						<select name="StateId"  class="form-control selected"
							onchange="changeFunc()">
							<c:forEach items="${listStates}" var="Specialityies">
								<option value="${Specialityies.id}">${Specialityies.customname}</option>
							</c:forEach>
						</select>



					</div>

					<div class="col-sm-6">

						<input type="text"  required="" name="Contact_Name" class="form-control"
						
							size="20" placeholder="Name" maxlength="50" />

					</div>

					<div class="col-sm-6">
						<select name="cateId" class="form-control selected">

							<option value="--Speciality--">--Speciality--</option>
							<c:forEach items="${listSpecialitys}" var="sp">
								<option value="${sp.id}">${sp.customName}</option>
							</c:forEach>

						</select>

					</div>
					<div class="col-sm-6">
						<input name="Email_ID" required="" type="text" maxlength="50"
							class="form-control" size="28" placeholder="Email ID">
					</div>
					<div class="col-sm-6">

						<input name="Contact_No" required="" type="text" maxlength="10"
							class="form-control" placeholder="Contact Number">

						<div class="row">
							<div class="col-sm-6">
							
							</div>
							<div class="col-sm-6"></div>
						</div>
					</div>
					<div class="col-sm-6">

						<textarea name="Requirement" rows="3" cols="20"
							class="form-control"
							placeholder="Best time to call? Please Briefly Describe your requirements"></textarea>

					</div>

					<div class="col-sm-6"></div>
					<div class="col-md-offset-4 col-md-4">

						<input type="Submit" class="btn btn-success" value="Submit">
					</div>
					<div class="col-sm-12"></div>
				</div>

			</div>

		</div>
	</form>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
       
       
<!--     end -->
</div>
   </div></div>
                     
                     <div class="col-sm-6">
<ul class="contact-lists">

<strong style="margin: 0px 340px 0px 0px;">Wilmington:</strong><br>
                        	
                           <li style="margin: 0px 189px 0px 0px;text-align: left;">
  108 West, 13th street, Wilmington, DE 19801 <br></li>
  <br>
  
 
 <strong style="margin: 0px 380px 0px 0px;text-align: left;">Ohio:</strong>
 <li>
  4625 Morse RD., Suite 208, Gahanna, Ohio  43230
</li>
 <li style="text-align: left;">info@medicalbillersandcoders.com <br>
                           Fax no. 888-316-4566 <br>
                       Tollfree no. 888-357-3226</li>
                        </ul></div>
                     
                     
                	
                    
             
            
           </div> 
        
        </div>
       
    </div>
	<jsp:include page="/WEB-INF/views/UI/footer.jsp" />
	</body>
	</html>