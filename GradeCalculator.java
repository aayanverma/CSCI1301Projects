/*
 * [GradeCalculator].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [9 - 29 - 2021]
 *
 * Purpose: The purpose of the program is to help students calculate 
 * their final grade through using the user inputs of the weights and the
 * grades to help calculate final grades and see if they can reach their targets.
 * Using a series of if-statements, it helps prompt the user to enter grade weights
 * and scores then calculates the final grade and 
 * computes whether it is possible to earn the target grade or if
 * they have already reached the target grade. It can also supply how much
 * score is needed to reach desired grade.
 * 
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
import java.text.DecimalFormat;

public class GradeCalculator {

	public static void main(String[] args) {
		// Initializing Scanners and Decimal Formatting
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		// Prints out the Grading Scale
		System.out.println("Grading Scale:");
		System.out.println("A   90-100");
		System.out.println("B   80-89");
		System.out.println("C   70-79");
		System.out.println("D   60-69");
		System.out.println("F   below 60");

		// User inputs their target grade and shifts to Upper Case
		String targetGrade;
		System.out.print("What letter grade do you want to acheive for the course?");
		targetGrade = keyboard.next().toUpperCase();

		// User inputs weight amounts for each section
		int weightExam1, weightExam2, weightFinalExam, weightLab, weightProject, weightParticipation, weightQuizzes;

		if (targetGrade.equalsIgnoreCase("A") || targetGrade.equalsIgnoreCase("B") || targetGrade.equalsIgnoreCase("C")
				|| targetGrade.equalsIgnoreCase("D") || targetGrade.equalsIgnoreCase("F")) {
			System.out.print("Enter percentage weights below. \n");
			System.out.print("Exam 1:\t\t");
			weightExam1 = keyboard.nextInt();
			System.out.print("Exam 2:\t\t");
			weightExam2 = keyboard.nextInt();
			System.out.print("Final Exam:\t");
			weightFinalExam = keyboard.nextInt();
			System.out.print("Labs:\t\t");
			weightLab = keyboard.nextInt();
			System.out.print("Projects:\t");
			weightProject = keyboard.nextInt();
			System.out.print("Participation:\t");
			weightParticipation = keyboard.nextInt();
			System.out.print("Quizzes:\t");
			weightQuizzes = keyboard.nextInt();

			// Weight Summation and Program exit if weights do not add to 100
			int weightSum = weightExam1 + weightExam2 + weightFinalExam + weightLab + weightProject
					+ weightParticipation + weightQuizzes;

			if (weightSum != 100) {
				System.out.print("Weight does not add up to 100, program exiting...");
				System.exit(0);
			}

			// Score Inputs, Determining which scores are present and which ones to be
			// skipped due to no input
			// If statements to progress through calculator to determine which scores are
			// known and what they are
			int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0, score6 = 0, score7 = 0;
			String response;
			System.out.print("Do you know your exam 1 score? ");
			response = keyboard.next();
			if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
				System.out.print("Score recieved on exam 1: ");
				score1 = keyboard.nextInt();
				System.out.print("Do you know your exam 2 score? ");
				response = keyboard.next();
				if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
					System.out.print("Score recieved on exam 2: ");
					score2 = keyboard.nextInt();
					System.out.print("Do you know your Final Exam score? ");
					response = keyboard.next();
					if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
						System.out.print("Score recieved on Final Exam: ");
						score3 = keyboard.nextInt();
					}
				}

			}

			System.out.print("Do you know your lab average? ");
			response = keyboard.next();
			if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
				System.out.print("Average Lab Grade: ");
				score4 = keyboard.nextInt();

			}

			System.out.print("Do you know your project average? ");
			response = keyboard.next();
			if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
				System.out.print("Average Project Grade: ");
				score5 = keyboard.nextInt();

			}

			System.out.print("Do you know your participation average? ");
			response = keyboard.next();
			if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
				System.out.print("Average Participation Grade: ");
				score6 = keyboard.nextInt();

			}

			System.out.print("Do you know your quiz average? ");
			response = keyboard.next();
			if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
				System.out.print("Average Quiz Grade: ");
				score7 = keyboard.nextInt();

			}

			// Initialize double variables to help calculate grade
			double currentScore = 0;
			double avgToFinalLetterGrade = 0;
			double totalKnownWeights = 0;
			double sumOfWS = 0;
			int finalOverallScore = 0;

			// Formula to calculate current score

			sumOfWS = (weightExam1 * score1) + (weightExam2 * score2) + (weightFinalExam * score3)
					+ (weightLab * score4) + (weightProject * score5) + (weightParticipation * score6)
					+ (weightQuizzes * score7);

			// If Grade is unknown it is taken away from final average

			if (score1 == 0)
				weightExam1 = 0;
			if (score2 == 0)
				weightExam2 = 0;
			if (score3 == 0)
				weightFinalExam = 0;
			if (score4 == 0)
				weightLab = 0;
			if (score5 == 0)
				weightProject = 0;
			if (score6 == 0)
				weightParticipation = 0;
			if (score7 == 0)
				weightQuizzes = 0;

			// Calculates total weights for the provided scores
			totalKnownWeights = (weightExam1 + weightExam2 + weightFinalExam + weightLab + weightProject
					+ weightParticipation + weightQuizzes);

			// Calculating the current score

			currentScore = sumOfWS / totalKnownWeights;

			// Print out Current Score and Compare to Target Grade
			String letterGrade = " ";
			if (currentScore >= 90 && currentScore <= 100) {
				letterGrade = "A";
				finalOverallScore = 90;
			} else if (currentScore >= 80 && currentScore < 90) {
				letterGrade = "B";
				finalOverallScore = 80;
			} else if (currentScore >= 70 && currentScore < 80) {
				letterGrade = "C";
				finalOverallScore = 70;
			} else if (currentScore >= 60 && currentScore < 70) {
				letterGrade = "D";
				finalOverallScore = 60;
			} else if (currentScore < 60) {
				letterGrade = "F";
				finalOverallScore = 59;
			}

			// How much is needed to reach desired letter
			avgToFinalLetterGrade = (100 * finalOverallScore - sumOfWS) / (100 - totalKnownWeights);

			// System.out.print Statements
			System.out.println("Current Grade Score: " + df.format(currentScore));
			System.out.println("Your current letter grade: " + letterGrade);
			if (avgToFinalLetterGrade < 100 && avgToFinalLetterGrade > 0)
				System.out.print("In order to receive a grade of " + targetGrade + ", \n"
						+ "you need to score an average greater than" + "\n" + "or equal to "
						+ df.format(avgToFinalLetterGrade) + " in the rest of the grade items.");
			if (avgToFinalLetterGrade >= 100)
				System.out.println("Unfortunately, a grade of " + targetGrade + " is not possible");
			if (letterGrade.equalsIgnoreCase(targetGrade))
				System.out.println("Congratulations! You received the " + targetGrade + " you wanted!");
			else if (avgToFinalLetterGrade < 0)
				System.out.println("You will recieve at least a grade of " + targetGrade.toUpperCase() + ".");

		} else {
			System.out.println("The input is invalid");
			System.exit(0);

		}
	}
}