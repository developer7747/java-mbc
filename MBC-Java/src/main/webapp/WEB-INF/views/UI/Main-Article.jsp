
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/views/UI/Static-Pages/main-static.jsp" />
<div class="container">
  <div class="row">
    <div class="col-sm-8">
            <div  id="ArticleId">
  <c:forEach items="${listArticlesbyName}"   var="Articles">    
      <h1> <p class="resource-title"> ${Articles.name}</p></h1>
       ${Articles.longDescription}
      </c:forEach>
    
      
      
       </div>
    </div>
<div class="col-sm-4">
<!-- <div class="form-container">   -->
<!-- <form class="contact" action="contactar" method="POST"> -->
<!--  <h3>Get your free copy today</h3> -->
 
<!--  <fieldset><input type="text" name="Contact_Name" class="form-control" -->
<!-- 							size="20" placeholder="Name*" maxlength="50" tabindex="1" required="" autofocus=""></input></fieldset> -->
<!-- <fieldset><input  placeholder="Email*"   tabindex="3" required="" name="Email_ID" type="text" maxlength="50" -->
<!-- 							class="form-control" size="28" ></input> -->
<!-- </fieldset> -->

<!-- <fieldset> -->
<!-- <textarea name="Requirement" rows="3" cols="20" -->
<!-- 							class="form-control" -->
<!-- 						 tabindex="4" placeholder="Requirement"	placeholder="Best time to call? Please Briefly Describe your requirements"></textarea> -->

<!-- </fieldset>	 -->
<!-- <fieldset> -->
<!-- <input name="Contact_No" type="text" maxlength="10" -->
<!-- 							 tabindex="4" class="form-control" placeholder="Contact Number" required="" ></input> -->
<!-- 							 </fieldset> -->
<!-- <fieldset> -->
<!-- <input type="Submit" class="btn btn-success" value="Submit"> -->
<!-- <!-- <button type="Submit" class="btn btn-success" value="Submit" data-submit="...Sending">Submit</button> --><!-- </fieldset> -->
<!-- </form> -->
<!-- </div> -->

<!-- </div></div> -->



	<jsp:include page="/WEB-INF/views/common/resource-contactus.jsp" />
</div>





	<jsp:include page="/WEB-INF/views/UI/footer.jsp" />
	</body>
	</html>