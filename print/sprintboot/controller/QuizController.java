package com.cooksys.ftd.sprintboot.controller;

import java.nio.charset.MalformedInputException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.ftd.sprintboot.exceptions.QuizNotFound;
import com.cooksys.ftd.sprintboot.service.Question;
import com.cooksys.ftd.sprintboot.service.Quiz;
import com.cooksys.ftd.sprintboot.service.QuizService;

@RestController
public class QuizController {

	private QuizService quizService;

	@Autowired
	public QuizController(QuizService quizService) {
		super();
		this.quizService = quizService;
	}

	@GetMapping("quiz")
	public Quiz getQuiz(String name) throws QuizNotFound {
		return quizService.getQuiz(name);
	}

	@GetMapping("quizzes")
	public List<Quiz> getQuizzes() {
		return quizService.getQuizzes();
	}

	@GetMapping("quiz/{quizName}/rename/{newName}")
	public Quiz rename(@PathVariable("quizName") String quizName, @PathVariable("newName") String newName) throws QuizNotFound {
		return quizService.rename(quizName, newName);
	}

	@GetMapping("quiz/{quizName}/random")
	public Question getRandomQuestion(@PathVariable("quizName") String quizName) throws QuizNotFound {
		return this.quizService.getRandomQuestion(quizName);
	}

	@PatchMapping("quiz/{quizName}/add")
	public Quiz addQuestion(@PathVariable("quizName") String quizName, @RequestBody Question question) throws QuizNotFound {
		return this.quizService.addQuestion(question, quizName);
	}

	@PostMapping("quiz")
	public Quiz addQuiz(@RequestBody Quiz quiz) throws MalformedInputException {
		return this.quizService.AddQuiz(quiz);
	}

	@DeleteMapping("quiz/{quizName}")
	public Quiz deleteQuiz(@PathVariable String quizName) throws QuizNotFound {
		return this.quizService.deleteQuiz(quizName);
	}

	@DeleteMapping("quiz/{quizName}/delete/{question}")
	public Question deleteQuestion(@PathVariable("quizName") String quizName, @RequestBody Question question) throws QuizNotFound {
		return this.quizService.deleteQuestion(quizName, question);
	}

	@PostMapping("quiz/grade")
	public Float GradeQuiz(@RequestBody Quiz quiz) throws MalformedInputException, QuizNotFound  {
		return this.quizService.GradeQuiz(quiz); 
	
}
	
}
