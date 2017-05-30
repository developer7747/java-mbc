
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

	var str=url.substring(0, lastPart.indexOf("/"));

	
	 var str2= url.match(/^(.*)\/[^/]*$/)[1];
	 var n = str2.lastIndexOf('/');
	 var result = str2.substring(n + 1);

    if(window.location.href.indexOf("medical-billing-service") > -1) {
    	
    	 window.location="${pageContext.request.contextPath}/medical-billing-service/"+result+"/"+selectedValue;
    
    }
    
    else{
	 window.location="${pageContext.request.contextPath}/medical-billing-service/"+lastPart+"/"+selectedValue;
   }
   }
  
  </script>
  
  <c:url value="${requestScope['javax.servlet.forward.request_uri']}"
	var="currentUrl"></c:url>

<c:set var="string1" value="${currentUrl}" />
<c:set var="string2"
	value="${fn:replace(string1, '/MBC-Java/MBC-Java/medical-billing-service/', '')}" />
  
  <c:set var="string3" value="${fn:substringBefore(string2,'/')}"/>




<c:set var="string4" value="${currentUrl}" />
<c:set var="string5"
	value="${fn:replace(string4, '/MBC-Java/MBC-Java/medical-billing/', '')}" />
  
<%--   <c:set var="string6" value="${fn:substringAfter(string5,'/')}"/> --%>


<c:set var="string6" value="${currentUrl}" />
<c:set var="string7"
	value="${fn:replace(string6, '/MBC-Java/MBC-Java/', '')}" />
  
   <c:set var="string8" value="${fn:substringBefore(string7,'/')}"/>



<div class="right-gray-panel">



                            
    <div id="ctl00_ContentPlaceHolder1_Div2" class="category_box">
        
    <div class="circle-right-panel">S</div>
                                <h4 class="pull-left">We Excel In</h4>
                                <div class="clearfix"></div>
                                
                                
                                <c:set var = "TR1" value="${string8}"/>

                      
                                
<div class="pop-states">
                          

     <c:if test = "${string8 == 'medical-billing'}">
     
      <div id="ctl00_ContentPlaceHolder1_catListing_cat_label1" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Dental"><p>${string5}</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label2" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Urology"><p>Urology</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label3" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Podiatry"><p>Podiatry</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label4" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Mental-Health"><p>Mental Health</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label5" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Plastic-Surgery"><p>Plastic Surgery</p></a></div>
                             <div id="ctl00_ContentPlaceHolder1_catListing_cat_label6" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Anesthesiology"><p>Anesthesiology</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label7" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string5}/Oncology"><p>Oncology</p></a></div>
     
             
                           
</c:if> 

   <c:if test = "${string8 == 'medical-billing-service'}">

 <div id="ctl00_ContentPlaceHolder1_catListing_cat_label1" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Dental"><p>Dental</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label2" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Urology"><p>Urology</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label3" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Podiatry"><p>Podiatry</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label4" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Mental-Health"><p>Mental Health</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label5" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Plastic-Surgery"><p>Plastic Surgery</p></a></div>
                             <div id="ctl00_ContentPlaceHolder1_catListing_cat_label6" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Anesthesiology"><p>Anesthesiology</p></a></div>
                            <div id="ctl00_ContentPlaceHolder1_catListing_cat_label7" class="col-xs-4"><a href="${pageContext.request.contextPath}/medical-billing-service/${string3}/Oncology"><p>Oncology</p></a></div>
  
</c:if> 





                           

                           <div class="clearfix"></div>
                           <div id="ctl00_ContentPlaceHolder1_catListing_catListing" class="we-serve-in" style="background-color:#d6d6d6;"><b>We also Serve in</b>
       



          

  <select id="selectBox" onchange="changeFunc()">
   <c:forEach items="${listSpecialitys}" var="Specialityies">
                     <option   value="${Specialityies.customName}">${Specialityies.customName}</option>
                     </c:forEach>
       </select>
              
    </div>            
                     </div>   

    </div>


                    </div>









