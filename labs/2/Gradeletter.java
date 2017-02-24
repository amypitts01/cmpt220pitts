/**
 * file: Gradeletter.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the grade calculator letter producer.
 */
 
import java.util.Scanner;

public class Gradeletter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //This is the imput for the for midterm grades
    System.out.println( "Input midterm exam grade:" );
    double midterm = input.nextDouble();
    
    //This is the input for the final grade
    System.out.println( "Input final exam grade:" );
    double finalgrade = input.nextDouble();
    
    //This is the input for projects
    System.out.println( "Input projects grade:" );
    double projects = input.nextDouble();
    
    //This is the input for the homework and labs 
    System.out.println( "Input homework and labs grade:" );
    double hwlab = input.nextDouble();
    
    double score = ( hwlab*.4 + projects*.2 + finalgrade*.2 + midterm*.2 );
    
    if (score >= 90.0) {
      System.out.println("Final Grade is A");
    }
    else if (score >= 80.0) {
      System.out.println("Final Grade is B");
    }
    else if (score >= 70.0) {
      System.out.println("Final Grade is C");
    }
    else if (score >= 60.0) {
      System.out.println("Final Grade is D");
    }
    else
      System.out.println("Final Grade is F");
  }
}