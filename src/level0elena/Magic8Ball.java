package level0elena;



import java.util.Random;

import javax.swing.JOptionPane;

	public class Magic8Ball {

		// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {
			for (int i = 0; i < 4; i++) {
			
	

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
			int randomNum = new Random().nextInt(4);

		// 3. Print out this variable
					
			

		// 4. Get the user to enter a question for the 8 ball
					
						
					
					JOptionPane.showInputDialog("Please ask a question.");

		// 5. If the random number is 0
					if(randomNum == 0){
						JOptionPane.showMessageDialog(null, "Yes.");
					}

		// -- tell the user "Yes"

		// 6. If the random number is 1
					if(randomNum == 1){
						JOptionPane.showMessageDialog(null, "No");
					}

		// -- tell the user "No"

		// 7. If the random number is 2
					if(randomNum == 2){
						JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
					}
						

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
					if(randomNum == 3){
						JOptionPane.showMessageDialog(null, "That's up to you to decide!");
					}

		// -- write your own answer
			}
		}

	



}
