/*
Write a program to print table of any entered number using loop
*/

import java.util.Scanner;

class Q16{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate table");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int ans = num * i;
			System.out.println(+num+" * "+i+" = "+ans);
		}
		
	}
	
}