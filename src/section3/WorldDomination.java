package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String response=JOptionPane.showInputDialog(null,"do you know how to eat");
		// 2. If they say "yes", tell them they will rule the world.
if (response.equals("yes")) {
	JOptionPane.showMessageDialog(null,"you are stupid");
}else if(response.equals("no"))  {JOptionPane.showMessageDialog(null,"you are a pice of trash");} else if(response.equals("yeet")) {JOptionPane.showMessageDialog(null,"you are amizing");}
		
// 3. Otherwise, wish them good luck washing dishes.


	}
}

