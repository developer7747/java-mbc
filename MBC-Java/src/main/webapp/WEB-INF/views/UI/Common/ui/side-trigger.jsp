
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<script type="text/javascript">
         
     function Redirect() {
         //window.location = ('http://www.medicalbillersandcoders.com/dme-billing-services-blog', '_blank');

         window.open('http://www.medicalbillersandcoders.com/dme-billing-services-blog', '_blank');
         
     }

     function Redirect2() {
         //window.location = "Searching.aspx";

         window.open('http://www.medicalbillersandcoders.com/blog', '_blank');
         
     }
         
         
      </script>

<style>
#ctl00_oSlideTrigger_A1 {
	margin: 0px 8px !important;
}

#ctl00_oSlideTrigger_A2 {
	width: 43% !important;
}
</style>

<div class="side-trigger">

	<ul>
		<li><a href="#side-content-1" class="side-trigger-link"><i
				class="fa"> <img
					src="${pageContext.request.contextPath}/resources/ui/images/a-contact.png"
					alt="contact us"></i></a></li>
		<li><a href="#side-content-2" class="side-trigger-link"><i
				class="fa"> <img
					src="${pageContext.request.contextPath}/resources/ui/images/share.png"
					alt="share"></i></a></li>

		<!--  search -->
		<%-- <li><a href="#side-content-3"  target="_blank" class="side-trigger-link"><i class="glyphicon glyphicon-search"></i></a></li>working --%>


		<li><a href="#side-content-4" class="side-trigger-link"><i
				class="glyphicon icon-blog"></i></a></li>


	</ul>
</div>
<div class="side-content side-content2" id="side-content-1">

	<script src="https://www.google.com/recaptcha/api.js"></script>
<a href="javascript:void(0)" class="closeme side-content-close">X</a>
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
								<div class="g-recaptcha"
									data-sitekey="6LeEDSUTAAAAAHM4ISRO_ItbCWPsc4XqZcUujZmI"></div>
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





</div>
<div class="side-content side-content2" id="side-content-2"
	style="height: 70px; width: 300px; top: 278px; right: 0px; padding: 16px;">
	<a href="javascript:void(0)" class="closeme"
		style="top: -4px; position: relative; background: white; color: black; right: 0px; border: 1px solid;">X</a>
	<ul class="inline">
		<li><a
			href="https://plus.google.com/u/0/+Medicalbillersandcoders1"
			target="_blank" title="Google Plus Profile for Jacob Thomas"> <img
				src="${pageContext.request.contextPath}/resources/ui/images/social_google_plus.jpg"
				alt="MBC-Google+" title="MBC-Google+" width="21" height="20" /></a></li>
		<li><a href="https://www.facebook.com/MBC.BillersandCoders"
			target="_blank" title="Become a fan"> <img
				src="${pageContext.request.contextPath}/resources/ui/images/social_facebook.jpg"
				alt="MBC-Facebook" title="MBC-Facebook" width="21" height="20" /></a></li>
		<li><a href="https://twitter.com/mbc_services" target="_blank"
			title="Follow my tweets"> <img
				src="${pageContext.request.contextPath}/resources/ui/images/social_tweeter.jpg"
				alt="MBC-Twitter" title="MBC-Twitter" width="21" height="20" /></a></li>
		<li><a
			href="https://www.linkedin.com/company/medicalbillersandcoders-com"
			target="_blank" title="Connect"> <img
				src="${pageContext.request.contextPath}/resources/ui/images/linkedin_logo.jpg"
				alt="MBC-Linkedin" title="MBC-Linkedin" width="21" height="20" /></a></li>
	</ul>
</div>
<div class="side-content side-content2" id="side-content-3"
	style="height: 70px; width: 400px; top: 400px; right: 0px; padding: 16px;">
	<%--top: 278px--%>
	<a href="javascript:void(0)" class="closeme"
		style="top: -4px; position: relative; background: white; color: black; right: 0px; border: 1px solid;">X</a>


	<ul class="inline">
		<li id="l1"
			style="width: 80%; background: #8DC153; margin: 0px 0px 0px 27px">
	</ul>
</div>
<div class="side-content side-content2" id="side-content-4"
	style="height: 70px; width: 550px; top: 400px; right: 0px; padding: 16px;">
	<%--top: 278px--%>
	<a href="javascript:void(0)" class="closeme"
		style="top: -4px; position: relative; background: white; color: black; right: 0px; border: 1px solid;">X</a>


	<ul class="inline">
		<li style="width: 86%; background: #8DC153">
			<%--<a href="https://plus.google.com/u/0/+Medicalbillersandcoders1" target="_blank" title="Google Plus Profile for Jacob Thomas">
            <img src=""images/social_google_plus.jpg" alt="MBC-Google+" title="MBC-Google+"--%>


			<a href="http://www.medicalbillersandcoders.com/blog" target=_blank
			runat="server" Class="btn btn-success"
			style="background: rgb(0, 177, 186) none repeat scroll 0% 0%; color: White; border: 1px solid rgb(0, 168, 177); width: 24%; padding: 0px; margin: 0px 5px;">MBC
				Blog</a> <a id="A1"
			href="http://www.medicalbillersandcoders.com/dme-billing-services-blog"
			target=_blank runat="server" Class="btn btn-success"
			style="background: rgb(0, 177, 186) none repeat scroll 0% 0%; color: White; border: 1px solid rgb(0, 168, 177); width: 24%; padding: 0px; margin: 0px 24px;">Dme
				Blog</a> <a id="A2"
			href="http://www.medicalbillersandcoders.com/pharmacy-billing-services-blog"
			target=_blank runat="server" Class="btn btn-success"
			style="background: rgb(0, 177, 186) none repeat scroll 0% 0%; color: White; border: 1px solid rgb(0, 168, 177); width: 36%; padding: 0px; margin: 0px 0px;">Pharmacy
				Blog</a>



		</li>
		<%--OnClick="btn_dme_Click"--%>
	</ul>
</div>

