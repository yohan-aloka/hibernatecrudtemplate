package hibernatecrud.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernatecrud.model.Student;

public class StudentService {

	private SessionFactory sessionFactory;

	public StudentService() {
		// Create session factory object
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public void saveOrUpdateStudent(Student student) {
		//save student
	}

	public List<Student> getAllStudents() {
		// get all students
		
		return null;
	}
	
	public Student getStudentById(int id) {
		// get student by id

		return null;
	}

	public void deleteStudent(int id) {
		// delete student
	}
}
