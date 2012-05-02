package com.onlineexam.model;

import java.util.Set;

public class Vendor {
	private Long vendorId;
	private String vendorName;
	private String vendorPassword;
	private Set<VendorStudentTest> tests;
	private boolean isVendorActivate;
	public boolean isVendorActivate() {
		return isVendorActivate;
	}
	public void setVendorActivate(boolean isVendorActivate) {
		this.isVendorActivate = isVendorActivate;
	}
	public Set<VendorStudentTest> getTests() {
		return tests;
	}
	public void setTests(Set<VendorStudentTest> tests) {
		this.tests = tests;
	}
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorPassword() {
		return vendorPassword;
	}
	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}
	
}
