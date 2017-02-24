/**
 * file: Problem2_5.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 25, 2017
 * version: 1.0
 * 
 * This file contains the calculates a bill including grauity.
 */
import java.util.Scanner;

public class Problem2_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // enter the subtotal
    System.out.println( "Enter subtotal: $" );
    double subtotal = input.nextDouble();
    
    // enter the gratuity rate
    System.out.println( "Enter gratuity rate: " );
    double gratuity = input.nextDouble();
    
    //calculating total
    double total = ( subtotal * (gratuity/100) ) + subtotal;
    
    //reporting total
    System.out.println( "With a gratuity of: " + gratuity + " the total is : $" + total ); 
  }
}