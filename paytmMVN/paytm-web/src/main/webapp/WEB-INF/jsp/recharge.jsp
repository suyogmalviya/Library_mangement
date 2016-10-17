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
<title>Rechage</title>
</head>
<body>
<h1>login page</h1><br>
<h3 style="color: red;">${msg}</h3>
<form:form method="POST" action="saveRecharge.do" modelAttribute="UserRecharge" >
        <table width="100%" border="0">
          <tr>
            <td>
                  <p>
                    Moble Number
                  </p> <form:input path="mobileNumber" id="mobileNumber" /> 
              </td>
          </tr>
          <tr>
            <td>
                  <p>
                    Amount
                  </p> <form:input path="ammout" id="ammout" /> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Service Provider
                  </p> <form:input path="serviceProvider" id="serviceProvider" /> 
              </td>
          </tr>
            
          <tr>
            <td colspan="2"><input type="submit" value="Recharge" /></td>
          </tr>
        </table>
      </form:form>
      
      <c:choose>
      <c:when test="${empty list}">
      Sorry!! No Detail Found...
      </c:when>
      </c:choose>
      
      <table>
      <c:forEach items="${list}" var="recharge">
      <tr>
      <td>MobileNumber: <c:out value="${recharge.mobileNumber}"></c:out> </td>
      </tr>
      <tr>
      <td><h5>${recharge.mobileNumber}</h5></td>
      </tr>      
      </c:forEach>
      </table>
      
     
      
</body>
</html>