/*
32.	Modify the above program (no. 30) to count the no of Student objects created.
 [ In this program static variable is required ]
*/

class StudentsDemo{
    private int rollno;
    private String name;
    static int count = 0;

    StudentsDemo()
    {
        count++;
    }

    void setData(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    void showData()
    {
        System.out.println(rollno+" "+name);
        System.out.println("Count : "+count);
    }
}

public class Q32{

    public static void main(String[] args) {
        
        StudentsDemo s = new StudentsDemo();
        StudentsDemo s1 = new StudentsDemo();
        StudentsDemo s2 = new StudentsDemo();
        StudentsDemo s3 = new StudentsDemo();
        s.setData(1, "Test1");
        s1.setData(1, "Test1");
        s2.setData(1, "Test1");
        s3.setData(1, "Test1");

        s.showData();
        s1.showData();
        s2.showData();
        s3.showData();
    }
}