import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("The first number is : ");
		int x = sc.nextInt();
		
		System.out.print("The second number is : ");
		int y = sc.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swapping First number is : "+x);
		System.out.println("After swapping second number is : "+y);
	}
}
		
 		