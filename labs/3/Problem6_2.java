/**
 * file: Problem6_2.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 23, 2017
 * version: 1.0
 * 
 * This file contains the code that create a new methed 
 * that calculates the sum of an integer.
 */

import java.util.Scanner;

public class Problem6_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    //Prompts the user to enter a number
    System.out.println("Print a integer to so that the integers digit's can be added: "); 
    //Collecting data
    long n =input.nextLong();
    
    //calling the method and changing int to long
    int sum = sumDigits(n);
    
    //outputting the results
    System.out.println("The sum of the integer " + n + " is " + Math.abs(sum));
  }
  
/**
 * sumDigits
 *
 * This function computes the sum of digits 
 * from the users input. 
 * 
 * Parameters:
 *   n: the number which is then split up and added
 * 
 * Return value: the sum of the numbers.
 */
  public static int sumDigits(long n) {

    int number = (int) n;
    int sum = 0; 
    int digit = 0; 
    
    //Creating a loop that test removes the numbers and adds them together
    while(number!=0) {
      digit = number % 10;
      sum +=digit; 
      number = number / 10;
    }
    return sum;
  }
}

 