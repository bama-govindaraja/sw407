package lab3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get a number from user between 1 and 12.
		// your program should output the corresponding month

		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = console.nextInt();

		switch (num) {
		case 1: 

			System.out.println("January");
			break;
		
		case 2: 

			System.out.println("February");
			break;
		
		case 3: 

			System.out.println("March");
			break;
		
		case 4: 

			System.out.println("April");
			break;
		
		case 5: 

			System.out.println("May");
			break;
		
		case 6: 

			System.out.println("June");
			break;
		
		default:
			System.out.println("Enter number between 1 and 12");
			;
		}

	}

}
