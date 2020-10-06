/*
Sort a ten element array in descending order
*/

import java.util.Scanner;

class Q22{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int ar[]=new int[10];
		
		System.out.println("Enter values in array");
		for(int i=0; i<10; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.print(" "+ar[i]);
		}
		
		for(int i=0; i<10; i++)
		{
			for(int j=i+1; j<10; j++)
			{
				if(ar[i]<ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println();
		
		for(int i=0; i<10; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
}