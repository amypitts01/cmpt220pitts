/**
 * file: ProjectOne.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: Project 1
 * date: March 14, 2017
 * version: 1.0
 * 
 * This file contains code that adds does the convolution equation on two vectors 
 */
 
import java.util.Scanner;

public class ProjectOne {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    //System.out.println("Enter size of the first vector: ");
    int size1 = input.nextInt();
    
    //System.out.println("Enter size of the Second vector: ");
    int size2 = input.nextInt();
    
    //Making the first array 
    double[] array1 = new double[size1];
    
    //System.out.println("Enter " + size1 + " numbers for first array: ");
    for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextDouble();
    }
    
    //Making the Second array 
    double[] array2 = new double[size2];
    
    //System.out.println("Enter " + size2 +  " numbers for second array: ");
    for (int i = 0; i < array2.length; i++)
      array2[i] = input.nextDouble();
    
    //System.out.println("The results array: ");
    //Printing the result vector invoking both the print method and the convolution operation. 
    printArr(convolutionOperation(array1,array2));
    
  }
/**
* convolution operation
*
* This the sum of shifting the two vector products. 
* 
* Parameters:
*   the arrays
* 
* Return value: returns the results of the convolution operation in the conOper array.
*/
  public static double[] convolutionOperation(double[] arr1, double[] arr2) {
    //Creates the array that holds the results 
    double[] conOper = new double[(arr1.length + arr2.length)-1];
    
    //Creating the idx variable 
    int idx = 0;
    
    //Creating the shift variable 
    int shift = 0; 
    
    //Creating a while statment to calculate convolution 
    while(idx < conOper.length) {
      System.out.println("the index is: " + idx); //take out
      //resetting shift
      shift = 0;
      while(shift < arr2.length) {
        //Making sure that the idx is not out of bounds
        if(idx-shift >= arr1.length || idx-shift < 0 || shift >= arr2.length){
        }
        else {
          conOper[idx] += (arr1[(idx-shift)] * arr2[shift]);
        }
        shift++;
      }
      idx++;
    }
    //returning the array
    return conOper;
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
    for( int k=0; k < arr.length; k++) {
     //Prints the numbers in the array
     System.out.print(Math.round(arr[k]) + " ");
    }
    System.out.println();
  }
}
