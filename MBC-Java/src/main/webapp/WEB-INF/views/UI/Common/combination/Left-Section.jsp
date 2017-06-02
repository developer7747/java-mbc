   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

            	<div class="col-sm-7">
<!-- Left section start -->
<TABLE>
      <tr>
          <td>
<ul class="we-excel-in">
<c:forEach items="${listStatebyName}" var="State">
   <c:forEach items="${listSpecialitybyName}" var="Specialityies">
                  <h1>
                   ${Specialityies.catname} Billing Services  ${State.name}
                  </h1>
                   ${Specialityies.catShortDesc}
                 	 ${State.shortDescription}  
                 	  ${State.longDescription}  
	 ${Specialityies.catDesc}
                     </c:forEach>
	
    </c:forEach>

                </ul>
         </td>
     </tr>
</TABLE>



<!-- Left section end -->
                </div>

                  
                  
                 


                      