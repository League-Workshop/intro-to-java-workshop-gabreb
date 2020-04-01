package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Bow before me if you want to keep your head");
	JOptionPane.showMessageDialog(null, "April Fools");
	String input = JOptionPane.showInputDialog("I'm going to find you and I am going to kill you Bill; blood sucking vampire of the sadistic lord"); 
	JOptionPane.showMessageDialog(null, input);
}
}
