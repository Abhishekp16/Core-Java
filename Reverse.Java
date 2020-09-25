// 17.	Write a program to reverse a given number.
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int x,rev=0,rem;
	  System.out.print("Enter the Number : ");
	  x = sc.nextInt();
	  
	  while(x!=0) {
		  rem = x % 10;
		  rev = rev * 10 + rem;
		  x = x / 10;
		  
		 
	  }
	  System.out.println("The Reverse number is : "+rev);
	}

}
