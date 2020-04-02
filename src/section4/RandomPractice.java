package section4;

import java.util.Random;

public class RandomPractice {
	public static void main(String[] args) {
		
	
Random randy = new Random(); 
for (int i = 0; i > -1; i++) {
	int z = randy.nextInt(100)+1; 
	System.out.println(z);
	if (z==57) {
		System.out.println("Your luck is good!");
		return; 
	}
	}
} 
	}

