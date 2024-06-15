<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring User Details</title>
</head>
<body>
	<h1>User Details</h1>
	<article>
		<table>
			<tbody>
				<tr>
					<td>User First Name :</td>
					<td><strong>${fname}</strong></td>
				</tr>
				<tr>
					<td>User Last Name :</td>
					<td><strong>${lname}</strong></td>
				</tr>
				<tr>
					<td>User Age :</td>
					<td><strong>${age}</strong></td>
				</tr>
				<tr>
					<td>User Gender :</td>
					<td><strong>${gender}</strong></td>
				</tr>
				<tr>
					<td>User City :</td>
					<td><strong>${city}</strong></td>
				</tr>
			</tbody>
		</table>
	</article>
</body>
</html>