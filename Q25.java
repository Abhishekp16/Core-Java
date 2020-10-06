/*
Write the program to find the sum of even elements and sum of odd elements present in the array of integer type
*/

//import java.io.*; 
  
class Q25 { 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0, odd = 0; 
  
        // Loop to find even, odd sum 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
  
        System.out.println("Even index positions sum: " + even); 
        System.out.println("Odd index positions sum: " + odd); 
    } 
} 