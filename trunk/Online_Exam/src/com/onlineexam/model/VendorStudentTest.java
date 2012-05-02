package com.onlineexam.model;

import java.util.Date;

public class VendorStudentTest {
	private VendorStudentTestPK vendorStudentTestPK;
	private Date assignedDate;
	private Date purchasedDate;
	private Date writtenDate;
	private double result;
	public VendorStudentTestPK getVendorStudentTestPK() {
		return vendorStudentTestPK;
	}
	public void setVendorStudentTestPK(VendorStudentTestPK vendorStudentTestPK) {
		this.vendorStudentTestPK = vendorStudentTestPK;
	}
	public Date getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public Date getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Date writtenDate) {
		this.writtenDate = writtenDate;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
}
