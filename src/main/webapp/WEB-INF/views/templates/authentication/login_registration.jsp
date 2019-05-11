 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Samvadiya Login/SignUp/Registration</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/custom/sm.js"></script>
<style type="text/css">ul, li {margin:0;padding:0;}</style>
<c:url value="/" var="login"></c:url>
<c:url value="/create_new_user" var="register"></c:url>
<c:url value="/reset_password" var="resetPassword"></c:url>
</head>
<body>
<div class="user-modal is-visible">
		<div class="user-modal-container">
			<ul class="switcher">
				<li><a href="#SignIn">Log in</a></li>
				<li><a href="#New Account">New account</a></li>
			</ul>
			<div id="login">
			<form:form action="${login}" method="post" id="loginForm" role="form" class='form' modelAttribute="loginDomain">
                        <div class="form-content">
                        <span class="error-message">Invalid Log in Credential!</span>
                          <div class="form-group fieldset">
                                <label class="image-replace email" for="signin-email">E-mail</label>
                                <form:input type="email" required="true" path="email" cssClass="form-control has-padding" placeholder="Username or Email"/>
                            </div>
                            <div class="form-group fieldset">
                            <label class="image-replace password" for="signin-password">Password</label>
                                <form:input type="password" required="true" path="password" cssClass="form-control has-padding" placeholder="Password"/>
                                <a href="#show" class="hide-password">Show</a>
                            </div>
                        <span class="alert alert-link" style="float:left;">
						<input  type="checkbox" id="remember-me" checked>
						<label for="remember-me">Remember me</label>
					    </span>
                        <form:button style="float:right;" type="submit" class="full-width has-padding btn btn-info btn-lg">Log in</form:button>
                        <br>&nbsp;
                        </div>
            </form:form>
			<p class="form-bottom-message alert alert-info"><a href="#forgot">Forgot your password?</a></p>
			</div>

			<div id="signup">
			<form:form action="${register}" method="post" enctype="multipart/form-data" role="Form" class="form" modelAttribute="loginDomain">
                        <div class="form-content">
                        <span class="error-message">Already Registered with SAMAVDIYA</span>
                            <div class="form-group fieldset">
                                <label class="image-replace username" for="signup-username">First Name</label>
                                <form:input type="text" required="true" path="firstName" class="form-control has-padding" placeholder="First Name e.g Pankaj"/>
                                <span class="error-message">Your First Name can only contain alphabet!</span>
                            </div>
                             <div class="form-group fieldset">
                                <label class="image-replace username" for="signup-username">Middle Name</label>
                                <form:input type="text" path="middleName" class="form-control has-padding" placeholder="Middle Name"/>
                                <span class="error-message">Your Middle Name can only contain alphabet!</span>
                            </div>
                             <div class="form-group fieldset">
                                <label class="image-replace username" for="signup-username">Last Name</label>
                                <form:input type="text" required="true" path="lastName" class="form-control has-padding" placeholder="Last Name e.g Kumar"/>
                                <span class="error-message">Your Last Name can only contain alphabet!</span>
                            </div>
                            <div class="form-group fieldset">
                                <label class="image-replace email" for="signup-email">E-mail Id</label>
                                <form:input type="email" required="true" path="email" class="form-control has-padding" placeholder="Email Id e.g. pankaj@abc.com"/>
                                <span class="error-message">Enter a valid email address!</span>
                            </div>
                            <div class="form-group fieldset">
                                <label class="image-replace password" for="signup-password">Password</label>
                                <form:input type="password" required="true" path="password" class="form-control has-padding" placeholder="Password"/>
                                <a href="#0" class="hide-password">Show</a>
                            </div>
                        <span style="float:left;">
						<input type="checkbox" id="accept-terms">
						<label for="accept-terms">I agree to the <a class="accept-terms" href="#terms">Terms &amp; Conditions</a></label>
					    </span>
					   <form:button style="float:right;" type="submit" class="full-width has-padding btn btn-info btn-lg">Register</form:button>
					   <br>&nbsp;
                        </div>
           </form:form>
		</div>

			<div id="reset-password">
				<p class="form-message">Lost your password? Please enter your email address. You will receive a link to create a new password.</p>
                 <form:form action="${resetPassword}" enctype="multipart/form-data" class="form" method="POST" modelAttribute="loginDomain" autocomplete="off">
                      <div class="form-content">
                      <div class="form-group fieldset">
                      <label class="image-replace email" for="signup-email">E-mail Id</label>
                      <form:input type="email" required="true" path="email" class="form-control has-padding" placeholder="Email Id e.g pankaj@abc.com"/>
                      <span class="error-message">Enter a valid email address!</span> 
                       </div>
                       <form:button type="submit" class="btn btn-info btn-lg btn-frm">Reset Password</form:button>
                       </div>
                  </form:form>
		          <p class="form-bottom-message alert alert-info"><a href="#login">Back to log-in</a></p>
          </div>
		</div>
	</div>
</body>
<script>
$('#loginForm').onSubmit(function() {
	alert("Helloo");
	$('#loginForm').submit();
	
});
</script>
</html>