/*
Create an integer type 2-D array of size [3X3].
Take the elements from the user and then calculate the sum of the elements present in the diagonal.
*/
import java.util.*;
public class Q30 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        int [][]arrMain = new int[row][];

        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        arrMain = new int[row][col];

        System.out. println("Enter values in array : ");

        for(int i=0; i<arrMain.length; i++)
        {
            for(int j=0; j<col; j++)
            {
                arrMain[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for(int i=0; i<arrMain.length; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arrMain[i][j]+" ");
            }
            System.out.println();
        }

        int sum =0;
        //addition of diagonal elements
        for(int i=0; i<arrMain.length; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(arrMain[i] == arrMain[j])
                {
                    sum = sum + arrMain[i][j]; 
                }
            }
        }

        System.out.println("Sum of diagonal element is : "+sum);
    }

}
