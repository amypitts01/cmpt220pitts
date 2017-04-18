/**
 * file: Problem9_13.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: April 16, 2017
 * version: 1.0
 * 
 * This file contains the code that Revises selection sort from 7.11.
 */
 
import java.util.Scanner;

public class Problem9_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    //Having the user enter in the number of rows and columns
    System.out.println("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    
    //Making the array 
    double[][] array = new double[rows][columns];
    
    //collecting the users array
    System.out.println("Enter the array ");
    for (int i = 0; i < array.length; i++) {
      for(int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    
    //calling the object using the method below
    Location location = locateLargest(array);
    
    //Printing the results of the location and the number
    System.out.println("The location of the largest elements is " + location.maxValue + " at (" + location.rows + ", " + location.columns + ")");
    
  }
  //The method
  public static Location locateLargest( double[][] a) {
    return new Location(a); 
  }
}
 
 
