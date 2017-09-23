package lvl0elena1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
	public static void main(String[] args) {
		String s = "";
	for (int i = 0; i < 5; i++) {
		int one = new Random().nextInt(5000);
		
		s+= one + ",";
		
	
	}
	JOptionPane.showMessageDialog(null, "The lottery numbers are:" + s);
	
	}

	}


