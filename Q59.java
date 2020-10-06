//59.	Create a class Voter(voterId, name, age) with parameterized constructor.  The parameterized constructor
//should throw a checked exception if age is less than 18. The message of exception is “invalid age for voter ” 
import java.util.Scanner;
class Voterage extends Exception{
	private int voterId;
	private String name;
	private int age;
	Voterage(){
		super("Invalid age for voter..");
	}
	Voterage(int voterId, String name, int age){
		this.voterId=voterId;
		this.name=name;
		this.age=age;
	}
}
public class Q59{
	
	static void ageV(int Vage)throws Voterage  {
		if(Vage>18) {
			System.out.println("Age = "+Vage);
	}else {
		throw new Voterage();
	}
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int a = sc.nextInt();
		try {
			ageV(a);
		}catch(Voterage e) {
			System.out.println(e);
		}
		sc.close();
	}

}
