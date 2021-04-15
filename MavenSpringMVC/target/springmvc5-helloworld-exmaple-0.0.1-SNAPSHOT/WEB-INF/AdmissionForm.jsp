<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags"%>
<html>
<head>
<title>Admission Form</title>
</head>

<body>
	<h1>${headerMsg}</h1>

	<form:errors path = "student.*"/>
	<form action="/CollegeAdmissionPortal1/submitAdmissionForm.html"
		method="post">

		<table>
			<tr>
				<td><spring:message code="label.studentName"/></td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentHobby"/></td>
				<td><input type="text" name="studentHobby" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentMobile"/></td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentDOB"/></td>
				<td><input type="text" name="studentDOB" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentSkills"/></td>
				<td><select name="studentSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select></td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td><spring:message code="label.street"/></td> <td><input type="text" name="studentAddress.street" /></td>
				<td><spring:message code="label.city"/></td> <td><input type="text" name="studentAddress.city" /></td>
				<td><spring:message code="label.country"/></td> <td><input type="text" name="studentAddress.country" /></td>
				<td><spring:message code="label.pin"/></td> <td><input type="text" name="studentAddress.pin" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="click here for submit"></td>
			</tr>
		</table>
		
	</form>
</body>
</html>