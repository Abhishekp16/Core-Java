/*
Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId 
as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() 
method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary 
should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() 
method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary 
should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/

class Faculty
{
    private int facultyId;
    private int sal;
    Faculty(int facultyId)
    {
        this.facultyId = facultyId;
        sal = 0;
    }
    void printSalary()
    {
        System.out.println("Salary : "+sal);
    }

}

class FullTimeFaculty extends Faculty
{
    private int basicSalary, allowance;
    FullTimeFaculty(int facultyId,int basicSalary, int allowance)
    {
        super(facultyId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }
    void sal()
    {
        int sal = basicSalary + allowance;
        System.out.println(" FullTimeFaculty Salary : "+sal);
    }
}

class PartTimeFaculty extends Faculty
{
    int workingHour, ratePerHour;
    PartTimeFaculty(int facultyId, int workingHour, int ratePerHour)
    {
        super(facultyId);
        this.workingHour = workingHour;
        this.ratePerHour = ratePerHour;
    }
    void sal()
    {
        int salary = workingHour *ratePerHour;
        System.out.println("PartTimeFaculty Salary : "+salary); 
    }
}
public class Q44{
    public static void main(String args[])
    {
        FullTimeFaculty ff = new FullTimeFaculty(1, 30000, 6000);
        ff.sal();

        PartTimeFaculty pf = new PartTimeFaculty(2, 4, 1000);
        pf.sal();
    }
}
