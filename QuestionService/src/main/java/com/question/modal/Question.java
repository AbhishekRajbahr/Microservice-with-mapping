package com.question.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long queid;
	private String question;
	private Long quizid;
	public Long getQueid() {
		return queid;
	}
	public void setQueid(Long queid) {
		this.queid = queid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getQuizid() {
		return quizid;
	}
	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}
	public Question(Long queid, String question, Long quizid) {
		super();
		this.queid = queid;
		this.question = question;
		this.quizid = quizid;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [queid=" + queid + ", question=" + question + ", quizid=" + quizid + "]";
	}
	
	
	
}
