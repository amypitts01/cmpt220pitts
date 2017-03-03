/**
 * file: Problem7_9.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 4
 * date: March 2, 2017
 * version: 1.0
 * 
 * This file contains code that Finds the smallest element 
 */
 
import java.util.Scanner;

public class Problem7_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Making the array 
    double[] array = new double[10];
    
    //Getting user inputs
    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextDouble();
    }
    
    System.out.println("The smallest value is: " + min(array) );
    
    
  }
/**
* min
*
* This finds the smallest number in a array
* 
* Parameters:
*   the array
* 
* Return value: the minimum value in the array.
*/
  //The news method that the book provided that returns the smallest integer. 
  public static double min(double[] array) {
    
    double min = array[0];
    
    //find the smallest value
    for (int i = 1; i< array.length; i++) {
      if(array[i]< min) 
        min = array[i];
    }

    return min;
  }
}