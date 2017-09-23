package lvl0elena1;

	// Copyright Wintriss Technical Schools 2014
	
import javax.swing.JOptionPane;
	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipes".
	 */
	public class XGeeks {
	public static void main(String[] args) {
	

			// 1. Save the superpower for each person in a variable.
		String Jack = "Jack";
		String Elena = "Elena";
		String Alan = "Alan";

			// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is your name?");
				

			// 3. Show the superpower in a pop-up, depending on the name entered. 
		if (name.equals(Jack)) {
			JOptionPane.showMessageDialog(null, "Jack's superpower is flying");
			

		}
		if (name.equals(Elena)) {
			JOptionPane.showMessageDialog(null, "Elena's superpower is telepathy");
		}
		if (name.equals(Alan)) {
			JOptionPane.showMessageDialog(null, "Alan's superpower is x-ray vision");
		}
	}


}
