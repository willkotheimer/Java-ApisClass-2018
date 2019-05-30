package cooksys.test;

public class QuizService {

	// real bad code
	

	public Quiz rename(String name, String newname) {
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

	public Quiz getQuiz(String name) {
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
	
	
	public Question getRandomQuestion(String quizName) {
		
		for (Quiz quiz : this.quizzes) {
			if (quizName.equals(quiz.getName().toLowerCase())) {
				int maximum = quiz.getQuiz().size()-1;
				int randomNum = 0 + (int)(Math.random() * maximum);
				return quiz.getQuiz().get(randomNum);
			}
			
		}
		return null;

	}

}

