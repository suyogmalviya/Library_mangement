<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Register page</h1>

<form:form method="POST" action="registerUser.do" modelAttribute="UserRegister">
        <table width="100%" border="0">
          <tr>
            <td>
           		<h6><form:errors path="fullName"></form:errors></h6>
                  <p>
                    Full-Name
                  </p> <form:input path="fullName" id="fullName" /> 
              </td>
          </tr>
          
          <tr>
            <td><h6><form:errors path="mobileNumber"></form:errors></h6>
                  <p>
                    Mobile-Number
                  </p> <form:input path="mobileNumber" id="mobileNumber" /> 
              </td>
          </tr>
          
          
          <tr>
            <td><h6><form:errors path="emailId"></form:errors></h6>            
                  <p>
                    E-mail
                  </p> <form:input path="emailId" id="emailId" /> 
              </td>
          </tr>         
          
          <tr>
            <td><h6><form:errors path="password"></form:errors></h6>
                  <p>
                    Password
                  </p> <form:password path="password" id="password" /> 
              </td>
          </tr>
            
          <tr>
            <td colspan="2"><input type="submit" value="Register" /></td>
          </tr>
        </table>
      </form:form>
      
</body>
</html>