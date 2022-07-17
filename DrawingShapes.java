/*
 * [DrawingShapes].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [10 - 20 - 2021]
 *
 * Purpose: The purpose of the program is to create a shape
 * using the desired lengths from the user's input.
 * Can create a rectangle with desired length and height,
 * and triangle, hexagon, octagon, and pentagon with
 * desired lengths. Using a series of if, else, and for
 * statements the program prints out a series of *
 * to create a shape that the user desired. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class DrawingShapes {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Initialize variables
		int length;
		int height;
		char shape;

		// Prompt user to enter which shape they desire
		System.out.println("Enter a shape: r t h o p");
		shape = keyboard.next().charAt(0);

		// If statements to print out a rectangle
		if (shape == 'r') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			// Verifying if user length and height are greater than 1
			if (length <= 1) {
				System.out.println("Length must be greater than 1");
				System.out.println("Goodbye!");
			} else {
				System.out.println("Enter a height");
			}
			height = keyboard.nextInt();
			if (height <= 1) {
				System.out.println("Height must be greater than 1");
				System.out.println("Goodbye!");
			}

			if (length > 1 && height > 1) {
				System.out.println("Below is a " + length + " by " + height + " rectangle of *");
				for (int h = 0; h < height; h++) {
					for (int l = 0; l < length; l++) {
						System.out.print('*');
					}
					System.out.println();
				}

			}

		}

		// If and for loops to print out a triangle with a certain length
		if (shape == 't') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			// Verifying that length is greater than 1
			if (length <= 1) {
				System.out.println("Length must be greater than 1");
				System.out.println("Goodbye!");
			} else {
				System.out.println("Below is a triangle with two sides lengths of " + length + " *");
				for (int a = 1; a <= length; a++) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a - 1; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		// If and for statements to print out a hexagon
		if (shape == 'h') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			// Verifying the length is greater than 1
			if (length <= 1) {
				System.out.println("Length must be greater than 1");
				System.out.println("Goodbye!");
			} else {
				System.out.println("Below is a hexagon with side lengths of " + length + " *");
				for (int a = 1; a < length; a++) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a + length - 2; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int a = length - 1; a > 0; a--) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a + length - 2; b++) {
						System.out.print("*");
					}
					System.out.println();
				}

			}
		}
		// If and for statements to print out octagon with desired length
		if (shape == 'o') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			// Verify that length is greater than 1
			if (length <= 1) {
				System.out.println("Length must be greater than 1");
				System.out.println("Goodbye!");
			} else {
				System.out.println("Below is an octagon with side lengths of " + length + " *");
				for (int a = 1; a < length; a++) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a + length - 2; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int a = 0; a < length; a++) {
					for (int b = 0; b < 3 * length - 2; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int a = length - 1; a > 0; a--) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a + length - 2; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}

		// Print a pentagon with desired lengths
		if (shape == 'p') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			// Verify that length is greater than 1
			if (length <= 1) {
				System.out.println("Length must be greater than 1");
				System.out.println("Goodbye!");
			} else {
				System.out.println("Below is a pentagon with 4 sides lengths of " + length + " *");
				for (int a = 1; a < length; a++) {
					for (int b = length - a; b > 0; b--) {
						System.out.print(" ");
					}
					for (int b = 0; b < 2 * a - 1; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int a = 0; a < length; a++) {
					for (int b = 0; b < 2 * length - 1; b++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

		}
		if (shape != 'r' && shape != 't' && shape != 'h' && shape != 'o' && shape != 'p') {
			System.out.println("Invalid shape");
			System.out.println("Goodbye!");
		}
	}
}
