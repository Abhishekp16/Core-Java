/*
15.	Accept person’s gender (character m for male and f for female),
 age (integer), as input and then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;

class Q15{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender M or F");
		char gender = sc.next().charAt(0);
		System.out.println("Enter Age of gender");
		int Age = sc.nextInt();
		
		if((gender== 'F' && Age > 18) || (gender=='M' && Age > 21))
		{
			System.out.println(" Eligible for marrige.");
		}
		else
		{
				System.out.println(" not eligible for marriage");
		}
		
	}
	
}