<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="viewstudents.jsp">View Students</a>
<h3>Add Student</h3>
	<form action="StudentController" method="post">
		<table>
			<tbody>
				<tr>
					<td>Student Name : </td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Birth Date : </td>
					<td><input type="date" name="dob" /></td>
				</tr>
				<tr>
					<td>Age : </td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>NIC No : </td>
					<td><input type="text" name="nic" /></td>
				</tr>
				<tr>
					<td>Address : </td>
					<td><textarea name="address" cols="30" rows="5"></textarea></td>
				</tr>
				<tr>
					<td>Course : </td>
					<td><input type="text" name="course" /></td>
				</tr>
					<tr>
					<td>Telephone : </td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear"/></td>
					<td><input type="submit" value="Save" name="mode"/></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>