package com.onlineexam.model;

public class VendorStudentTestPK {
	private Long vendorId;
	private Long studentId;
	private Long testId;
	
	public VendorStudentTestPK(Long vendorId, Long studentId, Long testId) {
		super();
		this.vendorId = vendorId;
		this.studentId = studentId;
		this.testId = testId;
	}
	public VendorStudentTestPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + ((testId == null) ? 0 : testId.hashCode());
		result = prime * result
				+ ((vendorId == null) ? 0 : vendorId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VendorStudentTestPK))
			return false;
		VendorStudentTestPK other = (VendorStudentTestPK) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		if (testId == null) {
			if (other.testId != null)
				return false;
		} else if (!testId.equals(other.testId))
			return false;
		if (vendorId == null) {
			if (other.vendorId != null)
				return false;
		} else if (!vendorId.equals(other.vendorId))
			return false;
		return true;
	}
	
}
