<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%--     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title> User Details</title>  
</head>  
<body>  
<center>  
  
<div style="color: teal;font-size: 30px"> User Details</div>  
<br><br>  
<c:if test="${!empty user}">  
<table border="1" bgcolor="black" width="600px">  
<tr style="background-color: teal;color: white;text-align: center;" height="40px">  
<td>UId</td>  
<td>Uname</td>  
<td>Uaddress</td>  
<td>Uphoneno</td>  
 
</tr>  
<c:forEach items="${user}" var="user">  
<tr style="background-color:white;color: black;text-align: center;" height="30px" >  
<td><c:out value="${user.Uid}"/></td>  
<td><c:out value="${use.Uname}"/></td>  
<td><c:out value="${user.Uaddress}"/></td>  
<td><c:out value="${user.Uphoneno}"/></td>  
</tr>  
</c:forEach>  
</table>  
</c:if>  
<br>  
<a href="register.html" >Click Here to add new User</a>  
</center>  
</body>  
</html>  