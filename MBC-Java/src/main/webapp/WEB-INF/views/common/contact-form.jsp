<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Yourfffffffffffff Copy Now</title>

<script src="https://www.google.com/recaptcha/api.js"></script>
<script async
	src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/script/validation.js"></script>



<style>

@charset "utf-8";
/* CSS Document */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic);
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-font-smoothing: antialiased;
  -moz-font-smoothing: antialiased;
  -o-font-smoothing: antialiased;
  font-smoothing: antialiased;
  text-rendering: optimizeLegibility;
}

.form-container {
  max-width: 300px;
  width: 100%;
  margin: 0 auto;
  position: relative; 
}

#contact h3 {
  display: block;
  font-size: 20px;
  font-weight: 300;
  margin-bottom: 10px;
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  color: #666;
  
}

#contact input[type="text"],
#contact input[type="email"],
#contact input[type="tel"],
#contact input[type="url"],
#contact textarea,
#contact button[type="submit"] {
  font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
  border-radius: 10px;
}

#contact {
  background: #efefef;
  padding: 25px;
  border-radius: 10px;
}


fieldset {
  border: medium none !important;
  margin: 0 0 10px;
  min-width: 100%;
  padding: 0;
  width: 100%;
}

#contact input[type="text"],
#contact input[type="email"],
#contact input[type="tel"],
#contact input[type="url"],
#contact textarea {
  width: 100%;
  border: 1px solid #ccc;
  background: #FFF;
  margin: 0 0 5px;
  padding: 10px;
}

#contact input[type="text"]:hover,
#contact input[type="email"]:hover,
#contact input[type="tel"]:hover,
#contact input[type="url"]:hover,
#contact textarea:hover {
  -webkit-transition: border-color 0.3s ease-in-out;
  -moz-transition: border-color 0.3s ease-in-out;
  transition: border-color 0.3s ease-in-out;
  border: 1px solid #aaa;
}



#contact button[type="submit"] {
  cursor: pointer;
  width: 100%;
  border: none;
  background: #00b1b9;
  color: #FFF;
  margin: 0 0 5px;
  padding: 10px;
  font-size: 15px;
}

#contact button[type="submit"]:hover {
  background: #43A047;
  -webkit-transition: background 0.3s ease-in-out;
  -moz-transition: background 0.3s ease-in-out;
  transition: background-color 0.3s ease-in-out;
}

#contact button[type="submit"]:active {
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
}



#contact input:focus,
#contact textarea:focus {
  outline: 0;
  border: 1px solid #aaa;
}

::-webkit-input-placeholder {
  color: #888;
}

:-moz-placeholder {
  color: #888;
}

::-moz-placeholder {
  color: #888;
}

:-ms-input-placeholder {
  color: #888;
}




#commentForm {
	width: 500px;
}

#commentForm label {
	width: 250px;
}

#commentForm label.error, #commentForm input.submit {
	margin-left: 253px;
}

#signupForm {
	width: 670px;
}

#signupForm label.error {
	margin-left: 10px;
	width: auto;
	display: inline;
}

#newsletter_topics label.error {
	display: none;
	margin-left: 103px;
}
</style>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>


<div class="form-container">  
<form:form action="contact-us" modelAttribute="user" method="post"
			commandName="userForm">
 <h3>Get your free copy today</h3>
 

<fieldset> <form:input id="cname" name="name" minlength="2"
							type="text" path="Contact_Name" required="" aria-required="true"
							class="valid" aria-invalid="false" tabindex="1" required autofocus /></fieldset>
							
					<fieldset><form:input id="cemail" type="email" name="email" cssClass="error" path="Email_ID"  tabindex="3" required /></fieldset> 
							
<fieldset><form:input id="cemail" type="email" name="email" cssClass="error" path="Contact_No" tabindex="4" required /></fieldset> 
<fieldset>		<input class="submit"	type="submit" value="Submit"  data-submit="...Sending"/></fieldset> 						
						
</form:form>
</div>
</body>
</html>
























<!-- 	<div align="center"> -->
<%-- 		<form:form action="contact-us" modelAttribute="user" method="post" --%>
<%-- 			commandName="userForm"> --%>
<!-- 			<!--         if you write   action="register" it will go to register method of route so you can send to any where if validation is not working --> -->

<%-- 			<form:errors path="*" /> --%>
<!-- 			<table border="0"> -->
<!-- 				<tr> -->
<!-- 					<td colspan="2" align="center"><h2>Get Your Copy Now</h2></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td>Name:</td> -->

<%-- 					<td><form:input id="cname" name="name" minlength="2" --%>
<%-- 							type="text" path="Contact_Name" required="" aria-required="true" --%>
<%-- 							class="valid" aria-invalid="false" /></td> --%>
<%-- 					                    <td><form:input id="cname" name="name" minlength="2" type="text" required cssClass="error" path="Contact_Name" /></td> --%>
<!-- 				<tr> -->
					
<!-- 					<td>E-mail:</td> -->
<%-- 					<td><form:input id="cemail" type="email" name="email" --%>
<%-- 							cssClass="error" path="Email_ID" /></td> --%>

<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td>Contact:</td> -->
<!-- 										<td><td> -->
<%-- 					<td><form:input id="cemail" type="email" name="email" --%>
<%-- 							cssClass="error" path="Contact_No" /></td> --%>
					
			
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan="2" align="center"><div class="g-recaptcha" -->
<!-- 							data-sitekey="6LeEDSUTAAAAAHM4ISRO_ItbCWPsc4XqZcUujZmI"></div></td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<!-- 					<td colspan="2" align="center"><input class="submit" -->
<!-- 						type="submit" value="Submit" /></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<%-- 		</form:form> --%>
<!-- 	</div> -->
<!-- </BODY> -->
<!-- </HTML> -->