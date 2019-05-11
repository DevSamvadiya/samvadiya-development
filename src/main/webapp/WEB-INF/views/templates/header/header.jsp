<%-- 
    Document   : header
    Created on : 26 Nov, 2016, 9:13:09 PM
    Author     : avenger
--%>
<style>
@media (max-width: 767px) 
{
    .navbar-toggle {
      border: none;
      outline: none;
    }
   #chaupal-m,#notification-m,#user-settings,#search-m{ display: none;};
   #brand-name{color:red};
}
@media (min-width: 768px) 
{
   #Profile-m,#Privace-m,#samvadiya-about-m{display:none;};
}
</style>

   <div class="container">
     <div class="navbar-header">
	    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar1">
<!--           <span class="sr-only">Pankaj Kumar</span> -->
            <span class="sr-only">Toggle navigation</span>
            <span class="icon"><img src="images/Friends/woman-4.jpg" class="img-circle img-nav"></span>
        </button>
            <a class="navbar-brand" href="#" id="brand-name"><i class="fa fa-home"></i></a>
     
           <a class="navbar-toggle" href="#"><i class="fa fa-search"></i></a>
           <a class="navbar-toggle" href="#"><i class="fa fa-bell-o"></i></a>
           <a class="navbar-toggle" href="#"><i class="fa fa-users"></i></a>
           <a class="navbar-toggle" href="#"><i class="fa fa-user"></i></a>
    </div>
         
   
<div id="navbar" class="collapse navbar-collapse">
   <div class="col-md-5 col-sm-3" id="search-m">         
	 <form class="navbar-form" >
	    <div class="form-group" style="display:inline;">
	      <div class="input-group" style="display:table;">
	        <input class="form-control" name="search" placeholder="People,group,place,topic.." autocomplete="off" type="text">
	        <span class="input-group-addon" style="width:1%;">
	          <span class="glyphicon glyphicon-search"></span>
	        </span>
		      </div></div>
	  </form>
    </div>
  	 <ul class="nav navbar-nav navbar-right">
	<li id="chaupal-m"><a href="#" class="nav-controller"><i class="fa fa-users"></i></a></li> 
	<li id="notification-m"><a href="#" class="nav-controller"><i class="fa fa-bell-o"></i></a></li>  
	<li class="dropdown" id="user-settings">
	<a  href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
	<img src="images/Friends/woman-4.jpg" class="img-circle img-nav"> Pankaj Kumar
	</a>
	<ul class="dropdown-menu">
	<li><a href="#">Profile</a></li>
	<li><a href="#">Privacy</a></li>
	<li><a href="#">About Samvadiya</a></li>
	</ul>
	</li>
	<li id="Profile-m"><a href="#" class="nav-controller">Profile</a></li>  
	<li id="Privace-m"><a href="#" class="nav-controller">Privacy &amp; Policy</a></li> 
	<li id="samvadiya-about-m"><a href="#" class="nav-controller">About Samvadiya</a></li> 
    </ul> 
</div>

</div>
   

