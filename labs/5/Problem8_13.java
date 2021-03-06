/**
 * file: Problem8_13.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: February 27, 2017
 * version: 1.0
 * 
 * This file contains the code that Locate the largest element in 2D array
 */
 
import java.util.Scanner;
import java.util.Arrays;

public class Problem8_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        
    System.out.println("Enter the rows and columns of the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    
    //Making the array 
    double[][] array = new double[rows][columns];
    
    System.out.println("Enter the array ");
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    //Invoking the method
    int[] answers = locateLargest(array);
    
    //Print the array
    System.out.println("The location of the biggest number in the array is: (" + answers[0] + ", " + answers[1] + ")"); 
  }

/**
 * partition
 *
 * This function finds the largest value in a double array
 *
 * 
 * Parameters:
 *   array from user
 * 
 * Return value: the largest value place in the array
 */
  public static int[] locateLargest(double[][] a) {  
  
    int[] answer = new int[] {0,0};
  
    double maxValue = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++ ) {
        if (a[i][j] > maxValue) {
          maxValue = a[i][j];
          answer[0] = i;
          answer[1] = j;
          maxValue = a[i][j];
        }
      }    
    }
    
    return answer;
  
  }
}
  
