
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<script type="text/javascript">
//alert("hello");
   function changeFunc() {
    var selectBox = document.getElementById("selectBox");
    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
    //alert(selectedValue);	 
	var url=window.location.href;
    var lastPart = url.split("/").pop();
var lastparttrim =lastPart.trim();
 var selectedValuetrim =selectedValue.split(' ').join('-');
 


    
    if(window.location.href.indexOf("medical-billing-service") > -1) {
    	
    	 window.location="${pageContext.request.contextPath}/medical-billing-service/"+selectedValue+"/"+lastparttrim;
    
    }
    
    else{
	 window.location="${pageContext.request.contextPath}/medicalg/"+lastparttrim+"-"+selectedValue;
   }
   }
  
  </script>

<c:url value="${requestScope['javax.servlet.forward.request_uri']}"
	var="currentUrl"></c:url>

<c:set var="string1" value="${currentUrl}" />
<c:set var="string2"
	value="${fn:replace(string1, '/MBC-Java/MBC-Java/medical-billing-service/', '')}" />

<div class="right-gray-panel">


	<div id="ctl00_ContentPlaceHolder1_Div2" class="category_box">

		<div class="circle-right-panel">S</div>
		<h4 class="pull-left">We Excel In</h4>
		<div class="clearfix"></div>
		<div class="pop-states">





			<div id="ctl00_ContentPlaceHolder1_stateListing00_state1"
				class="col-xs-4">
				<a href="${pageContext.request.contextPath}/medical-billing-service/Florida/${string2}">Florida
				</a>
			</div>
			<div id="ctl00_ContentPlaceHolder1_stateListing00_state2"
				class="col-xs-4">
				<a href="${pageContext.request.contextPath}/medical-billing-service/Ohio/${string2}">Ohio
				</a>
			</div>
			<div id="ctl00_ContentPlaceHolder1_stateListing00_state3"
				class="col-xs-4">
				<a href="${pageContext.request.contextPath}/medical-billing-service/Texas/${string2}">Texas</a>
			</div>
			<div class="right-dashesh-ghr"></div>

			<div id="ctl00_ContentPlaceHolder1_stateListing00_state4"
				class="col-xs-4">
				<a
					href="${pageContext.request.contextPath}/medical-billing-service/New-York/${string2}">New York</a>
			</div>
			<div id="ctl00_ContentPlaceHolder1_stateListing00_state5"
				class="col-xs-4">
				<a
					href="${pageContext.request.contextPath}/medical-billing-service/New-Jersey/${string2}">New Jersey</a>
			</div>
			<div id="ctl00_ContentPlaceHolder1_stateListing00_state6"
				class="col-xs-4">
				<a
					href="${pageContext.request.contextPath}/medical-billing-service/Maryland/${string2}">Maryland</a>
			</div>
			<div class="right-dashesh-ghr"></div>

			<div id="ctl00_ContentPlaceHolder1_stateListing00_state7"
				class="col-xs-4">
				<a
					href="${pageContext.request.contextPath}/medical-billing-service/Virginia/${string2}">Virginia</a>
			</div>
			<div id="ctl00_ContentPlaceHolder1_stateListing00_state8"
				class="col-xs-4">
				<a
					href="${pageContext.request.contextPath}/medical-billing-service/Pennsylvania/${string2}">Pennsylvania</a>
			</div>

			<div class="clearfix"></div>
			<div id="ctl00_ContentPlaceHolder1_catListing_catListing"
				class="we-serve-in" style="background-color: #d6d6d6;">
				<b>We also Serve in state</b> <select id="selectBox"
					onchange="changeFunc()">
					<c:forEach items="${listStates}" var="Specialityies">
						<option value="${Specialityies.customname}">${Specialityies.customname}</option>
					</c:forEach>
				</select>

			</div>
		</div>

	</div>


</div>









