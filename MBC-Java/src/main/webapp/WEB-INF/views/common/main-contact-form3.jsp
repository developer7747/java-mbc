<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>




<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" -->
<!--     "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>

<script src="https://www.google.com/recaptcha/api.js"></script>
<script async  src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/validation.js"></script>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>







<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<style>
.side-content2 {
	display: none;
	width: 50%;
	height: 474px;
	position: fixed;
	top: 80px;
	right: 0px;
	border: 4px solid #ffffff;
	background: #00b1ba;
	z-index: 4000;
	border-radius: 7px;
	padding: 50px 30px;
	overflow: auto;
}

.side-content .btn-success {
	background: #9ec04b;
	border: 1px solid #9ec04b;
	padding: 5px 18px;
	color: #222623;
	font-size: 20px;
	text-transform: uppercase;
	margin-top: 20px;
	margin-bottom: 20px;
	width: 170px;
}

.side-content .form-control {
	background: #7c837f;
	border: 1px solid #7c837f;
	min-height: 40px;
	color: #fff !important;
	opacity: 0.90 !important;
	margin: 4px;
}
</style>

<body>


	<div class="form-container">
		<form:form action="contact-us"  method="post"
			commandName="userForm">
			<div class="side-content side-content2" id="side-content-1"
				style="right: 0px; display: block;">
				<a href="javascript:void(0)" class="closeme side-content-close">X</a>





				<div>

					<div>

						<div class="">
							<div class="col-sm-12">
								<p id="contact"
									style="color: White; padding-left: 218px; font-weight: bold;">CONTACT
									US NOW</p>
							</div>
							<div class="col-sm-6">
						<selct name= "selectBox3">
						<option value="test"> test</option>
						<option value="test"> test</option>
						
						</selct>
<!-- 								<form:select id="selectBox3" name="selectBox3" -->
<!-- 									path="LeadCategory" class="form-control selected" -->
<!-- 									onchange="changeFunc3()"> -->
<!-- 									<option selected="selected" value="--Select--">What -->
<!-- 										are you looking for</option> -->
<!-- 									<option value="Billing services" -->
<!-- 										title="Billing services for your Practice">Billing -->
<!-- 										services for your Practice</option> -->
<!-- 									<option value="Inhouse billers" -->
<!-- 										title="In-house Medical Biller for your Practice">In-house -->
<!-- 										Medical Biller for your Practice</option> -->
<!-- 									<option value="seeking Job" -->
<!-- 										title="Medical Billing / Coding Jobs">Medical Billing -->
<!-- 										/ Coding Jobs</option> -->
<!-- 									<option value="Training" -->
<!-- 										title="Medical Billing / ICD-10 Training">Medical -->
<!-- 										Billing / ICD-10 Training</option> -->
<!-- 									<option value="other" title="Other">Other</option> -->

<!-- 								</form:select> -->
							</div>











							<div style="display: none" class="Other1">
								<div class="col-sm-6">

									<span style="color: Red; display: none;">Other
										requirement is required</span> <input type="text" maxlength="50"
										class="form-control">
								</div>
							</div>
							<div class="col-sm-6">

<!-- 								<form:select id="selectBox" name="selectBox" path="StateId" -->
<!-- 									class="form-control selected" onchange="changeFunc()"> -->
<!-- 									<option value="--State--">--State--</option> -->
<%-- 									<c:forEach items="${listStates}" var="Specia"> --%>

<%-- 										<option value="${Specia.id}">${Specia.customname}</option> --%>

<%-- 									</c:forEach> --%>

<!-- 								</form:select> -->
							</div>

							<div class="col-sm-6">
								<!--              <span style="color:Red;display:none;">Name is required</span>
                    <span style="color:Red;display:none;">Please enter characters only</span>
                     <input type="text" maxlength="50" class="form-control" size="20" placeholder="Name"> -->

								<form:input id="cname" name="name" class="form-control"
									minlength="2" type="text" path="Contact_Name" required=""
									aria-required="true" aria-invalid="false" />

							</div>
							<div class="col-sm-6">
<!-- 								<form:select id="selectBox2" name="selectBox2" path="CateId" -->
<!-- 									class="form-control selected" onchange="changeFunc2()"> -->

<!-- 									<option value="--Speciality--">--Speciality--</option> -->
<%-- 									<c:forEach items="${listSpecialitys}" var="Specialityies"> --%>
<%-- 										<option value="${Specialityies.id}">${Specialityies.customName}</option> --%>
<%-- 									</c:forEach> --%>



<!-- 								</form:select> -->

							</div>
							<div class="col-sm-6">
								<!--                     <span  style="color:Red;display:none;">Email ID is required</span> -->
								<!--                     <span  style="color:Red;display:none;">Invalid email format</span> -->
								<!--                     <input type="text" maxlength="50" class="form-control" size="28" placeholder="Email ID"> -->

								<form:input id="cemail" type="email" name="email"
									class="form-control" path="Email_ID" />

							</div>
							<div class="col-sm-6">
								<!--                     <span style="color:Red;font-weight:normal;display:none;">Contact number is required</span> -->
								<!--                     <span  style="color:Red;display:none;">Minimum 10 digit number required</span> -->
								<!--                     <input  type="text" maxlength="10" class="form-control" placeholder="Contact Number"> -->
								<form:input class="form-control" path="Contact_No" />

							</div>
<div class="col-sm-6">
								<div class="g-recaptcha" data-sitekey="6LeEDSUTAAAAAHM4ISRO_ItbCWPsc4XqZcUujZmI"></div> 	</div>


							<div class="col-sm-6">
								<span style="color: Red; display: none;">Please enter
									characters only</span>
								<form:textarea rows="3" cols="20" path="Requirement"
									class="form-control" />

							</div>

							
							<div class="col-sm-6"></div>
							<div class="col-md-offset-4 col-md-4">

								<input class="submit" type="submit" value="Submits"
									class="btn-success"
									style="background: #9ec04b; border: 1px solid #9ec04b; padding: 5px 18px; color: #222623; font-size: 20px; text-transform: uppercase; margin-top: 20px; margin-bottom: 20px; width: 170px;" />

								<!--                     <input type="button" value="SUBMIT" onclick="if(Page_ClientValidate('Registration')) this.disabled = true; this.value = 'Submit';class="btn btn-success">  -->

							</div>
							<div class="col-sm-12">


								<input type="hidden"
									value="http://www.medicalbillersandcoders.com/default.aspx">
							</div>
						</div>

					</div>

				</div>


			</div>
		</form:form>

	</div>

</body>
</html>
