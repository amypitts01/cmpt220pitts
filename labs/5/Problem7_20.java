/**
 * file: Problem7_20.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: February 27, 2017
 * version: 1.0
 * 
 * This file contains the code that Revises selection sort from 7.11.
 */
 
import java.util.Scanner;
import java.util.Arrays;

public class Problem7_20 {
  public static void main(String[] args) {
     
    //Making the array 
    double[] array = new double[10];
    
    //Collecting the users inputs 
    System.out.println("Enter 10 numbers: ");
    Scanner input = new Scanner(System.in); 
    for (int k = 0; k < array.length; k++)
      array[k] = input.nextDouble();
    
    //Invoking the method
    selectionSort(array);
    
    //Print the array
    System.out.println("The sorted array is: "); 
    System.out.println(Arrays.toString(array));
  }

/**
 * selectionSort
 *
 * This function sorts an array so that largest number is last
 * It uses the largest number and switches it with the last
 * 
 * Parameters:
 *   array from user
 * 
 * Return value: it just changes the array
 */
  public static void selectionSort(double[] list) {  
    for (int i = list.length -1; i >= 0; i--) {
      // Find the max in the list[i ... list.length-1]
      double currentMax = list[i];
      int currentMaxIndex = i;
      
        
      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j; 
        }
      }
      
      // Swap list[i] with list[currentMinIndex] if necessary
      if (currentMaxIndex !=i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
}
  
