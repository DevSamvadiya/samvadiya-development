            <body ng-app="Samvaad" ng-controller="SamvaadController">
  <div class="row">
    <div class="col-md-8 no-paddin-xs">
    <br>
      <div class="row">
	<!-- left content-->
      <div class="profile-nav- col-md-4" id="friendsActivity">
	<!-- Friends activity -->
	<div class="widget">
	  <div class="widget-header">
	    <h3 class="widget-caption">Friends activity</h3>
	  </div>
      <div class="widget-body bordered-top bordered-blue">
  	<div class="content">
	 <ul class="list-unstyled team-members">
          
    <li ng-repeat="data in friendsActivity" ng-cloak>
     <div class="row"><div class="col-xs-2">
            <div class="avatar">
                <img  src="{{data.imgUrl}}" alt="img" class="img-circle img-no-padding img-responsive">
           </div></div>
      <div class="col-xs-9" style="font-size:12px">
        <b><a href="#">{{data.name}}</a></b> {{data.remarks}}
	    <b><a href="#">post</a></b>
        <span class="timeago" >{{data.createdDate}}</span>
      </div>
     </div>
    </li>
    
   </ul>					

  	</div></div></div>
    <!-- End Friends activity -->

    <!-- People You May Know -->
    <div class="widget">
       <div class="widget-header">
       <h3 class="widget-caption">People You May Know</h3>
       </div>
    <div class="widget-body bordered-top bordered-blue">
       <div class="content">
       <ul class="list-unstyled team-members">
       <li>
       <div class="row">
         <div class="col-xs-3"><div class="avatar">
         <img src="images/Friends/guy-2.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
       </div></div>
       <div class="col-xs-6">Carlos marthur</div>
         <div class="col-xs-3 text-right">
          <btn class="btn btn-sm btn-info btn-icon"><i class="fa fa-user-plus"></i></btn>
         </div>
       </div>
       </li>

       <li>
        <div class="row">
          <div class="col-xs-3"><div class="avatar">
           <img src="images/Friends/woman-1.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
          </div></div>
        <div class="col-xs-6">Maria gustami</div>
        <div class="col-xs-3 text-right">
            <btn class="btn btn-sm btn-info btn-icon"><i class="fa fa-user-plus"></i></btn>
        </div>
        </div>
      </li>
      <li>
        <div class="row">
         <div class="col-xs-3"><div class="avatar">
          <img src="images/Friends/woman-2.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
         </div></div>
        <div class="col-xs-6">Angellina mcblown</div>
        <div class="col-xs-3 text-right">
            <btn class="btn btn-sm btn-info  btn-icon"><i class="fa fa-user-plus"></i></btn>
        </div></div>
      </li>
    </ul>
       </div></div></div>
    <!-- End people yout may know -->
    
    											 			      
  </div>
    <!-- end left content-->
    
    
    <!-- right  content-->

  <div class="profile-info col-md-8 animated fadeInUp">
       <div class="row">
       <div class="col-md-12"><div class="panel profile-info">
    <form>
       <textarea class="form-control input-lg p-text-area" rows="1" placeholder="Whats in your mind today?"></textarea>
    </form>

  <div class="panel-footer">
      <button type="button" class="btn btn-info pull-right">Post</button>
       <ul class="nav nav-pills">
        <li><a href="#"><i class="fa fa-map-marker"></i></a></li>
        <li><a href="#"><i class="fa fa-camera"></i></a></li>
        <li><a href="#"><i class="fa fa-film"></i></a></li>
        <li><a href="#"><i class="fa fa-microphone"></i></a></li>
       </ul>
  </div>
  </div></div>		
  
  	  	
  	  	
  	  	
  	  	
  <!-- post -->
  <div class="col-md-12" ng-repeat="userData in userSamvaad | limitTo:samvaadLimit" ng-cloak>
    <div class="box box-widget"><div class="box-header with-border">
     <div class="user-block">
      <img class="img-circle" src="{{userData.profileImgUrl}}" alt="Loading">
      <span class="username"><a href="#">{{userData.name }}</a></span>
      <span class="description">Samvaad - {{ userData.createddate }}</span>
     </div>
     <div class="box-tools">
      <button type="button" class="btn btn-box-tool" data-toggle="tooltip" title="" data-original-title="Mark as read">
      <i class="fa fa-circle-o"></i></button>
      <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
      <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
     </div>
  </div>
     <div class="box-body">
   <span ng-if='userData.imgPos=="T"'><img class="img-responsive pad" alt="Loading img.." src="{{userData.imgUrl}}"></img></span>
   <p> {{ userData.samvaad }}</p>
   <span ng-if='userData.imgPos=="B"'><img class="img-responsive pad" alt="Loading img.." src="{{userData.imgUrl}}"></img></span>
   
   
<!--      <div class="attachment-block clearfix"> -->
<!--      <img class="attachment-img" src="images/Photos/6.jpg" alt="Attachment Image"> -->
<!--      <div class="attachment-pushed"> -->
<!--      <h4 class="attachment-heading"><a href="#">Lorem ipsum text generator</a></h4> -->
<!--     <div class="attachment-text"> -->
<!--      Description about the attachment can be placed here. -->
<!--      Lorem Ipsum is simply dummy text of the printing and typesetting industry... <a href="#">more</a> -->
<!--     </div> -->
<!--     </div></div> -->
    
    <button type="button" class="btn btn-default btn-xs"><i class="fa fa-share"></i> Share</button>
    <button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button>
    <span class="pull-right text-muted">45 likes - 2 comments</span>
   </div>
    <div class="box-footer">
     <form action="#" method="post">
     <img class="img-responsive img-circle img-sm" src="images/Friends/woman-4.jpg" alt="Alt Text">
   <div class="img-push">
     <input type="text" class="form-control input-sm" placeholder="Press enter to post comment">
   </div>
     </form>
   </div>  
    <div class="box-footer box-comments" style="padding-bottom:20px">
     <div class="box-comment" ng-repeat="comment in userSamvaadComment[userData.userId+userData.samvaadId] | limitTo:commentLimit" ng-cloak>
      <img class="img-circle img-sm" src="{{comment.commentUserProfileImg}}" alt="Loading..">
      <div class="comment-text">
      <span class="username" >{{comment.name}} <span class="text-muted pull-right">{{comment.commentDate}}</span></span>
      {{comment.comment}}
      </div>
     </div>
     <span ng-click='loadMoreComment()' style="cursor:pointer;" class="text-muted pull-right">View More Comment</span>
    </div>
    
    
    
  
 </div></div><!-- end post-->
 
 </div>

				<div class="panel panel-white post-load-more panel-shadow text-center">

					<button ng-click='loadMoreSamvaad()' class="btn btn-info"><i class="fa fa-refresh"></i>Load More...</button>

				</div></div><!--end right  content-->

			</div></div>
<!--*****************************************************************************Right Most Side**************************-->
        <div class="row" id='RightColumn'>
            <br>
            <div id="liveNews" class="col-lg-2 animated fadeInUp" style="background:white;">
               <div class="text-left" ng-repeat="dailyData in dailyNews">
                        <img class="card-img-top" src="{{dailyData.image}}" alt="" width="100%">
                        <div class="card-block">
                              <h5 class="card-title"><a  href="#">{{dailyData.newsTitle}}</a></h5>
                            <p class="card-text">{{dailyData.dailyNews}}.</p>
                           
                        </div>
                        <hr/>
                     </div>
        </div>
        
        
<!--************************************************************************Right Side2***************************************-->
<div id="unexploreArea" class="col-md-2 no-paddin-xs">
       <div class="widget" style="border:solid 1px #a6e1ec;background:white" >
       <div class="widget-header ">
	    <h3 class="widget-caption">Unexplored Places Near You</h3>
       </div>
         <div class="col-mod-12 animated fadeInUp">
               <div class="box-body">
     <img class="img-responsive" src="images/unexplored/kutub.jpg" alt="Photo">
     <p class="card-text">Kutub Minar, New Delhi</p>
<!--      <button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button> -->
<!--      <span class="pull-right text-muted">127 likes</span> -->
     </div></div>
   
     <div class="col-mod-12 animated fadeInUp" >
               <div class="box-body">
     <img class="img-responsive" src="images/unexplored/hauzkhas.jpg" alt="Photo">
     <p class="card-text">Hauz Khas Village, New Delhi</p>
<!--      <button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button> -->
<!--      <span class="pull-right text-muted">127 likes</span> -->
     </div></div>
     <div class="col-mod-12 animated fadeInUp">
               <div class="box-body">
     <img class="img-responsive" src="images/unexplored/chhatarpur.jpg" alt="Photo">
     <p class="card-text">Chhatarpur Temple, New Delhi</p>
<!--      <button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button> -->
<!--      <span class="pull-right text-muted">127 likes</span> -->
     </div></div>
	 </div></div>
            
            </div>
        
        
        </div>
        
 </body>       
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
 <script type="text/javascript">
//                 var domain='http://192.168.43.94:8080';
                   var domain='http://localhost:8080';
                var app = angular.module("Samvaad", []);
                app.controller("SamvaadController", function($scope, $http) { 
                	$scope.userSamvaad = [];
                	$scope.userSamvaadComment = [];
                	$scope.friendsActivity = [];
                	$scope.dailyNews = [];
                	
            	_refreshSamvaadData();                
             function _refreshSamvaadData() {
                    $http({
                        method : 'GET',
                        url :domain+'/SAMVADIYA/rest/getSamvaad'
                    }).then(function successCallback(response) {
                    	alert(" Samvaad "+response.data[0].samvaad+" "+response.data[2].profileImgUrl);
                        $scope.userSamvaad = response.data;
                    }, function errorCallback(response) {
                        alert(response.statusText);
                    });
                }
           //****************************LOAD MORE Samvaad**************************
             $scope.samvaadLimit= 2;
             $scope.loadMoreSamvaad = function() {
            	 $scope.samvaadLimit = $scope.samvaadLimit + 5;
            	}
             
             
             _refreshComment();                
             function _refreshComment() {
                    $http({
                        method : 'GET',
                        url :domain+'/SAMVADIYA/rest/getComment'
                    }).then(function successCallback(response) {
                    	alert(" Comment "+response.data);
                        $scope.userSamvaadComment = response.data;
                    }, function errorCallback(response) {
                        alert(response.statusText);
                    });
                }
             
             
           //****************************LOAD MORE Comment**************************
             $scope.commentLimit= 2;
             $scope.loadMoreComment = function() {
            	 $scope.commentLimit = $scope.commentLimit + 5;
            	}
             
             
             _refreshFriendsActivity();                
             function _refreshFriendsActivity() {
                    $http({
                        method : 'GET',
                        url :domain+'/SAMVADIYA/rest/getFriendsActivity'
                    }).then(function successCallback(response) {
                    	alert(" Friends Activity  "+response.data);
                        $scope.friendsActivity = response.data;
                    }, function errorCallback(response) {
                        alert(response.statusText);
                    });
                }
             
             
             
             _refreshDailyNews();                
             function _refreshDailyNews() {
                    $http({
                        method : 'GET',
                        url :domain+'/SAMVADIYA/rest/getDailyNews'
                    }).then(function successCallback(response) {
                    	alert(" daily news  "+response.data);
                        $scope.dailyNews = response.data;
                    }, function errorCallback(response) {
                        alert(response.statusText);
                    });
                }
             
             
         });
        </script>
