import java.util.Scanner;
class Circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r;
		double area,circumference;
		System.out.print("Radius of circle : ");
        r = sc.nextInt();
		
		area = 3.14 * r * r;
		circumference = 2 * 3.14 * r;
		
		System.out.println("Area of circle " +area);
		System.out.println("Circumference of circle " +circumference);
        }
}
		
		
		
		


          		
	