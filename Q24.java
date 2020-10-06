/*
Write a program to search an element in the array.
*/

import java.util.Scanner;

class Q24{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array elements : ");
		int arrele = sc.nextInt();
		int ar[] = new int[arrele];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("array elements : ");
		for(int a :ar )
		{
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.print("Enter number what you want to search : ");
		int srnum = sc.nextInt();
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==srnum)
			{
				System.out.println(srnum+" is in array");
				break;
			}
			/*else
			{
				System.out.println(srnum+" is not in array");
				continue;
			}*/
		}
		
	}
	
}