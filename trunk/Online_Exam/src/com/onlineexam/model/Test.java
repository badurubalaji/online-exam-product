package com.onlineexam.model;

import java.util.Date;

public class Test {
	
	private Integer test_Id;
	private String subject;
	private Integer duration;
	private Double price;
	private Integer total_No_Of_Questions;
	private Date purchased_Date;
	private Date assigned_Date;
	private String assigned_To;
	private Date test_TakenDate;
	private Integer result;
	private Vendor vendorDetails;
	
	public Integer getTest_Id() {
		return test_Id;
	}
	public void setTest_Id(Integer test_Id) {
		this.test_Id = test_Id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTotal_No_Of_Questions() {
		return total_No_Of_Questions;
	}
	public void setTotal_No_Of_Questions(Integer total_No_Of_Questions) {
		this.total_No_Of_Questions = total_No_Of_Questions;
	}
	public Date getPurchased_Date() {
		return purchased_Date;
	}
	public void setPurchased_Date(Date purchased_Date) {
		this.purchased_Date = purchased_Date;
	}
	public Date getAssigned_Date() {
		return assigned_Date;
	}
	public void setAssigned_Date(Date assigned_Date) {
		this.assigned_Date = assigned_Date;
	}
	public String getAssigned_To() {
		return assigned_To;
	}
	public void setAssigned_To(String assigned_To) {
		this.assigned_To = assigned_To;
	}
	public Date getTest_TakenDate() {
		return test_TakenDate;
	}
	public void setTest_TakenDate(Date test_TakenDate) {
		this.test_TakenDate = test_TakenDate;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public Vendor getVendorDetails() {
		return vendorDetails;
	}
	public void setVendorDetails(Vendor vendorDetails) {
		this.vendorDetails = vendorDetails;
	}

	

}
