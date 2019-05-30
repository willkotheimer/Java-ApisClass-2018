package com.cooksys.ftd.sprintboot.service;

import java.util.ArrayList;
import java.util.List;

public class Question {

	
	private String question;
	private List<Answer> answer= new ArrayList<>();
	
	public Question(String question, List<Answer> answer) {
		this.question=question;
		this.answer=answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	


	
	}

