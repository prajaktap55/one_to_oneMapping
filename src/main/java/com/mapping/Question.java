package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@AllArgsConstructor
//@Getter @Setter@ToString
@Entity
public class Question {
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id 
	@Column(name = "ques_Id") // column name=ques_Id
	private int ques_Id;
	private String question;
	
	@OneToOne
	private Answer ans;

	public Question(int ques_Id, String question, Answer ans) {
		super();
		this.ques_Id = ques_Id;
		this.question = question;
		this.ans = ans;
	}

	public int getQues_Id() {
		return ques_Id;
	}

	public void setQues_Id(int ques_Id) {
		this.ques_Id = ques_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

}
