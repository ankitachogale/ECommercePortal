<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title> Registration Form</title>  
</head>  
<body>  
<center>  
  
<div style="color: teal;font-size: 30px"> Registration Form</div>  
<br><br>  
<c:url var="userRegistration" value="saveUser.html"/>  
<form:form id="registerForm" modelAttribute="user" method="post" action="${userRegistration}">  
<table width="400px" height="150px"> 
<tr>  
<td><form:label path="Id"> Uid</form:label></td>  
<td><form:input  path="Id"/></td>  
</tr>    
<tr>  
<td><form:label path="Name"> Uname</form:label></td>  
<td><form:input  path="Name"/></td>  
</tr>   
<tr>  
<td><form:label path="Uaddress">Uaddress</form:label></td>  
<td><form:select path="Uaddress" items="${model.Uaddress}"></form:select></td>  
</tr>  
<tr>  
<td><form:label path="phone"> Uphoneno</form:label></td>  
<td><form:input  path="phone"/></td>  
</tr>   
<input type="submit" value="Register" />  
</td></tr>  
</table>  
</form:form>  
<br>  
<a href="welcome.html" >Welcome</a>  
</center>  
</body>  
</html>  

