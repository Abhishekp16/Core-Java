/*
31.	Create a class Student with 2 data members rno and name.
Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name.
Create one more method showData() to print the data member values.
Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/

//import java.util.Scanner;

class Students{
    private int rollno;
    private String name;

    void setData(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    void showData()
    {
        System.out.println(rollno+" "+name);
    }
}

public class Q31{

    public static void main(String[] args) {
        
        Students s = new Students();
        s.setData(1, "Test1");

        s.showData();
    }
}