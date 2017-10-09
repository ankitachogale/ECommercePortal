<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>AddProduct</title>
 </head>
 <body>
  <h2>Add Product Data</h2>
  <form:form method="POST" action="/dispatcher-servlet/save.html">
      <table>
       <tr>
           <td><form:label path="id">Pid</form:label></td>
           <td><form:input path="id" value="${product.Pid}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Pname:</form:label></td>
           <td><form:input path="name" value="${product.Pname}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">description:</form:label></td>
           <td><form:input path="age" value="${product.description}"/></td>
       </tr>
       <tr>
           <td><form:label path="salary">type:</form:label></td>
           <td><form:input path="salary" value="${product.type}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="address">price</form:label></td>
                    <td><form:input path="address" value="${product.price}"/></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
  <c:if test="${!empty product}">
  <h2>List Product</h2>
 <table align="left" border="1">
  <tr>
   <th>Pid</th>
   <th>Pname</th>
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
    <td align="center"><a href="edit.html?id=${product.Pid}">Edit</a> | <a href="delete.html?id=${product.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>
