package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String RESPONCE=JOptionPane.showInputDialog(null,"EENNTTEERR  AANN  AADDJJEECCTTIIVVEE!!");
		// Get the user to enter a type of liquid
		String Resposce=JOptionPane.showInputDialog(null,"EENNTTEERR  AA  TTYYPPEE  OOFF  LLIIQQUUIIDD!!");
		// Get the user to enter a body part
		String ResposceR=JOptionPane.showInputDialog(null,"EENNTTEERR  AA BBOODDYY PPAARRTT!!");
		// Get the user to enter a verb
		String ResposceRA=JOptionPane.showInputDialog(null,"EENNTTEERR  AA  VVEERRBB!!");
		// Get the user to enter a place
		String ResposceRAT=JOptionPane.showInputDialog(null,"EENNTTEERR  AA  PPLLAACCEE!!");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		JOptionPane.showMessageDialog(null,"Piranhas are more "+RESPONCE+" during the day, so cross the river at");
		JOptionPane.showMessageDialog(null," night. Piranhas are attracted to fresh "+Resposce+" and will most");
		JOptionPane.showMessageDialog(null," likely take a bite out of your "+ResposceR+" if you "+ResposceRA+". Whatever");
		JOptionPane.showMessageDialog(null," you do, if you have an open wound, try to find another way to get");
		JOptionPane.showMessageDialog(null," back to the "+ResposceRAT+". Bad luck! Hopefully you dont make it back XP");
		 
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

