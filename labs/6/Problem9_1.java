/**
 * file: Problem9_1.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: April 16, 2017
 * version: 1.0
 * 
 * This file contains the code that Revises selection sort from 7.11.
 */
 
import java.util.Scanner;

public class Problem9_1 {
  public static void main(String[] args) {
    //First Rectangle with width 4 and height 40
    Rectangle rectangle1 = new Rectangle(4, 40);
    //Second Rectangle with width 3.5 and height 35.9
    Rectangle rectangle2 = new Rectangle(3.5,35.9);
     
    //Printing the results of rectangle 1
    System.out.println("The width of rectangle 1 is: " + rectangle1.width); 
    System.out.println("The height of rectangle 1 is: " + rectangle1.height); 
    System.out.println("The area of rectangle 1 is: " + rectangle1.getArea());
    System.out.println("The perimeter of rectangle 1 is: " + rectangle1.getPerimeter());
    
    
    //Printing the results of rectangle 2
    System.out.println("The width of rectangle 2 is: " + rectangle2.width); 
    System.out.println("The height of rectangle 2 is: " + rectangle2.height); 
    System.out.println("The area of rectangle 2 is: " + rectangle2.getArea());
    System.out.println("The perimeter of rectangle 2 is: " + rectangle2.getPerimeter());
  }
}
 
 
