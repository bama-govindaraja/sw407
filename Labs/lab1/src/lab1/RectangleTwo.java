package lab1;

import java.util.Scanner;

public class RectangleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello user");

		int length;
		int width;
		int area;

		System.out.println("Enter Length");

		Scanner console = new Scanner(System.in);

		length = console.nextInt();

		System.out.println("Enter Width");

		width = console.nextInt();

		area = length * width;

		System.out.println("Area of the rectangle is " + area);

	}

}
