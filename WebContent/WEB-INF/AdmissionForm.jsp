<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<style>
.error {
	color: #ff0000;
}

#rcorners1 {
	border-radius: 8px;
}

#rcorners2 {
	border-radius: 6px;
	border: black;
}
</style>
<body style="background-color: lightgray;">
	<link rel="stylesheet" href="<spring:theme code='styleSheet'/>"
		type="text/css" />
	<form action="/FirstSpringMVCProject/submitAdmissionForm.html"
		method="post">
		<center>
			<p>
				<a href="/FirstSpringMVCProject/admissionform.html?siteTheme=green"><mark>Green</mark></a>
				| <a href="/FirstSpringMVCProject/admissionform.html?siteTheme=red"><mark>Red</mark></a>
			</p>
			<a href="/FirstSpringMVCProject/admissionform.html?siteLanguage=en">English</a>
			| <a href="/FirstSpringMVCProject/admissionform.html?siteLanguage=fr">French</a>
			<h1 style="font-family: sans-serif;">${headermessage }</h1>
			<h3>
				<spring:message code="label.admissionform" />
			</h3>

			<%-- <form:errors path="student1.*" /> --%>


			<p>
				<i><b><spring:message code="label.studentName" /></b></i><br>
				<input id="rcorners1" size="35" type="text" name="studentName" /> <br>
				<form:errors path="student1.studentName" cssClass="error" />
			</p>
			<p>
				<i><b><spring:message code="label.studentHobby" /></b></i><br>
				<input id="rcorners1" size="35" type="text" name="studentHobby" />
				<br>
				<form:errors path="student1.studentHobby" cssClass="error" />
			</p>
			<p>
				<i><b><spring:message code="label.studentMobile" /></b></i><br>
				<input id="rcorners1" size="35" type="text" name="studentMobile" />
				<br>
				<form:errors path="student1.studentMobile" cssClass="error" />
			</p>
			<p>
				<i><b><spring:message code="label.studentDOB" /></b></i><br> <input
					id="rcorners1" size="35" type="text" name="studentDOB" />
			</p>
			<p>
				<i><b><spring:message code="label.studentSkills" /></b></i><br>
				<select id="rcorners2" name="studentSkills">
					<option value="Java Core">Java Core</option>
					<option value="Spring Core">Spring Core</option>
					<option value="Spring MVC">Spring MVC</option>
				</select>
			</p>


			<p>
				<i><b><spring:message code="label.studentAddress" /></b></i>
			</p>

			<p>
				<i><spring:message code="label.country" /></i><input id="rcorners2"
					size="15" type="text" name="studentAddress.country" />
					
				<%-- <form:errors path="student1.studentAddress.country" cssClass="error" /> --%>
					 <i><spring:message
						code="label.city" /></i><input id="rcorners2" size="15" type="text"
					name="studentAddress.city" /> 
					
				<%-- <form:errors path="student1.studentAddress.city" cssClass="error" /> --%>
					<i><spring:message
						code="label.street" /></i><input id="rcorners2" size="15" type="text"
					name="studentAddress.street" /> 
					
				<%-- <form:errors path="student1.studentAddress.street" cssClass="error" /> --%>
					<i><spring:message
						code="label.pincode" /></i><input id="rcorners2" size="15"
					type="text" name="studentAddress.pincode" />
					
				<%-- <form:errors path="student1.studentAddress.pincode" cssClass="error" /> --%>
			</p>
			<table>
				<tr>
					<td>Image</td>
					<td>
						<div>
							<img id="captcha_id" name="imgCaptcha" src="captcha.jpeg">
						</div>
					</td>

				</tr>
				

				<tr>
					<td>Enter above Image text</td>
					<td><input id="rcorners1" type="text" name="captcha" /></td>
				</tr>
				</table>
				
					<td><form:errors path="student1.captcha" cssClass="error" /></td>
				<div style="color:red"><td>${msg } </td></div>
			 
			<p>
				<spring:message code="label.submit.admissionform"
					var="labelsubmitAdmissionForm"></spring:message>
				<input id="rcorners1" type="submit"
					value="${labelsubmitAdmissionForm}" />
			</p>
		</center>
	</form>
</body>
</html>