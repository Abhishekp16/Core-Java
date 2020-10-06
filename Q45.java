/*
45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. 
Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new 
member semester to it. Create default and parameterized constructors. Also override show() method that calls super 
class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new 
member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() 
method that calls super class show() method and displays className. Create a class( say Demo) with main method that 
carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or 
SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- 
display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent 
or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. 
*/

import java.util.Scanner;

class Student
{
    int rollno;
    double percentage;

    Student()
    {
        rollno = 0;
        percentage = 0;
    }
    Student(int rollno, double percentage)
    {
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show()
    {
        System.out.println("Roll no : "+rollno+" , Percentage : "+percentage);
    }
}

class CollegeStudent extends Student
{
    int semester;

    CollegeStudent()
    {
        semester = 0;
    }
    CollegeStudent(int rollno, double percentage,int semester)
    {
        super(rollno,percentage);
        this.semester = semester;
    }
    void show()
    {
        super.show();
        System.out.println("Semester : "+semester);
    }
}

class SchoolStudent extends Student
{
    int className;

    SchoolStudent()
    {
        className = 0;
    }
    SchoolStudent(int rollno, double percentage, int className)
    {
        super(rollno, percentage);
        this.className = className;
    }
    void show()
    {
        super.show();
        System.out.println("Class Name : "+className);
    }
}
public class Q45 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        CollegeStudent ar[] = new CollegeStudent[2];
        for(int i=0; i<ar.length; i++)
        {
            System.out.println("Enter rollno and percentage");
            int rollno = sc.nextInt();
            double percentage = sc.nextDouble();
            System.out.println("Enter semester :");
            int semester = sc.nextInt();
            CollegeStudent cs = new CollegeStudent(rollno,percentage,semester);
            ar[i]=cs;
        }
        SchoolStudent arr[] = new SchoolStudent[3];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter rollno and percentage");
            int rollno = sc.nextInt();
            double percentage = sc.nextDouble();
            System.out.println("Enter Classname :");
            int className = sc.nextInt();
            SchoolStudent ss = new SchoolStudent(rollno,percentage,className);
            arr[i]=ss;   
        }

        //display array
        System.out.println("Details of students are : ");
        for(CollegeStudent a : ar)
        {
            a.show();
        }
        for(SchoolStudent a : arr)
        {
            a.show();
        }
        sc.close();
    }
    
}
