/*
Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 

*/
import java.util.Scanner;

class MathOperation1{
    void mul(int a,int b)
    {
        int ans = a*b;
        System.out.println("Multiple of a,b : "+ans);
    }
    void mul(float a, float b, float c)
    {
        float ans2  = a*b*c;
        System.out.println("Multiple of a,b,c : "+ans2);
    }
    void mul(int arr[])
    {
        int ans3=1;
        for(int i=0; i<arr.length; i++)
        {
            ans3 = ans3 * arr[i];
        }
        System.out.println("Multiple of array : "+ans3);
    }
    void mul(int a, double b)
    {
        double ans4 = a*b;
        System.out.println("Multiple of array : "+ans4);
    } 
}
public class Q36 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        MathOperation1 m = new MathOperation1();
        m.mul(5,6);
        m.mul(4.0f,5.0f,6.0f);
        m.mul(arr);
        m.mul(6,5.0);
        sc.close();
    }
}
