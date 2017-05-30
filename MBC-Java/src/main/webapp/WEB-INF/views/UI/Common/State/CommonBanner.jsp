   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="banner-inner baner-bg-blue-light">

   
        	<div class="container">
        	<c:forEach items="${listStatebyName}" var="State">
            	<div class="col-sm-7">
               	   
                    <h3><label id="ctl00_ContentPlaceHolder1_heading_title"></label></h3>
                    

                 <p class="MsoNormal"> 
                  


                       ${State.bannerContent}


                        ${State.imagepath}
               
  
              
                        ${State.name}
              
                   
                    </p>
            	

                </div>
               
              
                    <div class="col-sm-5">
                       
                       
                       <c:if test="${empty State.imagepath}">
    
    
   <div  class="city_state_img" style="background:transparent url('${pageContext.request.contextPath}/resources/ui/images/Specialty_new/default-speciality.jpg') no-repeat scroll right top /455px 300px;;height:300px;">

</c:if>
<c:if test="${not empty State.imagepath}">
     <div  class="city_state_img" style="background:transparent url('${pageContext.request.contextPath}/resources/ui/images/Specialty_new/${State.imagepath}') no-repeat scroll right top /455px 300px;;height:300px;">
</c:if>
                       
                      
                       
                        
                
                    
                    
                     
                  
                     
                     
                         </div>
                    </div>
                       </c:forEach>
            </div>

        </div>
