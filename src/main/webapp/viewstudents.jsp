<%@page import="hibernatecrud.model.Student"%>
<%@page import="hibernatecrud.service.StudentService"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	StudentService service = new StudentService();

	List<Student> students = service.getAllStudents();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="addstudent.jsp">Add Students</a>
	<br>
	<table border="1px solid blue">
		<tbody>
			<tr>
				<th>Student ID</th>
				<th>Name</th>
				<th>Birth Date</th>
				<th>Age</th>
				<th>NIC</th>
				<th>Address</th>
				<th>Course</th>
				<th>Telephone</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<%
				for (Student s : students) {
			%>
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getName()%></td>
				<td><%=s.getDob()%></td>
				<td><%=s.getAge()%></td>
				<td><%=s.getNic()%></td>
				<td><%=s.getAddress()%></td>
				<td><%=s.getCourse()%></td>
				<td><%=s.getTelephone()%></td>

				<!--update student -->
				<td style="text-align: center"><a
					href="updatestudent.jsp?id=<%=s.getId()%>" style="color: green">Update</a>
				</td>

				<!--delete student -->
				<td style="text-align: center"><a
					href="StudentController?mode=delete&id=<%=s.getId()%>"
					style="color: red">X</a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>
</html>