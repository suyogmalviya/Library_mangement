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
<form:form method="POST" action="saveNewStaff.do" modelAttribute="Createnewstaff" > 
        <table width="100%" border="0">
          
          <tr>
            <td>
                  <p>
                    Employee Id
                 </p> <form:input path="employee_id" id="employee_id" /> 
              </td>
          </tr>
          
          
          
          <tr>
            <td>
                  <p>
                    Staff Name
                   </p> <form:input path="staffname" id="staffname" /> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    emailid 
                   </p> <form:input path="emailid" id="emailid" /> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Mobile No 
               </p> <form:input path="mobno" id="mobno" />  
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Department 
                   </p> <form:input path="department" id="department" /> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Designation 
                   </p> <form:input path="designation" id="designation" /> 
              </td>
          </tr>
          
          <tr>
            <td>
                  <p>
                    Address 
                   </p> <form:input path="address" id="address" />  
              </td>
          </tr>
          
          
          <tr>
            <td>
                  <p>
                    Staff password 
                 </p> <form:password path="staffpass" id="staffpass" /> 
              </td>
          </tr>
          
          
          
          <tr>
            <td>
                  <p>
               Re Enter Staff password 
                   </p> <form:password path="restaffpass" id="restaffpass" /> 
              </td>
          </tr>
            
          <tr>
            <td colspan="2"><input type="submit" value="Submit" /></td>
          </tr>
        </table>
   </form:form> 
      
</body>
</html>



<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="country" action="/SpringMVCHibernateCRUDExample/addCountry">
<table>
		<tr>
			<th colspan="2">Create new staff </th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="countryName">Country Name:</form:label></td>
          <td><form:input path="countryName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="population">Population:</form:label></td>
          <td><form:input path="population" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Country List</h3>
<c:if test="${!empty listOfCountries}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Country Name</th>
		<th width="120">Population</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfCountries}" var="country">
		<tr>
			<td>${country.id}</td>
			<td>${country.countryName}</td>
			<td>${country.population}</td>
			<td><a href="<c:url value='/updateCountry/${country.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteCountry/${country.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
 --%>