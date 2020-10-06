/*
Write a program to fine the smallest and greatest number present in the array of integer type.
*/

import java.util.Scanner;

public class Q27{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array element number:");
        int arEle = sc.nextInt();

        int ar[] = new int[arEle];
        System.out.println("Enter array elements:");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

        System.out.println("Array is");
        for(int a : ar)
        {
            System.out.print(+a+" ");
        }
        System.out.println();

        int temp;
        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                if( ar[j] < ar[i] )
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        System.out.println(" Sorted Array is");
        for(int a : ar)
        {
            System.out.print(+a+" ");
        }

        System.out.println();
        System.out.println("Smallest number in array is : "+ar[0]);
        System.out.println("Largest number in array is : "+ar[ar.length-1]);
    }
}