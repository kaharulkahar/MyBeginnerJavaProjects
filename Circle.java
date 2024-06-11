import java.util.Scanner;
import javax.swing.*;

public class Circle {
	//attributes
	private int radius;
	final double PI = 3.14;
	

	//method	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double computeArea( ) {
		return PI* Math.pow(radius, 2);
	}
	
	//main 
	public static void main (String [] args) {
		//scanner
		Scanner sc = new Scanner(System.in);
		
		int y, z, area;
		String y1;
		
		//GUI
		y1 = JOptionPane.showInputDialog ("Please set radius.");
		y = Integer.parseInt (y1);
		
		//Object
		Circle c1 = new Circle ();	
		c1.setRadius(y);
		z = c1.getRadius();
		area = (int) c1.computeArea();
		
		//Output
		System.out.println("The radius is "+ z);
		JOptionPane.showMessageDialog (null,"The radius is "+ z);
		
		System.out.println("The area of the circle is "+ area);
		JOptionPane.showMessageDialog (null,"The area of the circle is "+ area);
	}
}