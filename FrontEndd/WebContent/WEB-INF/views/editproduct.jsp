<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     --%>
  
        <h1>Edit Product</h1>  
       <form:form method="POST" action="/FrontEndd/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Pid : </td>   
          <td><form:input path="Pid"  /></td>  
         </tr>    
         <tr>    
          <td>Pname :</td>    
          <td><form:input path="Pname" /></td>  
         </tr>   
         <tr>    
          <td>Description :</td>    
          <td><form:input path="description" /></td>  
         </tr>   
           <tr>    
          <td>Description :</td>    
          <td><form:input path="description" /></td>  
         </tr> 
         <tr>    
          <td>type :</td>    
          <td><form:input path="type" /></td>  
         </tr>  
         <tr>    
          <td>price :</td>    
          <td><form:input path="price" /></td>  
         </tr>     
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>  