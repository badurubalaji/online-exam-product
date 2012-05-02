package com.onlineexam.model;

import java.util.Set;

public class Student {
	private Long studentId;
	private String studentName;
	private String studentPassword;
	private Set<VendorStudentTest> tests;
	public Set<VendorStudentTest> getTests() {
		return tests;
	}
	public void setTests(Set<VendorStudentTest> tests) {
		this.tests = tests;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
}
