/*
35.	Create a class MathOperation that has four static methods.
add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
multiply() method that takes two integer numbers as parameter and returns the product. 
power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of 
MathOperation class by providing entered numbers and prints the return values of every method.
*/

import java.util.Scanner;

class MathOperation{
    static int add(int n1, int n2)
    {
        return(n1+n2);
    }
    static int subtract(int n1, int n2)
    {
        return (n1-n2);
    }
    static int mul(int n1, int n2)
    {
        return (n1*n2);
    }
    static int pow(int n1, int n2)
    {
        int power = (int)Math.pow(n1, n2);
        return power;
    }
}
public class Q35 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans1 = MathOperation.add(n1, n2);
        int ans2 = MathOperation.subtract(n1, n2);
        int ans3 = MathOperation.mul(n1, n2);
        int ans4 = MathOperation.pow(n1, n2);

        System.out.println("Sum : "+ans1);
        System.out.println("Subtract : "+ans2);
        System.out.println("Multiplication : "+ans3);
        System.out.println("Power : "+ans4);
        sc.close();
    }

}
