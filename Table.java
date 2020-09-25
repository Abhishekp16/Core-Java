//16.	Write a program to print table of any entered number using loop.
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number that  you want a table of : ");
		int x = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int result = x*i;
			System.out.println(result);
		}

	}

}
