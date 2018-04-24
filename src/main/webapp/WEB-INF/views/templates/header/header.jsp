<%-- 
    Document   : header
    Created on : 26 Nov, 2016, 9:13:09 PM
    Author     : avenger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>

      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.html">
            <b>Samvadiya</b>
          </a>
        </div>
          
    <div id="navbar" class="collapse navbar-collapse">
  	<div class="col-md-5 col-sm-3">         
	 <form class="navbar-form">
	    <div class="form-group" style="display:inline;">
	      <div class="input-group" style="display:table;">
	        <input class="form-control" name="search" placeholder="Search..." autocomplete="off" type="text">
	        <span class="input-group-addon" style="width:1%;">
	          <span class="glyphicon glyphicon-search"></span>
	        </span>
		      </div></div>
	  </form>
            </div>        
	<ul class="nav navbar-nav navbar-right">
	<li>
	<a href="profile.html">Pankaj Kumar
          <img src="images/Friends/woman-4.jpg" class="img-nav">
	</a>
	</li>
	<li class="active"><a href="home.html"><i class="fa fa-bars"></i>&nbsp;Home</a></li>
	<li><a href="messages.html"><i class="fa fa-comments"></i></a></li>
	<li class="dropdown">
	    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">	Pages 
            <span class="caret"></span>
	    </a>
        <ul class="dropdown-menu">
            <li><a href="photos.html">Photos</a></li>
            <li><a href="view_photo.html">View photo</a></li>
            <li><a href="friends.html">Friends</a></li>
            <li><a href="user_detail.html">User detail</a></li>
            <li><a href="list_users.html">List users</a></li>
            <li><a href="file_manager.html">File manager</a></li>
            <li><a href="profile_settings.html">Profile settings</a></li>
            <li><a href="people_directory.html">User directory</a></li>
            <li><a href="About.html">About</a></li>
            <li><a href="edit_profile.html">Edit profile</a></li>
            <li><a href="notifications.html">Notifications</a></li>
            <li><a href="blank-cover.html">Blank cover</a></li>
            <li><a href="list_posts.html">List posts</a></li>
            <li><a href="registration_email.html">Registration email</a></li>
            <li><a href="grid_posts.html">Grid posts</a></li>
            <li><a href="error404.html">Error 404</a></li>
            <li><a href="error500.html">Error 500</a></li>
            <li><a href="recover_password.html">Recover password</a></li>
        </ul>
        </li>
        <li><a href="#" class="nav-controller"><i class="fa fa-user"></i></a></li> 			
	</ul> 
      </div></div>
   
</html>
