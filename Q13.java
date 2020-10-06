/*
13.	Program to find greatest in 3 numbers.
 [ once using if else statement and then using ternary operator ( logical operator) ]  
*/

import java.util.Scanner;

class Q13{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int n3 = sc.nextInt();
		/*
		if(n1>n2 && n1>n3){
			System.out.println(+n1+" is greater number");
		}
		else if (n2>n1 && n2>n3){
			System.out.println(+n2+" is greater number");
		}
		else{
			System.out.println(+n3+" is greater number");
		}*/
		
		int max = (n1 > n2) ?  (n1 > n3 ? n1 : n3) :  (n2 > n3 ? n2 : n3);
		
			System.out.println("Greater number is : "+max);
		
	}
	
}