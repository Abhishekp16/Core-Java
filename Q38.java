/*
Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method 
to display no. of employees and total of their salaries.
*/

class Employee{

    int empNo=0;
    int sal;
    int totSal=0;
    int countEmp=0;

    /*Employee()
    {
        countEmp++;
        this.totSal = totSal + sal;
    }*/
    Employee(int empNo, int sal)
    {
        empNo++;
        this.sal = sal;
        totSal += sal; 
    }
    void display()
    {
        System.out.println("Employee Count : "+empNo);
        System.out.println("Employee Total salary : "+totSal);
    }

}

public class Q38 {
    
    public static void main(String args[])
    {
        //Employee e = new Employee();
        /*Employee e1 = new Employee(1,1000);
        Employee e2 = new Employee(2,2000);
        Employee e3 = new Employee(3,3000);*/
        Employee e4 = new Employee(4,4000);
        
        e4.display();
    }
}
