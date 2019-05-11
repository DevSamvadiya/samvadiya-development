<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
 <script type="text/javascript">
                var app = angular.module("Samvaad", []);
 
                app.controller("SamvaadController", function($scope, $http) {
                	
               //**************************GET DATA************************************                	
                $scope.userComment = [];
            	_refreshComment();                
             function _refreshComment() {
            	          $http({
                        method : 'GET',
                        url : 'http://localhost:8080/SAMVADIYA/rest/getDailyNews'
                    }).then(function successCallback(response) {
                    	alert(" Hello "+response);
                        $scope.userComment = response.data;
                    }, function errorCallback(response) {
                        alert(response.statusText);
                    });
                }
             
           
         });
</script>


</head>
<body ng-app="Samvaad" ng-controller="SamvaadController">
<h1><a href="/SAMVADIYA/samvaad/getSamvaad#">Click Here</a></h1>

<table border="1">
  <tr ng-repeat="data in userComment">
    <td> {{data.userId}}</td> <td> 
    <table border="1">
    <tr><td>{{data.dailyNewsTitle}}</td><td>{{data.dailyNews}}</td></tr>
    <tr><td style="text-align:center" colspan="2"></td></tr>
    </table></td>
  </tr>
</table>
</body>
</html>


