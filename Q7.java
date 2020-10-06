
/*
07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
 Take the obtained marks from user using Scanner class.
 Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.
*/

import java.util.Scanner;

class Q7{
	
	public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st value : ");
			int num1 = sc.nextInt();
			System.out.println("Enter 2nd value : ");
			int num2 = sc.nextInt();
			System.out.println("Enter 3rd value : ");
			int num3 = sc.nextInt();
			System.out.println("Enter 4th value : ");
			int num4 = sc.nextInt();
			System.out.println("Enter 5th value : ");
			int num5 = sc.nextInt();
			
			int sum = num1 + num2 + num3 + num4 + num5;
			System.out.println("Sum is:"+sum);
			double Percent =(sum*100)/500;
			System.out.println("Percentage is:"+Percent+" %");
			
	}
	
}