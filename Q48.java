import java.util.Scanner;

//48.	Create an Abstract class Processor with int member variable data  and method showData to display 
//data value. Create abstract method process() to define processing of member data. Create a class  
//Factorial using abstract class Processor  to calculate and print factorial of a number by overriding 
//the process method. b. Create a class Circle using abstract class Processor to calculate and print area 
//of a circle by overriding the process method.Ask user to enter choice (factorial or circle area). 
//Also ask data to work upon. Use Processor class reference to achieve this mechanism.

abstract class Processor{
	int data;
	abstract void process(int data);
	void show() {
		System.out.println("data = "+data);
	}
}

class Factorial extends Processor{

	@Override
	void process(int data) {
		int d=data;
		int f=1;
		while(data>=1)
		{
			f=f*data;
			data=data-1;
		}
		System.out.println("Factorial of "+d+" is = "+f);
	}
	
}

class Circle extends Processor{

	@Override
	void process(int data) {
		double area;
		area = (3.14 * data *data);
		System.out.println("Area of circle is = "+area);
	}
	
}
class Q48 {

	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int data;
	Processor f = new Factorial();
	Processor c = new Circle();
	System.out.println("Enter your choice : ");
	System.out.println("For Factorial enter 1");
	System.out.println("For area of circle enter 2");
	int choice = sc.nextInt();
	switch(choice)
		{
			case 1 : 
					System.out.println("Enter the number : ");
					data = sc.nextInt();
					f.show();
					f.process(data);
					break;
			
			case 2 : 
					System.out.println("Enter the number : ");
					data = sc.nextInt();
					c.show();
					c.process(data);
					break;
			default : 
					System.out.println("Invalid Input");
				
		}
	}

}