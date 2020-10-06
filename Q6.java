/*
06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
 Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;

class Q6{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int rad = sc.nextInt();
		float pi = 3.14F;
		double area = pi*rad*rad;
		double circle = 2*pi*rad;
		System.out.println("Area of circle: ");
		System.out.printf("%.2f" ,area);
		System.out.println("Circumference of circle: ");
		System.out.printf("%.2f" ,circle);
		
	}	
}