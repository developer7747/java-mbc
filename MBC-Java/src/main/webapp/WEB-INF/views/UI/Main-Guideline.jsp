
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/views/UI/Static-Pages/main-static.jsp" />
<div class="container">
  <div class="row">
    <div class="col-sm-8">
            <div  id="GuidelineId">

 <c:forEach items="${listmbcGuidelinebyName}"   var="guide">    
 
        <h1> <p class="resource-title"> ${guide.guidlelinetitle}</p></h1>
     ${guide.longDescription}
    
       </c:forEach> 
       
       
     
      
       </div>
    </div>
<div class="col-sm-4">
	<jsp:include page="/WEB-INF/views/common/resource-contactus.jsp" />
</div>
	<jsp:include page="/WEB-INF/views/UI/footer.jsp" />
	</body>
	</html>