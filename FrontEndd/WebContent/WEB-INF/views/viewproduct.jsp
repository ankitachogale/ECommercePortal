<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   --%>
<h1>Product List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Pid</th><th>Pname</th><th>description</th><th>type</th><th>price<th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${product.Pid}</td>  
   <td>${product.Pname}</td>  
   <td>${product.description}</td>  
   <td>${product.type}</td>  
   <td>${product.price}</td>  
   <td><a href="editproduct/${product.Pid}">Edit</a></td>  
   <td><a href="deleteemp/${product.Pid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="addproduct">Add New Product</a>    
