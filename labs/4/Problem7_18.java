/**
 * file: Problem7_18.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 4
 * date: March 2, 2017
 * version: 1.0
 * 
 * This file contains code that bubble sorts 
 */
 
import java.util.Scanner;

public class Problem7_18 {
  public static void main(String[] args) {
    
    //Making the array 
    double[] array = new double[10];
    
    //Collecting the users inputs 
    System.out.println("Enter 10 numbers: ");
    Scanner input = new Scanner(System.in); 
    for (int k = 0; k < array.length; k++)
      array[k] = input.nextDouble();
      
    //bubble sort
    for(int l = 0; l < array.length; l++) {
      for (int k = 0; k < array.length-1; k++) {
        if(array[k] > array[k+1]) 
          bubbleSort(array, k, k+1);
      }
    }
    
    System.out.println("The bubble sorter says that the order is: " );
    
    //Prints the array
    printArr(array);
    
  }
/**
* bubbleSort
*
* This sorts an array of 10 numbers
* 
* Parameters:
*   the array
* 
* Return value: it does not return a value but it just messes with the original.
*/
  public static void bubbleSort(double[] arr, int idx1, int idx2) {
    //Creates a temporary variable 
    double tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
  }
/**
* printArr
*
* This prints an array of 10 numbers
* 
* Parameters:
*   the array
* 
* Return value: it does not return a value but it just prints.
*/
  public static void printArr(double[] arr) {
   for( int k=0; k < arr.length; k++) 
     //Prints the numbers in the array
     System.out.println(arr[k] + " ");
  }
}
