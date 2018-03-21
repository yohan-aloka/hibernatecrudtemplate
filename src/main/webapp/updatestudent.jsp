<%@page import="hibernatecrud.service.StudentService"%>
<%@page import="hibernatecrud.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String studentId = request.getParameter("id");

	Student student = new StudentService().getStudentById(Integer.valueOf(studentId));

	request.setAttribute("student", student);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Student</title>
</head>
<body>
	<a href="addstudent.jsp">Add Students</a>
	<a href="viewstudents.jsp">View Students</a>

	<h3>Update Student</h3>
	<form action="StudentController" method="post">
		<input type="hidden" name="id" value="<%=studentId%>">
		<table>
			<tbody>
				<tr>
					<td>Student Name :</td>
					<td><input type="text" name="name" value="${student.name}" /></td>
				</tr>
				<tr>
					<td>Birth Date : </td>
					<td><input type="date" name="dob" value="${student.dob}" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><input type="text" name="age" value="${student.age}" /></td>
				</tr>
				<tr>
					<td>NIC No :</td>
					<td><input type="text" name="nic" value="${student.nic}" /></td>
				</tr>
				<tr>
					<td>Address :</td>
					<td><textarea name="address" cols="30" rows="5">${student.address}</textarea></td>
				</tr>
				<tr>
					<td>Course :</td>
					<td><input type="text" name="course" value="${student.course}" /></td>
				</tr>
				<tr>
					<td>Telephone :</td>
					<td><input type="text" name="telephone"
						value="${student.telephone}" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear" /></td>
					<td><input type="submit" value="Update" name="mode" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>