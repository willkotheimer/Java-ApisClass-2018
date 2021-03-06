package com.cooksys.ftd.sprintboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cooksys.ftd.sprintboot.exceptions.QuizNotFound;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class QuizService {

	// real bad code
	private List<Quiz> quizzes = new ArrayList<>();

	public QuizService() {

		// Question "Do you need anything?"
		Answer answer1 = new Answer("no", false);
		Answer answer2 = new Answer("I need sleep", false);
		Answer answer3 = new Answer("I need to eat", false);
		Answer answer4 = new Answer("yes", true);

		ArrayList<Answer> Answers = new ArrayList<>();

		Answers.add(answer1);
		Answers.add(answer2);
		Answers.add(answer3);
		Answers.add(answer4);

		List<Question> quiz1 = new ArrayList<>();

		// Question "Do you want anything?"
		Answer answer5 = new Answer("no", false);
		Answer answer6 = new Answer("I want an xbox", false);
		Answer answer7 = new Answer("I want a new car", false);
		Answer answer8 = new Answer("I want a million dollars", true);

		ArrayList<Answer> Answers2 = new ArrayList<>();

		Answers2.add(answer5);
		Answers2.add(answer6);
		Answers2.add(answer7);
		Answers2.add(answer8);

		quiz1.add(new Question("Do you need anything?", Answers));
		quiz1.add(new Question("Do you want anything", Answers2));
		this.quizzes.add(new Quiz("Quiz1", quiz1));
		
	}

	//newName cannot be null
	public Quiz rename(String name, String newname) throws QuizNotFound {
		name = name.toLowerCase();
		newname = newname.toLowerCase();
		for (Quiz quiz : this.quizzes) {
			if (name.equals(quiz.getName().toLowerCase())) {
				quiz.setName(newname);
				return quiz;
			}
		}
		return null;
	}

	public Quiz getQuiz(String name) throws QuizNotFound {
		name = name.toLowerCase();
		for (Quiz quiz : this.quizzes) {
			if (name.equals(quiz.getName().toLowerCase())) {
				return quiz;
			}
		}
		return null;
	}

	public List<Quiz> getQuizzes() {
		return this.quizzes;
	}

	public Question getRandomQuestion(String quizName) throws QuizNotFound {

		Quiz quiz = getQuiz(quizName);
		int maximum = quiz.getQuiz().size();

		// create instance of Random class
		Random rand = new Random();

		
		int rand_int1 = rand.nextInt(maximum);
		return quiz.getQuiz().get(rand_int1);

		// Print random integers

	}
	
	public Quiz addQuestion(Question question, String name) throws QuizNotFound {
		//needs error catches
		// MalFormed Question, no question / No such Quiz
		Quiz q = getQuiz(name);
		q.getQuiz().add(question);
		
		return q;
	}
	
	//Easiest way to allow any amount of questions is to pass this to the user
	
	public Quiz AddQuiz(Quiz quiz) throws MalformedInputException {
		//MalformedQuizException
		
		this.quizzes.add(quiz);
		return quiz;
		
	}

	//Create a no quiz found exception
	public Quiz deleteQuiz(String quizName) throws QuizNotFound {
		Quiz copiedQuiz = null;
		//Iterate through the quizzes to delete the Quiz
		for (int j = 0; j < quizzes.size()-1; j++) {
			if (quizzes.get(j).getName().toString()==quizName) {
				//Delete the required quiz
				copiedQuiz = quizzes.get(j);
				quizzes.remove(j);
			}  
		}
		
		return copiedQuiz;
	}

	//Create a no Quiz found exception
	
	public Question deleteQuestion(String quizName,Question question) throws QuizNotFound {
		Quiz quiz = getQuiz(quizName);
		//Iterate through the deleted questions and return the old one.
		for (int j = 0; j < quiz.getQuiz().size()-1; j++) {
			if (quiz.getQuiz().get(j).equals(question)) {
				//Delete the required quiz
				Question copiedeleted = quiz.getQuiz().get(j);
				quiz.getQuiz().remove(j);
				return copiedeleted;
			}  
		}
		//can change this to throws noQuestionFoundException
		return null;
		
	}
	
	//Malformed quiz Exception
	public Float GradeQuiz(Quiz quiz) throws QuizNotFound, MalformedInputException {
		//Get the answer sheet and make a map of it
		Quiz master = getQuiz(quiz.getName()); 
		Map<String, String> answers = new HashMap<>();
		for (Question question : master.getQuiz()) {
			for (Answer answer : question.getAnswer()) {
				if (answer.getCorrect()) {
					answers.put(question.getQuestion(), answer.getAnswer());
				}
			}
		}

		float correct = 0;
		for (Question qsubmit : quiz.getQuiz()) {
			for (Answer ansubmit : qsubmit.getAnswer()) {
				//Check if its marked correct then check if the answer matches the correct answer in master
				if (ansubmit.getCorrect()) {
					//check answer sheet against the answers
					if (answers.get(qsubmit.getQuestion()).equals(ansubmit.getAnswer())) {
						correct++;
					}
					
				}
			}
		}
		Float percent = correct/answers.size() * 100;
		return percent;
	}

}
