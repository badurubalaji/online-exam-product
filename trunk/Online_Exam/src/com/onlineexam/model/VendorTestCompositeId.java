package com.onlineexam.model;

import java.util.Set;

public class VendorTestCompositeId {
	private Set<Vendor>vendor;
	private Set<Student> student;
	private Set<Test> test;
	public Set<Vendor> getVendor() {
		return vendor;
	}
	public void setVendor(Set<Vendor> vendor) {
		this.vendor = vendor;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	public Set<Test> getTest() {
		return test;
	}
	public void setTest(Set<Test> test) {
		this.test = test;
	}

}
