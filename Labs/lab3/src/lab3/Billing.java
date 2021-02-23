package lab3;

import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int acct_num;
		char cus_type;
		// values for Residential

		double res_bill_processing_fee = 4.5;
		double res_basic_service_fee = 20.5;
		double res_prem_channel_cost = 7.5;

		// values for Business

		double bus_bill_processing_fee = 15;
		double bus_upto10_con_service_fee = 75;
		double bus_prem_channel_cost = 50;
		double bus_after10_con_service_fee = 5;

		Scanner console = new Scanner(System.in);

		System.out.println("Enter accounr number");

		acct_num = console.nextInt();
		System.out.println("Enter customer type(R/r/B/b)");
		cus_type = console.next().charAt(0);

		switch (cus_type) {
		case 'R':
		case 'r':System.out.println("Enter number of premium channels");
		         int num_channels = console.nextInt();
		         double amount = num_channels * res_prem_channel_cost + res_basic_service_fee
		        		 +res_bill_processing_fee;
		         System.out.println("Total amount is " + amount);
		         break;

		case 'B':
		case 'b':
		default:
			System.out.println("Enter customer type(R/r/B/b) ");
		}

	}

}
