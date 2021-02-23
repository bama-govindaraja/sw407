package lab2;

import javax.swing.JOptionPane;

public class JOptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		double area;
		
		String strRad= JOptionPane.showInputDialog("Enter radius");
		
		radius = Double.parseDouble(strRad);
		
		area = 3.14 * radius * radius;
		
		JOptionPane.showMessageDialog(null, "area is " + area);

	}

}
