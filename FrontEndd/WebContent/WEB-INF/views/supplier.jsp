<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Page</title>
</head>
<body>

<c:url var="addsupplier" value="/supplier/add" ></c:url>
<form:form action="${addsupplier }" commandName="supplier">
<table>
			<tr>
			<td><form:label path="Sid">
						<spring:message text="Sid" />
					</form:label></td>
					<td>
			<form:input path="Sid"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="Sname">
						<spring:message text="Sname" />
					</form:label></td>
					<td>
			<form:input path="Sname" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Supplier"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Sid </th>
		<th>  Sname </th>
		
		
		</tr>
		
		<c:if test="${!empty supplierlist}">
			<c:forEach items="${supplierlist}" var="supplier">
			<tr>
			<td>${supplier.Sid }</td>
			<td>${supplier.Sname }</td>
						<td><a href="<c:url value='/deleteSupplier/${supplier.Sid}' />" >Delete</a></td>
			<td><a href="<c:url value='/editSupplier/${supplier.Sname}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>


</body>
</html>