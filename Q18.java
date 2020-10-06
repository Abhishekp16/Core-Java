/*
Program to check whether number is prime or not.
*/

import java.util.Scanner;

class Q18{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if( num==0 || num==1 || num==2)
		{
			System.out.println(+num+"Not a prime number");
		}
		
		for(int i=2; i<num/2; i++)
		{
			if(num % i == 0)
			{
				System.out.println(+num+" is not prime number.");
				break;
			}
			else
			{
				if(i==num/2)
					System.out.println(+i+" is prime number.");
				else
					continue;
			}
		}
		
	}
	
}