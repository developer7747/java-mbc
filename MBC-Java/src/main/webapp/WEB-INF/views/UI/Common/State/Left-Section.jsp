   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

            	<div class="col-sm-7">
<!-- Left section start -->
<TABLE>
      <tr>
          <td>
<ul class="we-excel-in">
<c:forEach items="${listStatebyName}" var="State">


<%--                      <li style="width:220px;"> <a href="0-0-${Speciality.id}.html"> --%>
                          ${State.longDescription}
<!--                         </a> -->
<!--                      </li> -->
                     </c:forEach>
                </ul>
         </td>
     </tr>
</TABLE>



<!-- Left section end -->
                </div>

                  
                  
                 


                      