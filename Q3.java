/*
03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/

class Q3{
	
	public static void main(String args[]){
		
		int x = 2;
		
		int y= (x*x)+(3*x)-7;
		int y1 = x++ + ++x;
		int z = x++ - --y - --x + x++;
		boolean b1= true;
		boolean b2= false;
		boolean z1 = b1 && b2 || !(b1 || b2);
		
		System.out.println("y = "+y);
		System.out.println("y1 = "+y1);
		System.out.println("z = "+z);
		System.out.println("z1 = "+z1);
	}
}