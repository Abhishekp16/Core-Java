import java.util.Scanner;
class Percent{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Marks of C++ : ");
		int v = sc.nextInt();
		
		System.out.print("Marks of DS : ");
		int w = sc.nextInt();
		
		System.out.print("Marks of DBT : ");
		int x = sc.nextInt();
		
		System.out.print("Marks of AWEP :  ");
		int y = sc.nextInt();
		
		System.out.print("Marks of MEAN STACK : ");
		int z = sc.nextInt();
		
		double sum = v+w+x+y+z;
		double percent = sum / 5.0;

        System.out.println("Percentage marks : " +percent+" %");		
		
	}
}