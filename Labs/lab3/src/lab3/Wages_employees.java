package lab3;

import java.util.Scanner;

public class Wages_employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gets num of hours worken in week
		// gets hourly pay
		// Calucates weekly pay
		// if overtime, then hourly pay is 1.5 times

		// This code should run for five employees

		int num_hours;
		double hourly_pay;
		double weekly_pay;
		int diff_hours;

		int count = 0;
		// while loop top tested

//		while (count < 5) {
//
//			Scanner console = new Scanner(System.in);
//			System.out.println("Enter number of hours worked");
//			num_hours = console.nextInt();
//
//			System.out.println("Enter hourly pay");
//
//			hourly_pay = console.nextDouble();
//
//			if (num_hours <= 40) {
//				weekly_pay = num_hours * hourly_pay;
//			} else {
//				diff_hours = num_hours - 40;
//				weekly_pay = (40 * hourly_pay + diff_hours * (hourly_pay * 1.5));
//
//			}
//
//			System.out.println("Weekly pay is " + weekly_pay);
//          count++;
//		}

		// do while - bottom tested

//		do {
//				Scanner console = new Scanner(System.in);
//				System.out.println("Enter number of hours worked");
//				num_hours = console.nextInt();
//
//				System.out.println("Enter hourly pay");
//
//				hourly_pay = console.nextDouble();
//
//				if (num_hours <= 40) {
//					weekly_pay = num_hours * hourly_pay;
//				} else {
//					diff_hours = num_hours - 40;
//					weekly_pay = (40 * hourly_pay + diff_hours * (hourly_pay * 1.5));
//
//				}
//
//				System.out.println("Weekly pay is " + weekly_pay);
//	          count++;
//			
//			
//		}while (count<5);
//		

		// for loop

		for (int emp_count = 0; emp_count < 5; emp_count++) {

			Scanner console = new Scanner(System.in);
			System.out.println("Enter number of hours worked");
			num_hours = console.nextInt();

			System.out.println("Enter hourly pay");

			hourly_pay = console.nextDouble();

			if (num_hours <= 40) {
				weekly_pay = num_hours * hourly_pay;
			} else {
				diff_hours = num_hours - 40;
				weekly_pay = (40 * hourly_pay + diff_hours * (hourly_pay * 1.5));

			}

			System.out.println("Weekly pay is " + weekly_pay);
		
		}

	}
}
