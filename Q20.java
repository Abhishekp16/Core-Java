/*
Print all prime numbers between two given numbers. [ break continue ]
*/

import java.util.Scanner;

class Q20{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first and last number");
		int first = sc.nextInt();
		int last = sc.nextInt();
		
		int flag;
		
		for(int i=first; i<=last; i++)
		{
			
			flag = 0;
			for(int j=2; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(i);
			}
				
		}
		
	}
	
}