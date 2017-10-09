<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Product</title>
</head>
<body>
<h1>List Product</h1>
<h3><a href="add.html">Add Product</a></h3>

<c:if test="${!empty product}">
 <table align="left" border="1">
  <tr>
   <th>Pid</th>
   <th> Pname</th>
   <th>description</th>
   <th>type</th>
   <th>price</th>
  </tr>

  <c:forEach items="${product}" var="product">
   <tr>
    <td><c:out value="${product.Pid}"/></td>
    <td><c:out value="${product.Pname}"/></td>
    <td><c:out value="${product.description}"/></td>
    <td><c:out value="${product.type}"/></td>
    <td><c:out value="${product.price}"/></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
</body>
</html>