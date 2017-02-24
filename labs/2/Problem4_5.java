/**
 * file: Problem4_5.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code that displays the area of a polygon.
 */
   
import java.util.Scanner;  

public class Problem4_5 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user to enter information about length
    System.out.println("Enter a number of side wanted for a polygon: ");
    double sides = input.nextDouble();
    
    System.out.println("Enter a length for a polygon: ");
    double length = input.nextDouble();
    
    //calculates the area
    double area = ( sides * ( length * length ) ) / (4.0 * Math.tan(Math.PI/sides));
    
    System.out.println("The area of the polygon is: " + area);
  }
}