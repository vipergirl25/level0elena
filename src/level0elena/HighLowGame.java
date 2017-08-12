package level0elena;

import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
	public class HighLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(100);
			// 2. Print out the random variable above
			//JOptionPane.showMessageDialog(null, random);
			
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
				
			
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1-100");

				// 4. convert the users’ answer to an int (Integer.parseInt(string))
					int guess2 = Integer.parseInt(guess);
				
				// 5. if the guess is correct
					if(guess2 == random){
						JOptionPane.showMessageDialog(null, "Congratulations, you won!");
					}
					
				
					
					// 6. win
				// 7. if the guess is high
					if(guess2 > random){
						JOptionPane.showMessageDialog(null, "Sorry, you are too high!");
						
					}
					
					// 8. tell them it's too high
				// 9. if the guess is low
						if(guess2 < random){
							JOptionPane.showMessageDialog(null, "Sorry, you guessed too low.");
					// 10. tell them it's too low

			// 12. tell them they lose
						}
						
						
						}
			JOptionPane.showMessageDialog(null, "Sorry, you lost.");
						
					
		}

	}




