package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id  
	@Column(name = "ans_Id")
	private int ans_Id;
	private String answer;
	
	@OneToOne //
	private Question ques;

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	public Answer(int ans_Id, String answer) {
		super();
		this.ans_Id = ans_Id;
		this.answer = answer;
	}

	public int getAns_Id() {
		return ans_Id;
	}

	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
