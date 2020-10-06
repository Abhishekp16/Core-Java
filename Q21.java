/*
Program to show sum and average of 10 element array. Accept array elements from user. 
*/

import java.util.Scanner;

class Q21 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		//int num= sc.nextInt();
		int ar[] = new int[10];
		
		for(int i=0; i<10; i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int a: ar)
		{
			sum = a+sum;
		}
		
		double avg = sum/10.0;
		
		System.out.println("Sum : "+sum);
		System.out.printf("Average : %.2f",avg);
		
	}
	
}

