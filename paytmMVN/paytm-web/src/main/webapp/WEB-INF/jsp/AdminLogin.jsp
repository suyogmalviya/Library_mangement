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
<title>Insert title here</title>
</head>
<body>
<h1>Admin login page</h1><br>
<h3 style="color: red;">${invalid}</h3>
<form:form method="POST" action="saveAdminUser.do" modelAttribute="AdminLogin" >
        <table width="100%" border="0">
          <tr>
            <td>
                  <p>
                    User Name
                  </p> <form:input path="Adminname" id="Adminname" /> 
              </td>
          </tr>
          <tr>
            <td>
                  <p>
                    Password
                  </p> <form:password path="Adminpass" id="Adminpass" /> 
              </td>
          </tr>
            
          <tr>
            <td colspan="2"><input type="submit" value="Submit" /></td>
          </tr>
        </table>
     </form:form> 
      
</body>
</html>