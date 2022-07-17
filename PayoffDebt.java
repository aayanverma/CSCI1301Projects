/*
 * [PayoffDebt].java
 * Author:  [Aayan Verma] 
 * Submission Date:  [September 9th 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? 
 * This program's intention is to prompt the user to input their principal, 
 * interest rate, and monthly payment
 * to help calculate how much time it will take to pay off their debt 
 * while also providing 
 * additional information such as how much interest 
 * has been paid and how much they will overpay due to the rounding up of the month.
 * This program provides a clean and concise response to the user's 
 * inputs providing them with the necessary information 
 * quickly and accurately.
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

public class PayoffDebt {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
		//System user inputs
		System.out.print("Principal:\t\t\t");
		double principal = keyboard.nextDouble();
		
		System.out.print("Annual Interest Rate (%):\t");
		double annualInterestRate = keyboard.nextDouble();
		
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = keyboard.nextDouble();
		
			//Computations for Outputs
			double simplified1 = (monthlyPayment - (annualInterestRate / 1200.0) * principal);
		
			double monthsNeeded1 = ((Math.log(monthlyPayment) - Math.log(simplified1)) / (Math.log((annualInterestRate / 1200.0) + 1.0))) ;
	
			double monthsNeeded2 = Math.ceil(monthsNeeded1);
		
			double totalAmountPaid = (monthsNeeded2 * monthlyPayment);
		
			double totalInterest = (totalAmountPaid - principal);
		
			double overpayment = totalAmountPaid - (monthsNeeded1 * monthlyPayment);
		
				//System output print statements
				System.out.println();
				System.out.println("Months needed To Pay Off:\t" + (int)monthsNeeded2);
				System.out.printf("Total Amount Paid:\t\t$%.2f\n", totalAmountPaid);
				System.out.printf("Total Interest Paid:\t\t$%.2f\n", totalInterest);
				System.out.printf("Overpayment:\t\t\t$%.2f\n", overpayment);
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}