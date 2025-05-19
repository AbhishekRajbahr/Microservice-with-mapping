package com.quiz.modal;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Quizs")

public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long quizid;
	private String title;
	
	transient private List<Question> question;
	public Long getQuizid() {
		return quizid;
	}
	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	public Quiz(Long quizid, String title, List<Question> question) {
		super();
		this.quizid = quizid;
		this.title = title;
		this.question = question;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Quiz [quizid=" + quizid + ", title=" + title + ", question=" + question + "]";
	}
	
}
