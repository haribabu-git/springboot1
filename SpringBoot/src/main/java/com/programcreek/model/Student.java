package com.programcreek.model;

public class Student {
	public int studentId;
	public String firstName;
	public String lanstName;
	//welcome
	public Student(){};
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Student(int studentId, String firstName, String lanstName) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lanstName = lanstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLanstName() {
		return lanstName;
	}
	public void setLanstName(String lanstName) {
		this.lanstName = lanstName;
	}

}
