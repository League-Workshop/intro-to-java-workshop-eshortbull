package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score =0;
		// 2.  Ask the user a question 
	String answer =	JOptionPane.showInputDialog("What is 12x79");
		// 3.  Use an if statement to check if their answer is correct
	 if (answer.equalsIgnoreCase("204")) {
		 score++;
	 }
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		 answer = JOptionPane.showInputDialog("At least how many algorithms are in VLS ");
		if (answer.equalsIgnoreCase("200")) {
			score++;
		}
			
		answer = JOptionPane.showInputDialog("How many words are in cook");
		if (answer.equalsIgnoreCase("1")){
			score++;
		}
		
		
		answer = JOptionPane.showInputDialog(null, "what coding languge does Unity use");
		if (answer.equalsIgnoreCase("C#")) {
		score++;
		
		}
		
		answer = JOptionPane.showInputDialog("what coding languge does unreal use");
		if (answer.equalsIgnoreCase("C++")) {
		
		score++;
		}
		
		JOptionPane.showMessageDialog(null, "your score is "+ score+ "out of five!");
		
		 }
	
}

