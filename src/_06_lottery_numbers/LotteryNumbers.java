package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;
public class LotteryNumbers {
	public static void main(String[] args) {
		
	
int randomNumber = new Random().nextInt(10);
int x = new Random().nextInt(10);
int y = new Random().nextInt(10);
int z = new Random().nextInt(10);
int a = new Random().nextInt(10);
JOptionPane.showMessageDialog(null,randomNumber + " " + x + " " + y + " " + z + " " + a + " ");
}}
