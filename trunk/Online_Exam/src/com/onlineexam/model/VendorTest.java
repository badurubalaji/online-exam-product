package com.onlineexam.model;
import java.util.Date;
import java.util.Set;

public class VendorTest {
	private Set<Vendor> vendorTests;
	private Date purchaseDate;
	private Date writtenDate;
	private Date assignDate;
	private String result;
	private Set<VendorTestCompositeId> vendorTestCompositeId;
	public Set<VendorTestCompositeId> getVendorTestCompositeId() {
		return vendorTestCompositeId;
	}
	public void setVendorTestCompositeId(
			Set<VendorTestCompositeId> vendorTestCompositeId) {
		this.vendorTestCompositeId = vendorTestCompositeId;
	}
	public Set<Vendor> getvendorTests() {
		return vendorTests;
	}
	public void setvendorTests(Set<Vendor> vendorTests) {
		this.vendorTests = vendorTests;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Date writtenDate) {
		this.writtenDate = writtenDate;
	}
	public Date getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Set<Vendor> getVendorTests() {
		return vendorTests;
	}
	public void setVendorTests(Set<Vendor> vendorTests) {
		this.vendorTests = vendorTests;
	}
	
	

}
