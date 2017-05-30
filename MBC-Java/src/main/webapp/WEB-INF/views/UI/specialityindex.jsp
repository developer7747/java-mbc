<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<TABLE>
      <tr>
          <td>
<ul class="we-excel-in">
<%-- <c:forEach items="${listSpecialitys}" var="Specialityies"> --%>
<%--                      <li style="width:220px;"> <a href="medical-Billing-Service/${Specialityies.name}"> --%>
<%--                         ${Specialityies.name}</a> --%>
<!--                      </li> -->
<%--                      </c:forEach> --%>
                     
                <c:forEach items="${listSpecialitys}" var="Specialityies">
                     <li style="width:220px;"> <a href="medical-billing-service/${Specialityies.customName}">
                        ${Specialityies.catname}</a>
                     </li>
                     </c:forEach>
                     
                </ul>
         </td>
     </tr>
</TABLE>




	
	