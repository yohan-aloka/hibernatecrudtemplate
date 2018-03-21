package hibernatecrud.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yohan
 *
 */
public class Student {

	private int id;

	private String name;

	private Date dob;

	private int age;

	private String nic;

	private String address;

	private String course;

	private String telephone;

	public Student() {
		super();
	}

	public Student(String name, Date dob, int age, String nic, String address, String course, String telephone) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.nic = nic;
		this.address = address;
		this.course = course;
		this.telephone = telephone;
	}

	public Student(int id, String name, Date dob, int age, String nic, String address, String course,
			String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.nic = nic;
		this.address = address;
		this.course = course;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", nic=" + nic + ", address=" + address
				+ ", course=" + course + ", telephone=" + telephone + "]";
	}

}
