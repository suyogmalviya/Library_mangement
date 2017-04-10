<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css\Reg_new.css" rel="stylesheet">
 </head>
 <body background="images\bk12.jpg"`>
 <div class="container" >

   <form:form method="get" action="Registration_New.do" id="signup" >

        <div class="header">
        
            <h3>Sign Up / Registration</h3>
            
            <p>You want to fill out this form</p>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
              
			<label for="Email"> Email</label>  
			<input type="Email" class="mytext" placeholder="e-mail" autofocus />
			
			<label for="FullName"> Full Name</label>  
			<input type="FullName" class="mytext"" placeholder="fullname" autofocus />
			
			<label for="Mobile No"> Mobile Number</label>  
			<input type="MobileNo" class="mytext" placeholder="MobileNumber" autofocus />
			<div id="button1">
			 <input type="radio" name="gender" value="male" checked> Male
             <input type="radio" name="gender" value="female"> Female
			</div>
			
            <label for="Password"> Password</label>  
			<input type="password" class="mytext" placeholder="Password" />
            
            <div class="checkboxy">
                <input name="cecky" id="checky" value="1" type="checkbox" />
				<label class="terms">I accept the terms of use</label>
            </div>
            
            <a id="submit" href="#">Registration</a>
        
        </div>

   </form:form> 

</div>
</body>
</html>