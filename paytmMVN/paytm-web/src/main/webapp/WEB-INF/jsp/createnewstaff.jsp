<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Staff</title>
</head>
<body>
<h1>Create New Staff  page</h1><br>
<h3 style="color: red;">${invalid}</h3>
<%-- <form:form method="POST" action="saveUser.do" modelAttribute="UserLogin" > --%>
        <table width="100%" border="0">
          
          <tr>
            <td>
                  <p>
                    Employee Id
                  <%-- </p> <form:input path="employee_id" id="employee_id" />  --%>
              </td>
          </tr>
          
          
          
          <tr>
            <td>
                  <p>
                    Staff Name
                  <%-- </p> <form:input path="staffname" id="staffname" />  --%>
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    emailid 
               <%--    </p> <form:input path="emailid" id="emailid" />  --%>
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Mobile No 
               <%--    </p> <form:input path="mobno" id="mobno" /> --%> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Department 
                 <%--  </p> <form:input path="department" id="department" />  --%>
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Designation 
                  <%-- </p> <form:input path="designation" id="designation" /> --%> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Address 
                <%--   </p> <form:input path="address" id="address" /> --%> 
              </td>
          </tr>
          
          
          <tr>
            <td>
                  <p>
                    Staff password 
                 <%--  </p> <form:password path="staffpass" id="staffpass" />  --%>
              </td>
          </tr>
          
          
          
          <tr>
            <td>
                  <p>
               Re Enter Staff password 
                 <%--  </p> <form:password path="restaffpass" id="restaffpass" />  --%>
              </td>
          </tr>
            
          <tr>
            <td colspan="2"><input type="submit" value="Submit" /></td>
          </tr>
        </table>
   <%-- </form:form> --%> 
      
</body>
</html>