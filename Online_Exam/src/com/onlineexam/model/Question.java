package com.onlineexam.model;

public class Question {
	
	private Integer ques_Id;
	private String question_Text;
	private String  option1 ;
	private String option2;
	private String option3;
	private String option4;
	private String  correct_Option;
	private String subject;
	
	
	public Integer getQues_Id() {
		return ques_Id;
	}
	public void setQues_Id(Integer ques_Id) {
		this.ques_Id = ques_Id;
	}
	public String getQuestion_Text() {
		return question_Text;
	}
	public void setQuestion_Text(String question_Text) {
		this.question_Text = question_Text;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrect_Option() {
		return correct_Option;
	}
	public void setCorrect_Option(String correct_Option) {
		this.correct_Option = correct_Option;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	

}
