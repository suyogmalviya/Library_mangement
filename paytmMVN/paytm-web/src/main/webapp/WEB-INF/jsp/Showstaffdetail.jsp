<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
      
    <h1>Staff List</h1>  
    <table border="2" width="70%" cellpadding="2">  
    <tr><th>employee_id</th><th>staffname</th><th>emailid</th><th>mobno</th><th>department</th><th>designation</th><th>address</th><th>staffpass</th><th>restaffpass</th></tr>  
       <c:forEach var="l3" items="${staff_detail}">   
       <tr>  
       <td>${l3.employee_id}</td>  
       <td>${l3.staffname}</td>  
       <td>${l3.emailid}</td>  
       <td>${l3.mobno}</td>  
       <td>${l3.department}</td>  
       <td>${l3.designation}</td>  
       <td>${l3.address}</td>  
       <td>${l3.staffpass}</td>  
       <td>${l3.restaffpass}</td>  
       
       <td><a href="editemp/${emp.id}">Edit</a></td>  
       <td><a href="deleteemp/${emp.id}">Delete</a></td>  
       </tr>  
       </c:forEach>  
       </table>  
       <br/>  
       <a href="empform">Add New Staff</a>  

