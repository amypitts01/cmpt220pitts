/**
 * file: Problem4_8.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code that displays a the character of an ASCII code from the corresponding integer.
 */
   
import java.util.Scanner;  

public class Problem4_8 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user a number 
    System.out.println("Enter a value 1-127 to learn it's ASCII character: ");
    int value = input.nextInt();
    
    //converting int to a char
    char ch = (char) value;
    
    System.out.println("The value of " + value + " is the character of " + ch );
  }
}

