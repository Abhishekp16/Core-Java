/*
09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
 Now convert the entered days into complete years, months and days and print them
*/

import java.util.Scanner;

class Q9{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total days:");
		int days = sc.nextInt();
		
		//calculate years
		int year = days/365;
		int rem_day = days % 365;
		
		//calculate months
		int months = rem_day/30;
		
		
		//calculate days
		int day = rem_day % 30;
		
		System.out.println("Total : "+year+" years "+months+" months "+day+" days ");
		
	}
	
}