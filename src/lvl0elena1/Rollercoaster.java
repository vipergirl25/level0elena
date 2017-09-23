package lvl0elena1;

import javax.swing.JOptionPane;


public class Rollercoaster {
	public static void main(String[] args) {
		
	
	String Height = JOptionPane.showInputDialog("How tall are you in feet?");
	int newHeight = Integer.parseInt(Height);
	if (newHeight>= 4) {
		JOptionPane.showMessageDialog(null, "You may ride the rollercoaster.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, you can't ride this rollercoaster.");
	}

}
}