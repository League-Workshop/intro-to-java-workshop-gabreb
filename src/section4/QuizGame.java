package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("What is my name?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("Gabriel Rebeiz Jr.")) {
			// 4. if the user's answer was correct, add one to their score
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You got it right! +1 points");
		} else {
			score = score -1;
			JOptionPane.showMessageDialog(null, "You got it wrong! The answer was Gabriel Rebeiz Jr.. I am a junior. -1 points");
		}
		String answer2 = JOptionPane.showInputDialog("What is your name in russian?");
		if (answer2.equalsIgnoreCase("teacher")) {
			score = score + 1;
JOptionPane.showMessageDialog(null, "You got it right! +1 points");
		} else {
			score = score - 1;
			JOptionPane.showMessageDialog(null, "You got it wrong! The answer was teacher. Kids call their teacher teacher in russian. -1 points");
		}
	
		String answer3 = JOptionPane.showInputDialog("4+4^2*4+4-4^2+4");
		if (answer3.equals("60")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You got it right! +1 points");
		} else {
			score = score -1;
			JOptionPane.showMessageDialog(null, "You got it wrong! The answer was 60. -1 points");
		}
		if(score==3) {
			JOptionPane.showMessageDialog(null, "You are one smart chick!");
		}
		if (score==1) {
			JOptionPane.showMessageDialog(null, "How did you miss my name?");
		}
		if (score<=-1) { 
			JOptionPane.showMessageDialog(null, "You need to step up your game");
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
JOptionPane.showMessageDialog(null, score + " points you got. This was an easy test budy. If you didn't do well oof");
	}
}
