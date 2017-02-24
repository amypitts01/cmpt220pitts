//Amy Pitts 
/**
 * file: Driver_lab3.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 23, 2017
 * version: 1.0
 * 
 * This file contains the code for the Different Distance lab in Kattis.
 */

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    
    while (true) {
      //User enter first x value
      //System.out.println("Enter first x value: ");
      double xOne = input.nextDouble();
    
      if (xOne ==0.0 ) {
       break;
      }
      
      //User enter first y value
      //System.out.println("Enter first y value: ");
      double yOne = input.nextDouble();
    
      //User enter second x value
      //System.out.println("Enter Second x value: ");
      double xTwo = input.nextDouble();
    
      //User enter second y value
      //System.out.println("Enter Second y value: ");
      double yTwo = input.nextDouble();
    
      //Enter p value
      //System.out.println("Enter a p value: ");
      double p = input.nextDouble();
    
      //finding the distance
      double distance = Math.pow(Math.pow(Math.abs( xOne - xTwo ),p) + Math.pow(Math.abs( yOne - yTwo ),p),(1/p));
    
      //Printing the calculated distance with the correct number of decimal places
      System.out.printf("%.10f\n", distance); 
    }
  }
}