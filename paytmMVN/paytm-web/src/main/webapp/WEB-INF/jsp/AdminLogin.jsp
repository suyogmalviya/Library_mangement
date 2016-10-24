<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Bootstrap Snippet: Login Form</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>

        <link rel="stylesheet" href="css/style_admin_login.css">

    
    
  </head>

  <body>

      <div class="wrapper">
    <form class="form-signin">       
      <h2 class="form-signin-heading">Please login</h2>
      
     <form method="POST" action="saveAdminUser.do" modelAttribute="AdminLogin" autocomplete="off">
     
      email id<input type="text" class="form-control" name="Adminname" placeholder="Email Address" required="" autofocus="" />
    <!-- </p> <form:input path="emailId" id="emailId" /> -->
     password <input type="password" class="form-control" name="Adminpass" placeholder="Password" required=""/>      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>
    
    
    
   </form>
  </body>
</html>
