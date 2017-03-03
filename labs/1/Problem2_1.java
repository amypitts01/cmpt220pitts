/**
 * file: Problem2_1.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 25, 2017
 * version: 1.0
 * 
 * This file contains the code converts temp from celsius to Fahrenheit.
 */
import java.util.Scanner;

public class Problem2_1 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //Prompt user to write celsius
    System.out.print("Enter a degree in celsius: ");
    double celsius = input.nextDouble();
    
    //calculations
    double fahrenheit = ((9 / 5 ) * celsius ) + 32 ;
    
    //display results
    System.out.println( celsius + " Celsius is " + fahrenheit + " Fahrenheit." );
  }
}