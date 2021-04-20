<html>
<body>
	<h1>${headerMsg}</h1>

	<h2>Congratulations..! Your application processed successfully.</h2>

	<h3>${msg}</h3>

	<table>
		<tr>
			<td>Student Name:</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td>${student.studentAddress.street} ${student.studentAddress.city} 
				${student.studentAddress.country} ${student.studentAddress.pin} </td>
		</tr>
	</table>
</body>
</html>