/**
 * file: Problem4_1.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code that calculates area of the pentagon.
 */
   
import java.util.Scanner;  

public class Problem4_1 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user to enter information about length
    System.out.println("Enter a number for the length from the center to a vertex: ");
    double length = input.nextDouble();
    
    //calculates a side 
    double side = 2.0 * length * ( Math.sin(Math.PI / 5.0 ) );
    
    //calculates the area
    double area = ( 5.0 * ( side * side ) ) / ( 4.0 * Math.tan(Math.PI/5.0) );
    
    double roundArea= Math.round(area * 100.0)/100.0;
    
    System.out.println("The area of the pentagon is: " + roundArea);
  
  }
}