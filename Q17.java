/*
Write a program to reverse a given number.
*/

import java.util.Scanner;

class Q17{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int rev=0;
		int rem=0;
		
		while(num > 0)
		{
				 rem = num % 10;
				 num = num / 10;
				 rev = (rev*10)+rem;	
		}
		
		System.out.print("Reverse number is : "+rev);
		
	}
	
}