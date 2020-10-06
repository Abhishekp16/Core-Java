/*
10.	Write a program to convert temperature from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class Q10{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fahrenheit temperature is : ");
		double fah = sc.nextDouble();
		double cel = 5*(fah-32)/9;
		System.out.println("Fahrenheit temp : "+fah+" Celcius temp is : "+cel);
		
	}
	
}