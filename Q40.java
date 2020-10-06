/*
Create a class Student having data members name, roll no., age and score. 
Write a program to accept 10 records of student and store them in an array. 
And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
*/

import java.util.Scanner;

class Student1{
    private String name;
    private int roll_no;
    private int age;
    private double score;

    void set(String init_name, int init_roll_no, int init_age, double init_score)
    {
        name = init_name;
        roll_no = init_roll_no;
        age = init_age;
        score = init_score;
    }

    public double getScore()
    {
        return score;
    }

    void show()
    {
        System.out.println("Details are : "+name+" "+roll_no+" "+age+" "+score);
    }

}
public class Q40 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student1 st[] = new Student1[10];
        for(int i=0; i<st.length; i++)
        {
            System.out.println("Enter name, roll no, age, score");
            String init_name = sc.next();
            int init_roll_no = sc.nextInt();
            int init_age = sc.nextInt();
            double init_score = sc.nextDouble();
            Student1 s = new Student1();
            s.set(init_name, init_roll_no, init_age, init_score);
            st[i]=s;
            //s.arrange();
        }

        System.out.println("Group 0 to 50");
        for(int i=0; i<st.length; i++)
        {
            if(st[i].getScore()>0 && st[i].getScore()<=50)
            {
                st[i].show();
            }
        }

        System.out.println("Group 50 to 65");
        for(int i=0; i<st.length; i++)
        {
            if(st[i].getScore()>50 && st[i].getScore()<=65)
            {
                st[i].show();
            }
        }

        System.out.println("Group 65 to 80");
        for(int i=0; i<st.length; i++)
        {
            if(st[i].getScore()>65 && st[i].getScore()<=80)
            {
                st[i].show();
            }
        }

        System.out.println("Group 80 to 100");
        for(int i=0; i<st.length; i++)
        {
            if(st[i].getScore()>80 && st[i].getScore()<=100)
            {
                st[i].show();
            }
        }
        
        

        sc.close();
    }
}
