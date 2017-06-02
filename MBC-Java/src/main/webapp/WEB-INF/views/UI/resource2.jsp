<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	</script>
	<link href="${pageContext.request.contextPath}/resources/ui/css/libraries/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet" type="text/css"/>

    <link href="${pageContext.request.contextPath}/resources/ui/css/libraries/css/pages/portfolio.css" rel="stylesheet" />
	<script type="text/javascript">
//alert("hello");
   function changeFunc1() {
    var selectBox = document.getElementById("selectBox1");
    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
    alert(selectedValue);	 

    if (selectedValue=='Infograph') {
    	$("#ArticleId").hide();
    	$("#infographid").show();
    	
    	
    	//Article.style.display = 'none';
    	alert("work");
    }
    
    else if (selectedValue=='Article')
    	{
    	$("#infographid").hide();
    	$("#ArticleId").show();
    	
    	
    	}
    
    
    else if (selectedValue=='Assets'){
   	$("#ArticleId").show();
    $("#infographid").show();
    }
    
    
   }
</script>

	<style>
	
	       
/* Hover Overlay */
.image-hover-overlay {
  bottom: 0;
  color: rgba(255,255,255, 0.75)!important;
  left: 0;
  opacity: 0;
  padding: 1.25rem;
  position: absolute;
  right: 0;
  top: 0;
  z-index: 1;
  transition: all 0.20s linear 0s;
  -o-transition: all 0.20s linear 0s;
  -ms-transition: all 0.20s linear 0s;
  -moz-transition: all 0.20s linear 0s;
  -webkit-transition: all 0.20s linear 0s;
  transform-style: preserve-3d;
  -o-transform-style: preserve-3d;
  -ms-transform-style: preserve-3d;
  -moz-transform-style: preserve-3d;
  -webkit-transform-style: preserve-3d;
}
.image-border-radius .image-hover-overlay {
  border-radius: 3px;
}
.image-hover-overlay:hover {
  opacity: 1;
}
.image-hover-overlay-content {
  position: absolute;
  left: 0;
  right: 0;
  top: 60%;
  transition: all 0.20s linear 0s;
  -o-transition: all 0.20s linear 0s;
  -ms-transition: all 0.20s linear 0s;
  -moz-transition: all 0.20s linear 0s;
  -webkit-transition: all 0.20s linear 0s;
  transform: translateY(-50%);
  -o-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -moz-transform: translateY(-50%);
  -webkit-transform: translateY(-50%);
}
.image-hover-overlay:hover > .image-hover-overlay-content {
  top: 50%;
}

.image-hover-zoom {
  display: block;
  overflow: hidden;
}
.image-hover-zoom img {
  transition: all 0.20s linear 0s;
  -o-transition: all 0.20s linear 0s;
  -ms-transition: all 0.20s linear 0s;
  -moz-transition: all 0.20s linear 0s;
  -webkit-transition: all 0.20s linear 0s;
}

/* Image blocks */
.image-with-hover-overlay {
  display: block;
  position: relative;
}
.image-border-radius img {
  border-radius: 3px;
}
.image-hover-zoom {
  display: block;
  overflow: hidden;
}
.image-hover-zoom img {
  transition: all 0.20s linear 0s;
  -o-transition: all 0.20s linear 0s;
  -ms-transition: all 0.20s linear 0s;
  -moz-transition: all 0.20s linear 0s;
  -webkit-transition: all 0.20s linear 0s;
}
.image-with-hover-overlay img {
  width: 100%;
}
.image-hover-zoom:hover img {
  transform: scale(1.1);
}

.image-hover-overlay-content *,
.background-primary, .background-primary p, a.background-primary, a.background-primary:visited, a.background-primary:link, .background-primary a, .background-primary a:link, .background-primary a:visited, .background-primary a:hover, .background-primary a:active,
.primary-color-primary .background-primary, .primary-color-primary .background-primary p, .primary-color-primary a.background-primary, .primary-color-primary a.background-primary:visited, .primary-color-primary a.background-primary:link, .primary-color-primary .background-primary a, .primary-color-primary .background-primary a:link, .primary-color-primary .background-primary a:visited, .primary-color-primary .background-primary a:hover, .primary-color-primary .background-primary a:active {
  color: rgba(255,255,255, 0.75);
}


.background-primary, .primary-color-primary .background-primary{

   /*#00B8CA !important;*/
    background-color:  rgba(0, 184, 202, 0.65) !important

    /*#09C*/
}

        #ctl00_MainContent_ddlSearch {
         background-color:#00B5C8;
         width:100%;
        }



        #ctl00_MainContent_lblEmpty {
        
        color:#444343;
        font-weight:bold;
        
        }

        #hideShow {
padding: 0 2% 10px;
        }

       #hyp_knowmore {

 color: #fff; text-align: center; position: absolute; z-index: 2; left: 33%; top: 43%; border: 1px solid #fff; display: table-caption; font-size: 18px; padding: 10px;}





       /*for tagline*/
       .resources-container .resource-box {
    position: relative;
}

       .resources-container .resource-box {
    width: 30%;
    background-color: #ebebeb;
    margin: 15px;
    float: left;
    position: relative;
}



       .resource-small-cont {
    font-size: 14px;
    padding: 0 10px;
    line-height: 16px;
    padding-top: 5px;
    min-height: 70px;
}
       .resource-title {
    font-size: 14px;
        color: white;
    /*color: #000;*/
    position: absolute;
    margin-top: -65px;
    padding: 0px 10px;
    font-weight: 600;
    font-family: 'Gotham-Book';
}

        .resources-container .resource-box {    width: 30%;
    background-color: #ebebeb;
    margin: 15px;
    float: left;
    /*position: relative;*/
        }
	
	
	</style>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<div class="container">
           <div class="white-section"> 
     
     
       <select id="selectBox1" onchange="changeFunc1()">
         <option   value="Assets">Select Assets</option>
                     <option   value="Infograph">Infograph</option>
                      <option   value="Article">Article</option>        
       </select>
              
     
     
     
     
     
     
                        
            <div class="row mix-grid thumbnails mwidth-section">
             <div  id="infographid">
      
     <c:forEach items="${listinfographs}"   var="Specialityies">
 <div  class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;">
                         
                <div class="mix-inner">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/${Specialityies.thumbnilImage}" alt="${Specialityies.name}">
                    <div class="mix-details">
                      
                      <a target="_blank" href="resources/inforgraph/${Specialityies.pdffile}">
                        
                          
                            <div class="info-icon-hover">
                        <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div>
                        <h3>${Specialityies.name} </h3></a>
                        <p>
                   ${Specialityies.name}
                        </p>
                        
                    </div>
                    
                </div>
              </div>
     </c:forEach>
     </div>
        <div  id="ArticleId">

      <c:forEach items="${listArticles}"   var="Articles">    
      <div  class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;">                
                <div class="mix-inner">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/info14.jpg" alt="${Articles.name}">
                    <div class="mix-details">
                       <c:set var = "string1" value = "${Articles.name}"/>
                       <c:set var = "string2" value = "${fn:replace(string1, ' ', '-')}" />
                       
                      <a target="_blank" href="resources/articles/${string2}">
                        
                            <div class="info-icon-hover">
                        <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div>
                        <h3>${Articles.name}  </h3></a>
                        <p>
                  ${Articles.name} 
                        </p>
                        
                    </div>
                    
                </div>
           
                        </div>
        
      </c:forEach>
       </div>
    
    
    
     <div  id="Guidelines">
    

          <c:forEach items="${listmbcGuidelines}"   var="Guidelines">    
      <div  class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;">                
                <div class="mix-inner">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/${Guidelines.spimage}" alt="">
                    <div class="mix-details">
                  
                       <c:set var = "string1" value = "${Guidelines.guidlelinetitle}"/>
                       <c:set var = "string2" value = "${fn:replace(string1, ' ', '-')}" />
                      <a target="_blank" href="resources/articles/${string2}">
                        
                            <div class="info-icon-hover">
                        <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div>
                        <h3>${Guidelines.guidlelinetitle}  </h3></a>
                        <p>
             
                        </p>
                        
                    </div>
                    
                </div>
           
                        </div>
        
      </c:forEach>
    
     </div>
    
    
    <div  id="PressRelease">
    

          <c:forEach items="${listPressReleases}"   var="pr"> 

      <div  class="col-md-4 col-sm-6 mix mix_all" style="display: block;  opacity: 1;">                
                <div class="mix-inner">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/ui/images/works/info13.jpg" alt="">
                    <div class="mix-details">
                  
                       <c:set var = "string1" value = "${pr.pressTitle}"/>
                       <c:set var = "string2" value = "${fn:replace(string1, ' ', '-')}" />
                      <a target="_blank" href="resources/articles/${string2}">
                        
                            <div class="info-icon-hover">
                        <img src="${pageContext.request.contextPath}/resources/ui/images/icons/infographs-onhover.png"></div>
                        <h3>${pr.pressTitle}  </h3>
                       </a> <p>
             
                        </p>
                        
                    </div>
                    
                </div>
           
                        </div>
        
      </c:forEach>
    
     </div>
    
    
    
    
    
    
    
    
    
    
      

    <c:forEach begin="1" end="3" var="p">
           <a href="<c:url value="/medical-billing-bytes" ><c:param name="page" value="${p}"/>${p}</c:url>">${p}</a>
                 </c:forEach>



              </div> 
             
               </div>



           
           </div></div>