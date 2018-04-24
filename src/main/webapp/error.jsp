<!DOCTYPE html> 
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   
    <title>ERROR</title>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
         
  </head>
  
 
  
  <body>  
<!--	<div class="container">
            <div class="row">
               <div class="col-lg-12 col-md-12 col-sm-12">
                   <div class="alert alert-danger">
                       <h2>CAUTION! CAUTION!! CAUTION!!!</h2>
                       <h4> MALICIOUS REQUEST DETECTED ON SERVER!!! </h4>
                   </div>
                </div>
            </div>
	</div>-->
        <div class="container">
            <div class="row">
                <div class="col-sm-offset-3  col-sm-6 col-md-offset-3  col-md-6 col-lg-offset-3  col-lg-6">
                    <div class="panel panel-primary ">
                        <div class="main-nav">
                            <h4 style="color:white;">ERROR</h4>
                        </div>
                        <div class="panel-body">
                             An Unexpected error has occured. <br>
                            <a href="<%=request.getContextPath()%>/">Click here</a> for home
                        </div>
                    </div>
                </div>
            </div>
        </div>              
  </body>
</html>