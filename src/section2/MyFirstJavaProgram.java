package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot rob = new Robot(); 
		rob.setSpeed(999999); 
		rob.penDown();
		rob.setPenWidth(50);
		rob.setPenColor(0, 0, 0);
		rob.turn(-90);
		rob.move(200);
		rob.turn(-90);
		rob.move(200);
		rob.turn(-90);
		rob.move(1);
		rob.turn(-90);
		rob.move(100);
		
		for (int i = 0; i > -1; i++) {
			rob.move(300);
			rob.turn(90); 
			rob.move(25);
			rob.turn(-90); 
		}
	
	

		
		
	}
}
