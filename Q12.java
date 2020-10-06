/*
12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
 then HRA = 10% of basic salary and DA = 90% of basic salary.
 If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
 If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class Q12{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Employee's Basic Salary : ");
		double sal = sc.nextDouble();
		
		if(sal < 10000)
		{
			double hra = sal * 10/100;
			double da = sal * 90/100;
			double GS = sal + hra + da;
			System.out.println("Gross Salary of Employee is : "+GS);
		}
		else if(sal >= 10000)
		{
			int hra = 2000;
			double da = sal * 98/100;
			double GS = sal + hra + da;
			System.out.println("Gross salary of Employee is: "+GS);
		}
		
	}
	
}