/**
 * file: Problem7_32.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: February 27, 2017
 * version: 1.0
 * 
 * This file contains the code that Partition of a list.
 */
 
import java.util.Scanner;
import java.util.Arrays;

public class Problem7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        
    System.out.println("Enter size of the array: ");
    int size = input.nextInt();
    
    //Making the array 
    int[] array = new int[size];
    
    System.out.println("Enter " + size + " numbers for first array: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }
    //invoking the method
    int results = partition(array);
    //Print the array
    System.out.println("The partition array is: " + results); 
  }

/**
 * partition
 *
 * This function partitions a list using pivot values
 *
 * 
 * Parameters:
 *   array from user
 * 
 * Return value: the partition array
 */
  public static int partition(int[] list) {  
  
    int pivot = list[0];
    for( int i = 0; i < list.length -1; i++) {
      if(list[i] <= pivot) {
        list[i] = pivot; 
      }
    }
    int results = 0;
    for( int j = 0; j < list.length -1; j++) {
      if(list[j] == pivot) {
        results = j-1;
      }
    }
    return results;
  }
}
  
