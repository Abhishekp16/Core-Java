import java.util.Scanner;
   class Days{
	   public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
		  
		   System.out.print("Number of days is : ");
		   int x = sc.nextInt();
		   
		   int year = x / 365;
		   
		   int k = x - (365*year);
		   
		   int months = k / 30;
		   
		   int days = x - (months * 30);
		   
		   System.out.print(year+ "years " +months+ "months " +days+ "days ");
	   }
   }
		   