

import java.util.Scanner;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range : ");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Prime numbers between the "+x+" and" +y+" is");
		
		 while (x < y) {
		     int flag = 0;

		      if (x <= 1) {
		         ++x;
		         continue;
		      }
		      
		      for(int i=2;i<x/2;++i) {
					if(x%i==0) {
						
						flag=1;
						break;
					}
		      }
		      
		      if (flag == 0)
		         System.out.println(x);
		      ++x;
		       
		      
	}

}
}
