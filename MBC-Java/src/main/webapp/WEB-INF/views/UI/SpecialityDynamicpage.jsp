<%--   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <link href="css/services.css" rel="stylesheet" />
   <jsp:include page="/WEB-INF/views/UI/header.jsp" />
   <div class="content-wrapper">
	<!-- Content Header (Page header) -->
<div class="container">
   <jsp:include page="/WEB-INF/views/UI/Common/ui/navigation.jsp" />
   </div></div>
 <!-- Main about us content start-->
    <div class="container">
        </div>
        <jsp:include page="/WEB-INF/views/UI/Common/Speciality/CommonBanner.jsp" />
        <div class="two-colomn-temp">
        <div class="container">
   
            <div class="row">
<%--             <c:out value="${message}" /> --%>
        
 <jsp:include page="/WEB-INF/views/UI/Common/Speciality/Left-Section.jsp" />
 
 
 
  <div class="col-sm-5 right-sidebar">
    <jsp:include page="/WEB-INF/views/UI/Common/side-content/we-excel-state.jsp" />
  <jsp:include page="/WEB-INF/views/UI/Common/Speciality/blog-links.jsp" />
  

      <jsp:include page="/WEB-INF/views/UI/Common/State/Article.jsp" />
   
   
  </div>  
    </div></div></div>
        <jsp:include page="/WEB-INF/views/UI/footer.jsp" />
	</body>
	</html>