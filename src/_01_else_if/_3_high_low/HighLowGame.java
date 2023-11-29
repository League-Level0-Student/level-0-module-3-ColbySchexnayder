
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		//System.out.println(random);
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100");
			int num = Integer.parseInt(guess);
			if (num == random) {
				JOptionPane.showMessageDialog(null, "Correct! You Win!");
				System.exit(0);
			}
			else if (num > random) {
				JOptionPane.showMessageDialog(null, "Too high!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Too low!");
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "You Lose!");
		// 13. Tell them they lose
		
	}

}


