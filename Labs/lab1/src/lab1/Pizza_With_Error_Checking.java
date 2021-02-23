package lab1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizza_With_Error_Checking {
    public static void main(String[] args) {
        String custName;
        int numOfPizzas;
        int numOfToppings =0;
        System.out.println(" **** Welcome to Joe's Pizza Shop **** ");

        //user scanner to get customer name
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter customer's name: ");

        while (true) {
        custName = console.nextLine();
        // ensures customer name is not blank
        if (custName.length() != 0)
            break;
            System.out.println("Please enter customer's first and last name");
            }

        //user scanner to get number of pizzas
        System.out.println("How many pizza's would you like to purchase? ");
        while (true){
            // Check to be sure number of pizzas is a whole number
            while (!console.hasNextInt()){
                System.out.println("Please enter a whole number: ");
                console.next();
            }
            numOfPizzas = console.nextInt();
            //checks to be sure pizza order is between 1 and 50 pizzas
            if (numOfPizzas >=1 && numOfPizzas <=50)
                break;
            System.out.println("We can only accommodate orders between 1 and 50 pizzas. Please enter a different order number: ");
            }


        //user scanner to get number of toppings per pizza
        System.out.println("How many toppings would you like on your pizzas? ");
        while (true){
            // Check to be sure number of toppings is a whole number
            while (!console.hasNextInt()){
                System.out.println("Please enter a whole number: ");
                console.next();
            }
            numOfToppings = console.nextInt();
            // Check to be sure toppings number is between 0 and 25
            if (numOfToppings >= 0 && numOfToppings <= 25)
                break;
            System.out.println("We can only accommodate between 0 and 25 toppings. Please enter a different number of toppings: ");
        }

        //calculate full cost
        int fullCost = ((9+numOfToppings)*numOfPizzas);

        //Calculate Discount
        double discount = fullCost * .15;

        // Calculate final cost
        double finalCost = fullCost - discount;


        System.out.println(" ********** Welcome to Joe's Pizza Shop! ********** ");
        System.out.println("Customer Name: " + custName);
        System.out.println("Number of Pizzas: " + numOfPizzas);
        System.out.println("Number of Toppings on each Pizza: " + numOfToppings);
        System.out.println("Full Cost: "+ fullCost);
        System.out.println("Discount: " + (int)discount);
        System.out.println("Final Cost: " + (int)finalCost);
        System.out.println("********** Have a Great Day! **********");
    }
}
