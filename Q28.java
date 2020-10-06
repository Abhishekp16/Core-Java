/*
Initialize one String type of array and print the elements using for each loop.
*/

import java.util.*;

public class Q28 {

     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter number of strings you want to add : ");
           int arEle = sc.nextInt();
           String ar[]= new String[arEle];

           System.out.println("Enter Names : ");
           for(int i=0; i<ar.length; i++)
           {
               ar[i] = sc.next();
           }

           System.out.println("The names are : ");
           for(String a : ar)
           {
               System.out.print(a+" ");
           }
    }


}
