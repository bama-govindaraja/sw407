package lab2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int base_price = 9;
		int topping_price = 1;
		int total;
		double final_total;
		
	Scanner filereader = new Scanner(new FileReader("pizza_input"));
	
        String name = filereader.next();
        
		int num_pizza = filereader.nextInt();

		int num_toppings = filereader.nextInt();
		
		filereader.close();
		
		total = num_pizza * (base_price + num_toppings * topping_price);

		final_total = total - (0.15 * total);

		PrintWriter printwriter = new PrintWriter("pizza_receipt");
		
		JOptionPane.showMessageDialog(null, "Details sent to the file");

		String str = "Customer Name :" + name + "\n" + "Number of Pizzas" + num_pizza
				+ "Number of toppings on each pizzas" + num_toppings + "Total($)" + total + "Discount($)"
				+ (0.15 * total) + "Final Total($)" + final_total;
		printwriter.write(str);
		printwriter.close();
//		
//		JOptionPane.showMessageDialog(null,str,"Joe's Pizza",JOptionPane.INFORMATION_MESSAGE );

	}

}

