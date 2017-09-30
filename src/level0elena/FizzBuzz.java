package level0elena;

import javax.swing.JOptionPane;

public class FizzBuzz {
	// Copyright Wintriss Technical Schools 2013
	/**
	 * Fizz Buzz
	 * 
	 * In this project, we're going to build FizzBuzz. It's a children's game
	 * where you count from 1 to 20. Easy, right? Here's the catch: instead of
	 * saying numbers divisible by 3, say "Fizz". And instead of saying numbers
	 * divisible by 5, say "Buzz". For numbers divisible by both 3 and 5, say
	 * "FizzBuzz".
	 * 
	 * So the rules are: Any number divisible by 3 is replaced by the word fizz
	 * Any number divisible by 5 is replaced by the word buzz. Numbers divisible
	 * by both 3 and 5 become fizzbuzz.
	 * 
	 * Print your results to the console, or using JOptionPane if you like.
	 **/
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i % 3 != 0 || i % 5 != 0) {
				JOptionPane.showMessageDialog(null, i);

			}
			if (i % 3 == 0) {
				JOptionPane.showMessageDialog(null, "Fizz");
			}
			if (i % 5 == 0) {
				JOptionPane.showMessageDialog(null, "Buzz");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				JOptionPane.showMessageDialog(null, "Fizzbuzz");
			}
		}
	}
}
