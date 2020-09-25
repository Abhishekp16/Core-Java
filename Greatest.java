import java.util.Scanner;
class Greatest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 3 numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if( x>y && x>z ){
			System.out.println(x+ " is greatest number.");
		}
		else if( y>x && y>z ){
			System.out.println(y+ " is greatest number.");
		}
		else{
			System.out.println(z+ " is greatest number.");
		}
	}
}