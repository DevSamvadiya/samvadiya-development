<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/favicon.png">
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <title>Samvadiya</title>
    <link href="<%=request.getContextPath()%>/scripts/bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/scripts/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/styles/templates/css/animate.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/styles/templates/css/timeline.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/scripts/templates/js/jquery.1.11.1.min.js"></script>
    <script src="<%=request.getContextPath()%>/scripts/bootstrap-3.3.5/js/bootstrap.min.js"></script>
    <!--[if lt IE 9]> 
     <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script> 
     <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> 
     <![endif]-->
     <style>
    #formLogin {
  position: relative;
  margin: 5% auto;
  width: 600px;
  height: 400px;
  background: #FFF;
  border-radius: 2px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
     }
     </style>
</head>

<body class="welcome-page animated fadeIn">
       <div class="row row-welcome">
        <div class="login-page">
            <div class="row">
            <div class="col-sm-9 col-md-9 col-lg-3 mt-4">
            hellllloooo
            </div>
            
                <div class="col-md-4 col-md-offset-4" id="formLogin"> 
<!--                 <img src="images/samvadiya_logo.png" class="user-avatar"><h1>Samvadiya</h1> -->
                    <form:form role="form" action="/SAMVADIYA" class="frm animated flipInX" modelAttribute="loginDomain">
                        <div class="form-content">
                            <div class="form-group">
                                <form:input type="text" path="email" cssClass="form-control input-lg" placeholder="Username or Email"/>
                            </div>
                            <div class="form-group">
                                <form:input type="password" path="password" cssClass="form-control input-lg" placeholder="Password"/>
                            </div>
                        </div>
                        <form:button type="submit" class="btn btn-info btn-lg">Log in</form:button>
                        <a href="#" class="btn btn-info btn-lg btn-frm">Register</a><br>
                        <span class="forgot-password-link btn-frm"><a href="#">Forgot your password?</a><br></span>
                    </form:form>
                    
                <form:form role="Form" class="frm hidden" modelAttribute="loginDomain">
                        <div class="form-content">
                            <div class="form-group">
                                <form:input type="text" path="firstName" class="form-control input-lg" placeholder="First Name"/>
                            </div>
                             <div class="form-group">
                                <form:input type="text" path="middleName" class="form-control input-lg" placeholder="Middle Name"/>
                            </div>
                             <div class="form-group">
                                <form:input type="text" path="lastName" class="form-control input-lg" placeholder="Last Name"/>
                            </div>
                            <div class="form-group">
                                <form:input type="text" path="email" class="form-control input-lg" placeholder="Username or Email"/>
                            </div>
                            <div class="form-group">
                                <form:input type="password" path="password" class="form-control input-lg" placeholder="Password"/>
                            </div>
                        </div> <a href="#" class="btn btn-info btn-lg btn-frm">Log in</a>
                        <form:button type="submit" class="btn btn-info btn-lg">Register</form:button>
                    </form:form>
                    <br>
                     <form:form action="" method="POST" modelAttribute="loginDomain" autocomplete="off" class="frm hidden">
                      <div class="form-content">
                      <div class="form-group">
                        <form:input type="text" path="email" class="form-control " placeholder="Email"/>
                       </div>
                       <form:button type="submit" class="btn btn-info btn-lg btn-frm">Reset Password</form:button>
                       </div>
                        
                      </form:form>
                </div>
            </div>
            
           
            <div class="row">
                <div class="container">
                    <p>
                        <div class="footer-links"> 
                        	<a href="#">Terms of Use</a> | 
                        	<a href="#">Privacy Policy</a> | 
                        	<a href="#">Developers</a> | 
                        	<a href="#">Contact</a> | 
                        	<a href="#">About</a>
                        </div> 
                        Copyright &copy; Company - All rights reserved</p>
                </div>
            </div>
        </div>
    </div>
</body>

<script>
$(document).ready(function() {
		  /*==============  show panel ===============*/
	  $(".btn-frm").click(function(){
	    $(".frm").toggleClass("hidden");
	    $(".frm").toggleClass("animated");
	    $(".frm").toggleClass("flipInX");
	    $(".users-row").addClass('fadeInDown');
	  });
	 
	
})
</script>

</html>