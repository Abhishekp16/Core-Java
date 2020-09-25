import java.util.Scanner;
class Interest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Principle amount is : ");
		double p = sc.nextDouble();
		
		System.out.print("Rate is : ");
		double r = sc.nextDouble();
		
		System.out.print("Time is : ");
		double t = sc.nextDouble();
		
		double si = (p * t * r)/100;
		
		System.out.print("Simple interest is : " +si);
	}
}	
		
		
		
		
		