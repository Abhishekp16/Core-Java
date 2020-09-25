import java.util.Scanner;
class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your basic salary : ");
		double x = sc.nextDouble();
		
		    double bhra = x * 0.10;
			double bda = x * 0.90;
			double ahra = 500;
			double ada = x * 0.98;
			double bgs = x + bhra + bda;
			double ags = ahra + ada;
			
			if(x<1500){
				System.out.println("Your Gross Salary is : " +bgs);
			}
			else{
				System.out.println("Your Gross Salary is : " +ags);
			}
	}
}
				
		
		