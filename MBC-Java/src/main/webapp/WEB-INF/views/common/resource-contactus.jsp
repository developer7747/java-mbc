<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
  float:right;
}

.contact h3 {
  display: block;
  font-size: 20px;
  font-weight: 300;
  margin-bottom: 10px;
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  color: #666;
  
}

.contact input[type="text"],
.contact input[type="email"],
.contact input[type="tel"],
.contact input[type="url"],
.contact textarea,
.contact button[type="submit"] {
  font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
  border-radius: 10px;
}

.contact {
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

.contact input[type="text"],
.contact input[type="email"],
.contact input[type="tel"],
.contact input[type="url"],
.contact textarea {
  width: 100%;
  border: 1px solid #ccc;
  background: #FFF;
  margin: 0 0 5px;
  padding: 10px;
}

.contact input[type="text"]:hover,
.contact input[type="email"]:hover,
.contact input[type="tel"]:hover,
.contact input[type="url"]:hover,
.contact textarea:hover {
  -webkit-transition: border-color 0.3s ease-in-out;
  -moz-transition: border-color 0.3s ease-in-out;
  transition: border-color 0.3s ease-in-out;
  border: 1px solid #aaa;
}



.contact button[type="submit"] {
  cursor: pointer;
  width: 100%;
  border: none;
  background: #00b1b9;
  color: #FFF;
  margin: 0 0 5px;
  padding: 10px;
  font-size: 15px;
}

.contact button[type="submit"]:hover {
  background: #43A047;
  -webkit-transition: background 0.3s ease-in-out;
  -moz-transition: background 0.3s ease-in-out;
  transition: background-color 0.3s ease-in-out;
}

.contact button[type="submit"]:active {
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
}



.contact input:focus,
.contact textarea:focus {
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


</style>  <script src="https://www.google.com/recaptcha/api.js"></script>
<div class="form-container">  

<form class="contact"    action="contactar" method="POST">
 <h3>Get your free copy today</h3>
 
 <fieldset><input type="text" name="Contact_Name" class="form-control"
							size="20" placeholder="Name*" maxlength="50" tabindex="1" required="" autofocus=""></input></fieldset>
<fieldset><input  placeholder="Email*"   tabindex="3" required="" name="Email_ID" type="text" maxlength="50"
							class="form-control" size="28" ></input>
</fieldset>

<fieldset>
<textarea name="Requirement" rows="3" cols="20"
							class="form-control"
						 tabindex="4" placeholder="Requirement"	placeholder="Best time to call? Please Briefly Describe your requirements"></textarea>

</fieldset>	
<fieldset>
<input name="Contact_No" type="text" maxlength="10"
							 tabindex="4" class="form-control" placeholder="Contact Number" required="" ></input>
							 </fieldset>
							 
	<fieldset>						 
						  <c:url value="${requestScope['javax.servlet.forward.request_uri']}"
	var="currentUrl"></c:url>	 
	<c:set var="string4" value="${currentUrl}" />
	<c:set var="string5"
	value="${fn:replace(string4, '/MBC-Java/MBC-Java/resources/articles/', '')}" />

<%-- 	${pageContext.request.contextPath}/ --%>

	<c:set var="string6"
	value="${fn:replace(string5, '/MBC-Java/MBC-Java/resources/infograph/', '')}" />

	<c:set var="string7"
	value="${fn:replace(string6, '/MBC-Java/MBC-Java/resources/guideline/', '')}" />


<c:set var="string8"
	value="${fn:replace(string7, '/MBC-Java/MBC-Java/resources/case-study/', '')}" />




<input type='hidden' id='newfield' name='newfield' value='${string8}'/>

<input name="sourceurl" type='hidden' id='sourceurl' name='sourceurl' value="${currentUrl}"  ></input>

<div class="g-recaptcha" data-sitekey="6LeEDSUTAAAAAHM4ISRO_ItbCWPsc4XqZcUujZmI"></div>
							 
<!-- <input type="Submit" class="btn btn-success" value="Submit"> -->
<button type="Submit" class="btn btn-success" value="Submit" data-submit="...Sending">Submit</button>
</fieldset>
</form>
</div>

</div></div>
