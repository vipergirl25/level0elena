package lvl0elena1;


	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;

	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */
	public class ChangeCalculator {

		public static void main(String[] args) {

			// Ask the user how many nickels they have
			String nickels = JOptionPane.showInputDialog("How many nickels do you have?");

			// Convert their answer to an int using Integer.parseInt()
			int Nickels = Integer.parseInt(nickels);
				

			// Ask the user how many dimes they have, and convert their answer
			String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
			int Dimes = Integer.parseInt(dimes);

			// Ask the user how many quarters they have, and convert their answer
			String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
			int Quarters = Integer.parseInt(quarters);

			// Calculate how much money the user has and save it in a double variable 
			double Money = Quarters*0.25 + Dimes*0.1 + Nickels*0.05;

			// Tell the user how much money they have
			JOptionPane.showMessageDialog(null, "You have $" + String.format("%.2f", Money));

		}
	}



