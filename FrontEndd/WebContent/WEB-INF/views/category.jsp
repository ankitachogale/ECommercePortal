<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body>

<c:url var="addcategory" value="/category/add" ></c:url>
<form:form action="${addcategory }" commandName="category">
<table>
			<tr>
			<td><form:label path="Cid">
						<spring:message text="Cid" />
					</form:label></td>
					<td>
			<form:input path="Cid"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="Cname">
						<spring:message text="Cname" />
					</form:label></td>
					<td>
			<form:input path="Cname" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Category"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Cid </th>
		<th>  Cname </th>
		
		
		</tr>
		
		<c:if test="${!empty categorylist}">
			<c:forEach items="${categorylist}" var="category">
			<tr>
			<td>${category.Cid }</td>
			<td>${category.Cname }</td>
						<td><a href="<c:url value='/deleteCategory/${category.Cid}' />" >Delete</a></td>
			<td><a href="<c:url value='/editCategory/${category.Cname}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>


</body>
</html>