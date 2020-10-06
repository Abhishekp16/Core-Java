/*
Calculate  series : 12+22+32+42+.........+n2.
*/

import java.util.Scanner;

class Q19 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ending number for series : ");
		int num = sc.nextInt();
		
		int ans=0;
		
		for(int i=12; i<=num; i=i+10)
		{
			if
			System.out.print(+i+" + ");
			ans= ans + i;
		}
		System.out.println("");
		System.out.println("Answer of series is : "+ans);
		
	}
	
}