import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[6];
		System.out.println("Enter the six elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int even=0,odd=0;
		for(int a:arr) {
			if(a%2==0) {
				even=even+a;
			}
			else {
				odd=odd+a;
			}
		}
		System.out.println("Sum of even numbers : "+even);
		System.out.println("Sum of odd numbers : "+odd);

	}

}
