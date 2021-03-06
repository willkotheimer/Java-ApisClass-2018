package cooksys.test;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private List<Answer> answers = new ArrayList<>();
	private String question;
	
	public Question(String question, List<Answer> answer) {
		this.setQuestion(question);
		this.answers=answer;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answers;
	}

	public void setAnswer(List<Answer> answer) {
		this.answers = answer;
	}
}
