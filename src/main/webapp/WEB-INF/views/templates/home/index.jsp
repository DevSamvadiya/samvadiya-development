<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/favicon.png">
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
    
  
</head>

<body class="welcome-page animated fadeIn">
       <div class="row row-welcome">
        <div class="login-page">
            <div class="row">
            <div class="col-lg-6">
           <h2 class="samvadiya-title">Samvadiya</h2>
           <div class="col-sm-12 col-md-12" id="desktop-title">
           <h4>Samvadiya helps you connect and share with the people in your life.</h4>
           </div>
            </div>
            
                <div class="col-md-5 col-md-offset-1"> 
                <jsp:include page="../authentication/login_registration.jsp"></jsp:include>
                </div>
            </div>
          <div class="row" >
                <div class="container">
                    <p>
                        <div class="footer-links"> 
                        	<a href="#">Terms of Use</a> | 
                        	<a href="#">Privacy Policy</a> | 
                        	<a href="#">Developers</a> | 
                        	<a href="#">Contact</a> | 
                        	<a href="#">About</a>
                        </div> 
                        Copyright &copy; Samvadiya - All rights reserved</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>