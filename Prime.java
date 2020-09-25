//18.	Program to check whether number is prime or not.
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter the number : ");
		int x = sc.nextInt();
		
		for(int i=2;i<x/2;i++) {
			if(x%i==0) {
				System.out.println(x+" is Not a prime number");
				count=1;
				break;
			}
		}
		if(count == 0) {
			System.out.println(x+" is a prime number");
		}
		
		

	}

}
