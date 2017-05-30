
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="right-dgray-panel">
                    	<div class="row">
                            <div class="col-xs-3">
                               
                               <div class=""><img alt="Article" style="width: 47%; margin: 29px 40px;" src="${pageContext.request.contextPath}/resources/ui/images/Specialty_new/article.png"> </div>

                            </div>
                            <div class="col-xs-9">
                              <a href="articles.aspx" style="color:white"> <h3 style="color:" #ffffff"="">Article </h3></a>

                                <p>Understand the billing and coding processes ranging through various specialties and states along with a plethora of healthcare related information.

</p> <div id="d" style="color:white;font-weight:bold">

  <c:forEach items="${listArticlesbyName}" varStatus="status" var="Article"> 
  
  

<li>
<a style="color:white" target="_blank" href="${pageContext.request.contextPath}/resource/${Article.name}">${Article.customtitle}</a></li>
                            
                         
    </c:forEach> </div>
                            </div>
                        </div>
                    </div>







                     




