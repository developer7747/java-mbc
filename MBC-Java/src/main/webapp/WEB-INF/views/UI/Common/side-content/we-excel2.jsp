
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <form:select path="role"  id="role" > --%>
<%--     <form:options items="${listStates}" itemValue="roleID" itemLabel="title"/> --%>
<%-- </form:select> --%>


<form:select path="name">
	<form:options items="${listSpecialitys}" />
</form:select>

