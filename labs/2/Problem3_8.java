/**
 * file: Problem3_8.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code that displays a integer in non-decreasing order.
 */
   
import java.util.Scanner;

public class Problem3_8 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //First prompt 
    System.out.println( "Enter an integer: " );
    int first = input.nextInt();
    
    //Second prompt
    System.out.println( "Enter a second integer: ");
    int second = input.nextInt();
    
    //Third prompt
    System.out.println( "Enter one more integer: ");
    int third = input.nextInt(); 
    
    //Put the numbers in the correct order using if else statements. There are six different possibilities   
    if (first >= second && second >= third ) {
      System.out.println( "The order is: " + third + ", " + second + ", " +  first);
    } else if (third >= first && first >= second ) {
      System.out.println( "The order is: " + second + ", " + first + ", " + third);
    } else if (first >= third && third >= second ) {
      System.out.println( "The order is: " + second + ", " + third + ", " + first );
    } else if (third >= second && second >= first) {
      System.out.println( "The order is: " + first + ", " + second + ", " + third );
    } else if ( second >= third && third >= first) {
      System.out.println( "The order is: " + first + ", " + third + ", " + second);
    } else if ( second >= first && first >= third ) {
      System.out.println( "The order is: " + third + ", " + first + ", " + second);
    } else {
      System.out.println( "Please enter numbers");
    }
    
  }
}