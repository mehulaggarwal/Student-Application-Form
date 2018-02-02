
<html>
<body>
	<h1>${headermessage }</h1>

	<h3>congrulation!!! you have submittted your application form</h3>

	<h2>detail submitted by you:</h2>

	<table>
	<tr>
			<td>Student Roll No. :</td>
			<td>${student1.studentRollNo}</td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>student Hobby :</td>
			<td>${student1.studentHobby }</td>
		</tr>
		<tr>
			<td>Student Mobile :</td>
			<td>${student1.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB :</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
		   <td>Student Password :</td>
		   <td>${student1.password }</td>
		</tr>
		<%-- <tr>
			<td>Student Skills :</td>
			<td>${student1.studentSkills}</td>
		</tr> --%>
		
		<%-- <tr>
			<td>Student Address :</td>
		</tr>
		<tr>
			<td>country : ${student1.studentAddress.country }</td>
		</tr>
		<tr>
			<td>city : ${student1.studentAddress.city }</td>
		</tr>
		<tr>
			<td>street : ${student1.studentAddress.street }</td>
		</tr>
		<tr>
			<td>pincode : ${student1.studentAddress.pincode }</td>
		</tr> --%>

	</table>

</body>
</html>