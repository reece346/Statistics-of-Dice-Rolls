
/*
 * Reece Peters
 */

import java.util.Scanner;
import java.util.Random;

public class practice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0; 
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;
		
		
		System.out.println("Enter the number of times a 6 sided die should be rolled");
		int rollCount = keyboard.nextInt();
		int rollCounter = 0;
		
		while(rollCounter < rollCount) 
		{
			int rolledNum = 1 + (r.nextInt(6));
			System.out.println(rolledNum + " was rolled");
			
			if (rolledNum == 1) {
				oneCount++;
			} else if (rolledNum == 2) {
				twoCount++;
			} else if (rolledNum == 3) {
				threeCount++;
			} else if (rolledNum == 4) {
				fourCount++;
			} else if (rolledNum == 5) {
				fiveCount++;
			} else {
				sixCount++;
			}
			
			rollCounter ++;
		}
		
		System.out.println("One: " + oneCount);
		System.out.println("Two: " + twoCount);
		System.out.println("Three: " + threeCount);
		System.out.println("Four: " + fourCount);
		System.out.println("Five: " + fiveCount);
		System.out.println("Six: " + sixCount);
	}

}
