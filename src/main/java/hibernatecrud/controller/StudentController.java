package hibernatecrud.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernatecrud.model.Student;
import hibernatecrud.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String mode = request.getParameter("mode");

		if (mode.equals("delete")) {
			// delete student
			System.out.println("Delete Student");

			String id = request.getParameter("id");

			// pass id to hibernate delete method


			response.sendRedirect("viewstudents.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String mode = request.getParameter("mode");

		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		String course = request.getParameter("course");
		String telephone = request.getParameter("telephone");

		// set data to model class
		Student student = new Student();
		student.setName(name);
		student.setAge(Integer.parseInt(age));
		student.setNic(nic);
		student.setAddress(address);
		student.setCourse(course);
		student.setTelephone(telephone);

		StudentService studentService = new StudentService();

		System.out.println(student.toString());

		if (mode.equals("Save")) {
			// save student
			System.out.println("Save Student");

			// pass student object to hibernate save method
			
			//

			response.sendRedirect("viewstudents.jsp");

		} else if (mode.equals("Update")) {
			// update student
			String id = request.getParameter("id");

			student.setId(Integer.valueOf(id));
 
			// pass student object to hibernate update method
			
			//
			
			response.sendRedirect("viewstudents.jsp");
		}

	}

}
