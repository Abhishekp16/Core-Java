
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int n,sum=0;
		
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			
		}
		
		int avg = sum / n;
		
		System.out.println("The average of numbers is : " +avg);
		

	}

}
