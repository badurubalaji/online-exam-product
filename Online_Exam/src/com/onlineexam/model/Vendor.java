package com.onlineexam.model;

import java.util.List;

public class Vendor {
	
	private Integer vendor_Id;
	private String vendor__First_Name;  
	private String vendor__Last_Name;
	private String vendor_Password;
	private String vendor_EmailId;
	private String is_ACTIVE;
    private List<Test> tests;
	
	public Integer getVendor_Id() {
		return vendor_Id;
	}
	public void setVendor_Id(Integer vendor_Id) {
		this.vendor_Id = vendor_Id;
	}
	public String getVendor__First_Name() {
		return vendor__First_Name;
	}
	public void setVendor__First_Name(String vendor__First_Name) {
		this.vendor__First_Name = vendor__First_Name;
	}
	public String getVendor__Last_Name() {
		return vendor__Last_Name;
	}
	public void setVendor__Last_Name(String vendor__Last_Name) {
		this.vendor__Last_Name = vendor__Last_Name;
	}
	public String getVendor_Password() {
		return vendor_Password;
	}
	public void setVendor_Password(String vendor_Password) {
		this.vendor_Password = vendor_Password;
	}
	public String getVendor_EmailId() {
		return vendor_EmailId;
	}
	public void setVendor_EmailId(String vendor_EmailId) {
		this.vendor_EmailId = vendor_EmailId;
	}
	public String getIs_ACTIVE() {
		return is_ACTIVE;
	}
	public void setIs_ACTIVE(String is_ACTIVE) {
		this.is_ACTIVE = is_ACTIVE;
	}
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

    
    
}
