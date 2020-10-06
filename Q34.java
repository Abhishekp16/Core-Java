/*
34.	Create a class Circle that has two data members, one to store the radius and
 another to store area and three methods first init()
 method to input radius from user, second calculateArea() method to calculate area of
  circle and third display() method to display values of radius and area. Create class
   CircleDemo ( main class) that creates the Circle object and calls init(), calculate
   Area() and display() methods
*/
import java.util.Scanner;

class Circle{
    private int rad;
    private double area;
    private double pi = 3.14;

    void firstInit(int rad)
    {
        this.rad = rad;
    }
    void calculateArea()
    {
        area = pi*rad*rad;
    }
    void display()
    {
        System.out.print("Radius : "+rad);
        System.out.println();
        System.out.printf("Area : %.2f",area);
    }
}
public class Q34 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of radius : ");
        int rad = sc.nextInt();

        Circle c = new Circle();
        c.firstInit(rad);
        c.calculateArea();
        c.display();
        sc.close();
    }
}
