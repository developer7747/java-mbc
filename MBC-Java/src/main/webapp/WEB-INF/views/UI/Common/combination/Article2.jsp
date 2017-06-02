
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- <div class="right-dgray-panel"> -->

<!-- 		<div class="col-xs-3"> -->

<!-- 			<div class=""> -->
<!-- 				<img alt="Article" style="width: 47%; margin: 29px 40px;" -->
<%-- 					src="${pageContext.request.contextPath}/resources/ui/images/Specialty_new/article.png"> --%>
<!-- 			</div> -->
<!-- 		</div> -->
		
<!-- 			<div class="col-xs-9"> -->
<!-- 				<a href="#" style="color: white"> -->
<!-- <!-- 					<h3 style="color:" #ffffff"="">Article sssssssssssddd</h3> --> -->
<!-- 				</a> -->

<!-- 				<div style="color: white; font-weight: bold"> -->
				
<%-- 				<c:forEach items="${listArticlesbyName}" var="Article"> --%>
<%-- 				${Article.metaKeyword} --%>
<%-- 				</c:forEach> --%>
<!-- <!-- 					<li><a style="color: white" target="_blank" --> 
<%-- <%-- 						href="${Article.isActive}">${Article.name}</a></li> <br> --%> 
<!-- <!-- 					<li><a style="color: white" target="_blank" --> -->
<%-- <%-- 						href="${Article.isActive}">fffffddddddd${Article.name}</a></li> <br> --%> 
<!-- <!-- 					<li><a style="color: white" target="_blank" --> -->
<%-- <%-- 						href="${Article.name}">ssssssssss${Article.name}</a></li> --%>
<!-- 					<br> -->
<!-- 				</div> -->

<!-- 			</div> -->
		


	
<!-- </div> -->



<!-- working -->
<c:forEach items="${listArticlesbyName}" var="Article">
${Article.isActive}

${Article.metaKeyword}

${Article.shortDescription}


</c:forEach>







<!-- <div class="banner-inner baner-bg-blue-light"> -->


<!--         	<div class="container"> -->
<%--         	<c:forEach items="${listArticlesbyName}" var="Speciality"> --%>
<!--             	<div class="col-sm-7"> -->

<!--                     <h3><label id="ctl00_ContentPlaceHolder1_heading_title"></label></h3> -->


<!--                  <p class="MsoNormal">  -->



<%--                        ${Speciality.bannerContent} --%>


<%--                         ${Speciality.imagepath} --%>



<%--                         ${Speciality.name} --%>


<!--                     </p> -->

<!--                 </div> -->


<!--                     <div class="col-sm-5"> -->

<%--                          <div  class="city_state_img" style="background:transparent url('${pageContext.request.contextPath}/resources/ui/images/Specialty_new/${Speciality.imagepath}') no-repeat scroll right top /455px 300px;;height:300px;"></div> --%>
<!--                     </div> -->
<%--                      </c:forEach> --%>

<!--             </div> -->

<!--         </div> -->
