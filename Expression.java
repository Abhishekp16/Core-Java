import java.util.Scanner;
class Expression{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.print("Enter the value of x : ");
		x = sc.nextInt();
		y = x*x + 3*x - 7;
    
       System.out.println(y);          // first eqn
	   System.out.println("*******************************************************************");
	   y = x++ + ++x;
	     System.out.println("Value of X = " +x);
		   System.out.println("Value of Y = " +y);  //second eqn
	   System.out.println("*******************************************************************");
		   
		   z = x++ - --y - --x  +  x++;
		   System.out.println("Value of X = " +x);
		   System.out.println("Value of Y = " +y);
		   System.out.println("Value of Z = " +z);
	   System.out.println("*******************************************************************");
		  
         boolean a = true;
         boolean b = false;
         boolean c;
       System.out.println("Value of A = " +a);
       System.out.println("Value of B = " +b);
  

         c = a && b || !(a || b);
          System.out.println("output of C = " +c);		 
		   
		   
	} 
}	