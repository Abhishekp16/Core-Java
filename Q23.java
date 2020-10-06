/*
Write a program to reverse the array elements
*/

import java.util.Scanner;

class Q23{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array elements : ");
		int arrlen = sc.nextInt();
		
		int ar[] = new int[arrlen];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Original array : ");
		for(int a : ar)
		{
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		System.out.print("Reversed array : ");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
}