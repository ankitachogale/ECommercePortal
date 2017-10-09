<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>

<c:url var="addproduct" value="/product/add" ></c:url>
<form:form action="${addproduct }" commandName="product">
<table>
			<tr>
			<td><form:label path="Pid">
						<spring:message text="Pid" />
					</form:label></td>
					<td>
			<form:input path="Pid"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="Pname">
						<spring:message text="Pname" />
					</form:label></td>
					<td>
			<form:input path="Pname" type="text"/></td>
			<td>
			</tr>
			<tr>
			<td><form:label path="description">
						<spring:message text="description" />
					</form:label></td>
					<td>
			<form:input path="description" type="text"/></td>
			<td>
			</tr>
			<tr>
			<td><form:label path="type">
						<spring:message text="type" />
					</form:label></td>
					<td>
			<form:input path="type" type="type"/></td>
			<td>
			</tr>
			<tr>
			<td><form:label path="price">
						<spring:message text="price" />
					</form:label></td>
					<td>
			<form:input path="price" type="text"/></td>
			<td>
			</tr>
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Pid </th>
		<th>  Pname </th>
		<th> description </th>
		<th> type </th>
		<th>price</th>
		
		</tr>
		
		<c:if test="${!empty produclist}">
			<c:forEach items="${productlist}" var="product">
			<tr>
			<td>${product.Pid }</td>
			<td>${product.Pname }</td>
			<td>${product.description}</td>
			<td>${product.type}</td>
			<td>${product.price}</td>
			<td><a href="<c:url value='/deleteProduct/${product.Pid}' />" >Delete</a></td>
			<td><a href="<c:url value='/editProduct/${product.Pid}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>


</body>
</html>