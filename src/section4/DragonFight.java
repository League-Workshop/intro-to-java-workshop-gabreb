package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100; 
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100; 
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0; 
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {   
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String yell = JOptionPane.showInputDialog("Do you want to attack the dragon with a yell or a kick? Answer in one word.");
		// 9. If they typed in "yell":
		if(yell.equalsIgnoreCase("Yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			Random randy = new Random(); 
			dragonDamage = randy.nextInt(11); 
			//-- Subtract that number from the dragon's health variable 
			dragonHealth = dragonHealth - dragonDamage;  }
		// 10. If they typed in "kick":
		if(yell.equalsIgnoreCase("kick")) { 
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			Random p = new Random();
			dragonDamage = p.nextInt(26); 
		
			
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage; 
		}
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random a = new Random(); 
		playerDamage = a.nextInt(36); 
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth - playerDamage; 
		
		
		// 13. If the user's health is less than or equal to 0
	
		
			//-- Tell the user that they lost
			
		if(dragonHealth<=0) {
			JOptionPane.showMessageDialog(null, "The dragon is dead you have lots of gold!");
		}
		else { 
			JOptionPane.showMessageDialog(null, "Your heath is " + playerHealth + ". The dragon's health is " + dragonHealth + ". The dragon lost " + dragonDamage + " health this turn. You lost " + playerDamage + " this turn."); 
		}
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		if(playerHealth<=0) {
			JOptionPane.showMessageDialog(null, "You have lost. HAHHAHA"); 	
			}
		}
}
	
