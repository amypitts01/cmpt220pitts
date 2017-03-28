/**
 * file: Problem7_31.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: February 27, 2017
 * version: 1.0
 * 
 * This file contains the code that merge two sorted lists.
 */
 
import java.util.Scanner;
import java.util.Arrays;

public class Problem7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        
    System.out.println("Enter size of the first vector: ");
    int size1 = input.nextInt();
    
    //Making the first array 
    int[] array1 = new int[size1];
    
    System.out.println("Enter " + size1 + " numbers for first array: ");
    for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextInt();
    }
    
    System.out.println("Enter size of the Second vector: ");
    int size2 = input.nextInt();
    
    //Making the Second array 
    int[] array2 = new int[size2];
    
    System.out.println("Enter " + size2 +  " numbers for second array: ");
    for (int i = 0; i < array2.length; i++) {
      array2[i] = input.nextInt();
    }

    //Print the array
    System.out.println("The sorted and merged array is: "); 
    System.out.println(Arrays.toString(merge(array1, array2)));
  }

/**
 * selectionSort
 *
 * This function merges two sorted arrays
 *
 * 
 * Parameters:
 *   arrays from user
 * 
 * Return value: the merge array
 */
  public static int[] merge(int[] list1, int[] list2) {  
 
    //Making a new array to hold the merged array
    int[] answer = new int[list1.length + list2.length];
  
    //Adding the numbers to the new array
    int k = 0;
    for(int i = 0; i < list1.length; i++){
      int tmp = list1[i];
      answer[k]= tmp;
      k++; 
    }
    
    k = list1.length;
    
    for(int j = 0; j < list2.length; j++) {
      int tmp = list2[j];
      answer[k] = tmp;
      k++;
    }

    Arrays.sort(answer);

    return answer;
  }
}
  
