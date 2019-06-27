package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int myIntVar = 0;
		// 2. Ask the user a question
		String response = JOptionPane.showInputDialog(null, "how do you spell ya yeet,.");
		// 3. Use an if statement to check if their answer is correct
		if (response.equals("ya yeet,.")) {
			// 4. if the user's answer was correct, add one to their score
			myIntVar = myIntVar + 1;

		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String responsee = JOptionPane.showInputDialog(null,
				"how do you spell lololololololololololololololololololol,.");
		String responseee = JOptionPane.showInputDialog(null, "what is doge");
		String responseeee = JOptionPane.showInputDialog(null, "how do you spell 12345678901234567890");
		String responseeeee = JOptionPane.showInputDialog(null, "how do you spell nothing");
		String responseeeeee = JOptionPane.showInputDialog(null,
				"...ho.....w........d..........o.......y.o.....u.....sp......e..............ll.........ha......,..,..ha....,.......,.....ha,,");
		// 6. After all the questions have been asked, print the user's score
		if (responsee.equals("lololololololololololololololololololol,.")) {
			myIntVar=myIntVar+1;
		}
		if (responseee.equals("a meme")) {
			myIntVar=myIntVar+1;
		}
		if (responseeee.equals("onetwothreefourfivesixseveneightninezeroonetwothreefourfivesixseveneightninezero")) {
			myIntVar=myIntVar+1;
		}
		if (responseeeee.equals("")) {
			myIntVar=myIntVar+1;
		}
		if (responseeeeee.equals("ha,,ha,,ha,,,,")) {
			myIntVar = myIntVar + 1;

		}
		JOptionPane.showMessageDialog(null,myIntVar);
	}
}
