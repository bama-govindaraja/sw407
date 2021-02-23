
//Your java program should calculate the monthly paycheck of a salesperson at a local department store and print the details
//Program should ask for the name of the employee using Scanner.
//Program should use  Scanner to get basic salary of employee 
//Program should   use  Scanner to get number of years the employee has worked 
//Program should calculate bonus for the employee  using  the following formula
//      Bonus = 20*(number of years worked)
//Program should  use  Scanner,  ask for number of items sold by the employee.
//Program should calculate additional bonus using the following formula:
//       Additional bonus =  15 dollars * number of items sold
//Program should calculate the final paycheck  as shown below:
//       Paycheck = base salary +bonus + additional bonus
//Program should print the following details.
//Employee name:
//Basic Salary:
//Bonus:
//Additional bonus:
//Total Income:
//For example : 
//Employee name: Bama Govindaraja
//Basic Salary: 100000
//Bonus:20000
//Additional bonus:10000
//Total Income:130000

package lab1;

import java.util.Scanner;

public class Paycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emp_name;
		int emp_basic;
		int num_years;
		int bonus;
		int num_items_sold;
		int addl_bonus;
		int gross_pay;
        //user scanner to get employee name
		System.out.println("*********Employee Paycheck********");
		Scanner console = new Scanner(System.in);
		System.out.println(" Enter employee's name ");
		emp_name = console.next();
		
		//use scanner to get basic
		System.out.println(" Enter employee's basic pay ");
		emp_basic  = console.nextInt();
		
		//use scanner to get number of years
		System.out.println(" Enter number of years ");
		num_years  = console.nextInt();
		
		//calculate bonus
		bonus = 20 * num_years;
		
		//use scanner to get number of years
		System.out.println(" Enter number of items sold ");
		num_items_sold  = console.nextInt();
		
		//calculate additional bonus
		addl_bonus = 15 * num_items_sold;
		
		//final paycheck
		gross_pay = emp_basic+bonus+addl_bonus;
		
		//print
		System.out.println("Employee Name " + emp_name);
		System.out.println("Basic pay " + emp_basic);
		System.out.println("Bonus " + bonus);
		System.out.println("Additional Bonus " + addl_bonus);
		System.out.println("Gross Pay " + gross_pay);
		
		
	}

}
