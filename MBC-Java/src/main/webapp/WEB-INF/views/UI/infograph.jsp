<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	</script>
	<link href="${pageContext.request.contextPath}/resources/ui/css/libraries/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet" type="text/css"/>

    <link href="${pageContext.request.contextPath}/resources/ui/css/libraries/css/pages/portfolio.css" rel="stylesheet" />
	
	
	
	
	<c:forEach items="${listinfographs}" var="Specialityies"> 
                          <div class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;">
                <div class="mix-inner">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/${Specialityies.thumbnilImage}" alt="${Specialityies.name}">
                    <div class="mix-details">
                      
                      <a target="_blank" href="medical-billing-bytes/${Specialityies.pdffile}">   
                        
                          
                            <div class="info-icon-hover">
                        <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div>
                        <h3>${Specialityies.name} </h3></a>
                        <p>
                   ${Specialityies.name}
                        </p>
                        
                    </div>
                    
                </div>
            </div>
<%--             <c:forEach begin="${startpage}" end="${endpage}" var="p"> --%>
<%--            <a href="<c:url value="/medical-billing-bytes" ><c:param name="page" value="${p}"/>${p}</c:url>">${p}</a> --%>
<%--                  </c:forEach> --%>

            </c:forEach>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
<!-- 	<div class="container"> -->
<!--            <div class="white-section">  -->
                        
<!--             <div class="row mix-grid thumbnails mwidth-section"> -->

<%--      <c:forEach items="${listinfo}" begin="${startpage}" end="${endpage}" var="Specialityies"> --%>

<!--                           <div class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;"> -->
<!--                 <div class="mix-inner"> -->
<%--                     <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/${Specialityies.thumbnilImage}" alt="${Specialityies.name}"> --%>
<!--                     <div class="mix-details"> -->
                      
<%--                       <a target="_blank" href="medical-billing-bytes/${Specialityies.pdffile}">    --%>
                        
                          
<!--                             <div class="info-icon-hover"> -->
<%--                         <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div> --%>
<%--                         <h3>${Specialityies.name} </h3></a> --%>
<!--                         <p> -->
<%--                    ${Specialityies.name} --%>
<!--                         </p> -->
                        
<!--                     </div> -->
                    
<!--                 </div> -->
<!--             </div> -->
<%-- <%--             <c:forEach begin="${startpage}" end="${endpage}" var="p"> --%> --%>
<%-- <%--            <a href="<c:url value="/medical-billing-bytes" ><c:param name="page" value="${p}"/>${p}</c:url>">${p}</a> --%> --%>
<%-- <%--                  </c:forEach> --%> --%>

<%--             </c:forEach> --%>

<!--               </div>  -->
             
<!--                </div> -->
<!--       <ul> -->
<%--         <li><c:forEach begin="${startpage}" end="${endpage}" var="p"> --%>
<%--         <a href="<c:url value="/medical-billing-bytes" ><c:param name="page" value="${p}"/>${p}</c:url>">${p}</a> --%>
<%--         </c:forEach></li> --%>
<!--     </ul>       -->



           
           </div></div>