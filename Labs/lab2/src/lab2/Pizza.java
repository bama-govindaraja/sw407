package lab2;

import javax.swing.JOptionPane;

//Write a Java program for a pizza shop.
//The Pizza shop sells only individual size pizza. 
//There is an offer going on in the shop.  
//There is a 15% off on the total.
//Price of the individual pizza is $9 and you can hard code it in the program.
//Price of the individual topping is $1 and you can hard code it in the program.
//Your program should ask the user to enter the customer's name using JOPtion
//Your program should ask the user to enter the number of pizza the customer wants to buy..using JOPtion
//Your program should ask the user to enter the number of toppings. (number of toppings is same on all pizzas) using JOPtion
//Your program should calculate the total price.
//You program should print the details. See the sample below with the right calculation using JOPtion:


//Customer name : Bama
//Number of Pizzas = 5
//Number of toppings on each pizzas : 3
//Total($) : 60
//Discount($): 9
//Final Total($):51

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base_price = 9;
		int topping_price=1;
		int total;
		double final_total;
		String name = JOptionPane.showInputDialog("Please enter your name");
		
		int num_pizza = Integer.parseInt(JOptionPane.showInputDialog("Enter number of pizzas"));
		
		int num_toppings = Integer.parseInt(JOptionPane.showInputDialog("Enter number of toppings"));
		
		total = num_pizza * (base_price + num_toppings*topping_price);
		
		final_total = total - (0.15* total);
		
	   String str = "Customer Name :" + name +"\n"+ "Number of Pizzas" +  num_pizza +
				"Number of toppings on each pizzas" + num_toppings + "Total($)" + total + "Discount($)"  + (0.15* total)
				+"Final Total($)" + final_total;
		
		JOptionPane.showMessageDialog(null,str,"Joe's Pizza",JOptionPane.INFORMATION_MESSAGE );

	}
}
