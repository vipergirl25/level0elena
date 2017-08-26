package level0elena;


	import java.io.File;

	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.swing.JOptionPane;

	public class AnimalFarm {

		AnimalFarm() {
			for (int i = 0; i < 10; i++) {
				
			}
			/*
			 * 1. Ask the user which animal they want, then play the sound of that
			 * animal.
			 *
			 */
			String Answer = JOptionPane.showInputDialog("Do you like ducks, cows, or dogs better?");
			if (Answer.equals("ducks")){
				playQuack();
				
			}
			if (Answer.equals("cows")){
				playMoo();
			}
			if (Answer.equals("dogs")){
				playWoof();
			}

			/* 2. Make it so that the user can keep entering new animals. */
		}

		void playMoo() {
			playNoise(mooFile);
		}

		void playQuack() {
			playNoise(quackFile);
		}

		void playWoof() {
			playNoise(woofFile);
		}

		  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
		String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
		String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
		String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
		String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


		/* Ignore this stuff */

		public void playNoise(String soundFile) {
	    	try {
	   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(audioInputStream);
	   		 clip.start();
	   		 Thread.sleep(3400);
	    	} catch (Exception ex) {
	        	ex.printStackTrace();
	    	}
		}

		public static void main(String[] args) {
			new AnimalFarm();
		}

	}



