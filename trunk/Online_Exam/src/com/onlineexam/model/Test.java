package com.onlineexam.model;

import java.util.Set;

public class Test {
	private Long testId;
	private String testSubject;
	private int testTotalNoOfQuestions;
	private double testPrice;
	public Long getTestId() {
		return testId;
	}
	public void setTestId(Long testId) {
		this.testId = testId;
	}
	public String getTestSubject() {
		return testSubject;
	}
	public void setTestSubject(String testSubject) {
		this.testSubject = testSubject;
	}
	public int getTestTotalNoOfQuestions() {
		return testTotalNoOfQuestions;
	}
	public void setTestTotalNoOfQuestions(int testTotalNoOfQuestions) {
		this.testTotalNoOfQuestions = testTotalNoOfQuestions;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public int getTestLevel() {
		return testLevel;
	}
	public void setTestLevel(int testLevel) {
		this.testLevel = testLevel;
	}
	public Set<Question> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	private int testLevel;
	private Set<Question> testQuestions;
	
}
