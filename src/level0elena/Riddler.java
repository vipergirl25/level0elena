package level0elena;

import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		String riddle1 = JOptionPane.showInputDialog("Why did the gum cross the road?");
		if (riddle1.equals("Because it was stuck to the chickens foot.")){
			JOptionPane.showMessageDialog(null, "Congratulations, you got it right!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry! The correct answer is, 'because it was stuck to the chickens foot'");
		}
		String riddle2 = JOptionPane.showInputDialog("Everyone asks for me yet everyone hates to face me, for some I bring pain yet to others I bring relief. What am I?");
		if (riddle2.equals("The truth.")){
			JOptionPane.showMessageDialog(null, "Congratulations, you got it right!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, the correct answer is, 'the truth'.");
		}
		
		
	}

}
