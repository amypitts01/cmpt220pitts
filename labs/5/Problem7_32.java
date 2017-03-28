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
        
    System.out.println("Enter size of the vector: ");
    int size = input.nextInt();
    
    //Making the array 
    int[] array1 = new int[size];
    
    System.out.println("Enter " + size1 + " numbers for first array: ");
    for (int i = 0; i < array1.length; i++) {
      array[i] = input.nextInt();
    }
    
    //Print the array
    System.out.println("The partition array is: "); 
    System.out.println(Arrays.toString(partition(array)));
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
  
  if(list[1] > pivot) 

  }
}
  
