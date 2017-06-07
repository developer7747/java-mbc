
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/views/UI/Static-Pages/main-static.jsp" />
<div class="container">
  <div class="row">
    <div class="col-sm-8">
            <div  id="infographId">
     <c:forEach items="${listinfographbyName}"   var="info">    
      <h1> <p class="resource-title"> ${info.name}</p></h1>
       ${info.description}
      </c:forEach>
      
      
      
       </div>
    </div>
<div class="col-sm-4">


	<jsp:include page="/WEB-INF/views/common/resource-contactus.jsp" />
</div>
	<jsp:include page="/WEB-INF/views/UI/footer.jsp" />
	</body>
	</html>