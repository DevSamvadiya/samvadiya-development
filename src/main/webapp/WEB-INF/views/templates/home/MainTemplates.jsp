<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="/WEB-INF/tld/displaytag.tld" prefix="display" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%  String host = request.getContextPath();  %>
<html lang="en">
  <head>
     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="cache-control" content="max-age=0, must-revalidate, no-cache, no-store, private">
    <meta http-equiv="expires" content="-1">
    <meta http-equiv="pragma" content="no-cache">
    <link rel="icon" href="images/favicon.png">
    <link href="<%=request.getContextPath()%>/scripts/bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/scripts/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/styles/templates/css/animate.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/styles/templates/css/timeline.css" rel="stylesheet">
    <!--[if lt IE 9]> 
     <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script> 
     <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> 
     <![endif]-->
    <title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
    <%
        response.setHeader("pragma","no-cache");//HTTP 1.1
        response.setHeader("Cache-Control","no-cache");    
        response.addDateHeader("Expires", -1);
        response.setDateHeader("max-age", 0);
        response.addHeader("cache-Control", "private");
    %> 
     
<body class="animated fadeIn">
    
    <!--**************************Header***********************************-->
    <nav class="navbar navbar-default navbar-fixed-top navbar-principal">
    <tiles:insertAttribute name="header"></tiles:insertAttribute>
    </nav>
   <!--**************************End Header***********************************-->
   
   <!-- **************************Timeline content****************************** -->
   <div class="container-fluid" style="margin-top:35px;">
   <tiles:insertAttribute name="userStyle"></tiles:insertAttribute>
   </div>
   <!-- *********************end timeline content********************************-->
       
     
    
    <!--**************************Footer***********************************-->
    <footer class="welcome-footer">
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    </footer>
    <!--**************************End Footer***********************************-->
        



</body>


  <script src="<%=request.getContextPath()%>/scripts/templates/js/jquery.1.11.1.min.js"></script>
  <script src="<%=request.getContextPath()%>/scripts/bootstrap-3.3.5/js/bootstrap.min.js"></script>
  <script src="<%=request.getContextPath()%>/scripts/templates/js/custom.js"></script>
</html>
