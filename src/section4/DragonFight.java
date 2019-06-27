package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	private static final int YEET = 0;

	// 1. Put all of the game code inside the main bethod (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/maxresdefault.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth=750;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
	int dragonHealth=2500;
		// 4. Create a variable to hold the damage the player's attack does each round
	int playerDamage=50;	
		// 5. Create a variable to hold the damage the dragon's attack does each round
	int dragonDamage=15;
		

		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
	String responce=JOptionPane.showInputDialog("sword or bow .");
		// 9. If they typed in "sword":
		if (responce.equals("sword")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dragonDamage=new Random().nextInt(11);
			//-- Subtract that number from the dragon's health variable 
		dragonHealth=dragonHealth-dragonDamage;
		}
		// 10. If they typed in "bow":
		else if (responce.equals("bow")) {
			
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
		dragonDamage=new Random().nextInt(26);
			//-- Subtract that number from the dragon's health variable
		dragonHealth=dragonHealth-dragonDamage;
		}
		else if (responce.equals(".")) {
			dragonDamage=new Random().nextInt(999);
			dragonHealth=dragonHealth-dragonDamage;
		}
		else if (responce.equals(" ")) {
			dragonDamage=new Random().nextInt(99999);
			dragonHealth=dragonHealth-dragonDamage;}
	
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage

		
			// 12. Subtract this number from the player's health

		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		JOptionPane.showMessageDialog(null,"dragonHealth"+dragonHealth );
		JOptionPane.showMessageDialog(null,"playerHealth"+ playerHealth);
		
		}
		}
	}

