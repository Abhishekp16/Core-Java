//60.	Create Interface StudentFee and declare following method. 
//getFee() throws InvalidFeeException. This method ask fees from user 
//and throws exception if user enters invalid or negative fees Create
//class Student with members (name, fees) and implement the StudentFee Interface.

package Q60;

import java.util.Scanner;

interface StudentFee{
	int getFee();
}

public class Q60 implements StudentFee {
	
	static String name;
	int fee;
	
	public static void main(String[] args) {
		System.out.println("Enter name : ");
		Scanner sc = new Scanner(System.in);
		Q60 q = new Q60();
		q.name = sc.next();
		q.fee = q.getFee();
		System.out.println("Name : "+q.name+" Fee : "+q.fee);
	}

	@Override
	public int getFee() {
		System.out.println("Enter the Fee : ");
		Scanner sc = new Scanner(System.in);
		fee = sc.nextInt();
		if(fee<0) {
			try {
				throw new Exception("InvalidFeeException");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}else {
		return fee;
		}
		return 0;
	}

}
