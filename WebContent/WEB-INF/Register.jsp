<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: tahoma;
}

* {
	box-sizing: border-box;
}
/* Full-width input fields */
/* input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
} */
.old {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

.new {
	position: absolute;
	width: 40%;
	padding: 10px;
	background-color: #ddd;
	outline: none;
	border: none;
	left: 50%;
	transform: translateX(-50%);
}
.new1{
position: absolute;
	width: 40%;
	padding: 10px;
	left: 50%;
	transform: translateX(-50%);
}
/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@ -webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}
/* Center the image and position the close button */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 25%;
	border-radius: 50%;
}
/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.center {
	position: absolute;
	left: 50%;
	top: 50%;
	width: auto;
	font-size: 18px;
	transform: translate(-50%, -50%);
}

.upper {
	position: absolute;
	left: 50%;
	top: 10%;
	transform: translate(-50%, 0%);
}

.error {
	color: #ff0000;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
   width: auto;
	padding: 14px 20px;
	background-color: #f44336;
}
.cancelbtn1 {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}
/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

/* Add padding to container elements */
.container {
	padding: 16px;
}

.cenup {
	position: absolute;
	left: 50%;
	top: 30%;
	width: auto;
	font-size: 18px;
	transform: translate(-50%, -30%);
}
span.psw {
    float: right;
    padding-top: 16px;
}
/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: #474e5d;
	padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 35px;
	top: 15px;
	font-size: 40px;
	font-weight: bold;
	color: #f1f1f1;
}

.close:hover, .close:focus {
	color: #f44336;
	cursor: pointer;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .signupbtn {
		width: 100%;

	}
}

</style>
<body>
	<h1 class="upper">YMCAUST,FARIDABAD</h1>

	<button onclick="document.getElementById('id02').style.display='block'"
		class="cenup">Log in</button>
	<div id="id02" class="modal">

		<form class="modal-content animate" action="login.html" method="post">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id02').style.display='none'"
					class="close" title="Close Modal">&times;</span> <img
					src="images/img_avatar2.png" alt="Avatar" class="avatar">
			</div>

			<div class="container">
				<label><b><spring:message
							code="label.studentRollNo" /></b></label> <input type="text"
					placeholder="Enter Roll no." class="old" name="studentRollNo" required>

				<label><b><spring:message
							code="label.studentPassword" /></b></label> <input type="password"
					placeholder="Enter Password" class="old" name="password" required>

				<button type="submit" >Login</button>
				<br>
				<br>
				<label> <input type="checkbox" checked="checked">
					Remember me
				</label>
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<button type="button"
					onclick="document.getElementById('id01').style.display='none'"
					class="cancelbtn1">Cancel</button>
				<span class="psw">Forgot <a href="#">password?</a></span>
			</div>
		</form>
	</div>

	<button onclick="document.getElementById('id01').style.display='block'"
		class="center">Sign Up</button>

	<div id="id01" class="modal animate">
		<span onclick="document.getElementById('id01').style.display='none'"
			class="close" title="Close Modal">&times;</span>
		<form class="modal-content " action="submitadmissionForm.html"
			method="post">
			<div class="container">
				<h1>Sign Up</h1>
				<p>Please fill in this form to create an account.</p>
				<hr>
				<label><b><spring:message code="label.studentName" /></b></label> <input
					type="text" placeholder="Enter Name" class="old" name="studentName"
					required>
				<form:errors path="student1.studentName" cssClass="error" />
				<br> <label><b><spring:message
							code="label.studentRollNo" /></b></label> <input type="text"
					placeholder="Enter Roll No." class="old" name="studentRollNo"
					required>
				<form:errors path="student1.studentRollNo" cssClass="error" />
				<br> <label><b><spring:message
							code="label.studentPassword" /></b></label> <input type="password"
					placeholder="Enter Password" class="old" name="password" required>
				<form:errors path="student1.password" cssClass="error" />
				<br> <label><b><spring:message
							code="label.studentHobby" /></b></label> <input type="text"
					placeholder="Enter Hobby" class="old" name="studentHobby" required>
				<form:errors path="student1.studentHobby" cssClass="error" />
				<br> <label><b><spring:message
							code="label.studentMobile" /></b></label> <input type="text"
					placeholder="Enter Mobile No." class="old" name="studentMobile"
					required>
				<form:errors path="student1.studentMobile" cssClass="error" />
				<br> <label><b><spring:message
							code="label.studentDOB" /></b></label> <input type="text"
					placeholder="Enter DOB" class="old" name="studentDOB" required>
				<form:errors path="student1.studentDOB" cssClass="error" />
				<br>


				<center>
					<img id="captcha_id" name="imgCaptcha" src="captcha.jpeg">
				</center>
				<center>
					<p>Enter the code shown above in the box below</p>
				</center>
				<input type="text" class="new" placeholder="Enter the code"
					name="captcha" required>
				<form:errors path="student1.captcha" cssClass="error" />
				<center>
					<p>${msg}</p>
				</center>
				<br> <br> <label> <input type="checkbox"
					checked="checked" style="margin-bottom: 15px"> Remember me
				</label>

				<p>
					By creating an account you agree to our <a href="#"
						style="color: dodgerblue">Terms & Privacy</a>.
				</p>

				<div class="clearfix">
					<button type="button"
						onclick="document.getElementById('id01').style.display='none'"
						class="cancelbtn">Cancel</button>
					<button type="submit" class="signupbtn">Sign Up</button>
				</div>
			</div>
		</form>
	</div>

	<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>

</body>
<!-- <script>
document.getElementById('id01').style.display = 'block';
</script> -->
</html>
