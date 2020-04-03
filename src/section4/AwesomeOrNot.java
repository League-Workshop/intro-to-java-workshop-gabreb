package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
Random randy = new Random(); 
int x = randy.nextInt(4); 
		// 3. Print out this variable
System.out.println(randy);
		// 4. Get the user to enter something that they think is awesome
String answer1 = JOptionPane.showInputDialog("Enter something you think is awesome!"); 
		// 5. If the random number is 0
if(x == 0) {
	JOptionPane.showMessageDialog(null, "Yeah! That is awesome!"); 
}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
if (x == 1) {
	JOptionPane.showMessageDialog(null, "eh, that's ok.");
}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
if (x== 2) {
	JOptionPane.showMessageDialog(null, "Hell no! That's boring!");
}

		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
if (x==3) {
	JOptionPane.showMessageDialog(null, "I love you. I love you so much. I dream of you both in day and night. Come and cuddle with me!");
}
		// -- write your own answer
	}
}
