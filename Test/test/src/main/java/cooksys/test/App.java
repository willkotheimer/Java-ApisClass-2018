package cooksys.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Quiz> quizzes = new ArrayList<>();
    	Quiz quiz;

    	
    		// Question "Do you need anything?"
    		Answer answer1 = new Answer("no", false);
    		Answer answer2 = new Answer("I need sleep", false);
    		Answer answer3 = new Answer("I need to eat", false);
    		Answer answer4 = new Answer("yes", true);

    		ArrayList<Answer> Answer = new ArrayList<>();

    		Answer.add(answer1);
    		Answer.add(answer2);
    		Answer.add(answer3);
    		Answer.add(answer4);

    		// Question "Do you want anything?"
    		Answer answer5 = new Answer("no", false);
    		Answer answer6 = new Answer("I want an xbox", false);
    		Answer answer7 = new Answer("I want a new car", false);
    		Answer answer8 = new Answer("I want a million dollars", true);

    		ArrayList<Answer> Answer2 = new ArrayList<>();

    		Answer2.add(answer5);
    		Answer2.add(answer6);
    		Answer2.add(answer7);
    		Answer2.add(answer8);

    		List<Question> quiz1 = new ArrayList<>();

    		quiz1.add(new Question("Do you want anything", Answer));
    		quiz1.add(new Question("Do you need anything?", Answer2));

    		quizzes.add(new Quiz("Quiz1", quiz1));
    	

    		for (Quiz quizza : quizzes) {
    			
    				System.out.println(quizza.getName());
    				System.out.println(quizza.getQuiz().get(0));
    				System.out.println(quizza.getQuiz().get(0).getAnswer().get(0).getAnswer());
    				System.out.println(quizza.getQuiz().get(0).getAnswer().get(1));
    				System.out.println(quizza.getQuiz().get(0).getAnswer().get(2));
    				
    				
    				System.out.println(quizza.getQuiz().get(1).getQuestion());
    				


    				
    				
    			
    			
    		}
    }
    
    
}
