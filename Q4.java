/*
04.	Write a program that initializes 2 byte type of variables.
 Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required
 in this program ] .
*/

import java.util.Scanner;

class Q4{
	
	public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			//Enter 1st number
			System.out.println("Enter 1st number : ");
			byte num1 = sc.nextByte();
			//Enter 2nd number
			System.out.println("Enter 2nd number : ");
			byte num2 = sc.nextByte();
			
			int ans = num1 + num2;
			byte ans2 = (byte)ans;
			System.out.println("sum of "+num1+" and "+num2+" : "+ans);
			System.out.println("After typecasting : "+ans2);
		
	}
	
}