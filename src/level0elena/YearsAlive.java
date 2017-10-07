package level0elena;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String yearborn = JOptionPane.showInputDialog("What year were you born?");
		int yearBorn = Integer.parseInt(yearborn);
		for(int i = yearBorn; i<=2017; i++) {
			JOptionPane.showMessageDialog(null, "Hello " + i);
		} 
	}

}
