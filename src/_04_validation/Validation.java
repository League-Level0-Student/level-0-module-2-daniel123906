//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "I like your clothes");
}else if(randomNumber == 1){
		JOptionPane.showMessageDialog(null,"Your hair is nice");	
}else if(randomNumber == 2) {
		JOptionPane.showMessageDialog(null, "Your shirt is nice");
}else if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "Nice shoes");
}else if(randomNumber ==4)  {
	JOptionPane.showMessageDialog(null,"Nice socks");
}else if (randomNumber ==5) {
	JOptionPane.showMessageDialog(null, "your eyes are nice");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
