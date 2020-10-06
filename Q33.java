class Student{
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

public class Q33{

    public static void main(String[] args) {
        
        Student s = new Student();
        s.setData(1, "Test1");

        s.showData();
    }
}