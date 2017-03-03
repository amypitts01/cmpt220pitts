/**
 * file: Problem6_20.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 4
 * date: March 2, 2017
 * version: 1.0
 * 
 * This file contains code that Count the letters in a string  
 */
 
import java.util.Scanner;

public class Problem6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    String s = input.next();
    
    //Prints the results and calls the method.
    System.out.println("The length of the string is: " + countLetters(s) );
    
    
  }
/**
* countLetters
*
* This counts the number of letters in a string
* 
* Parameters:
*   the number which is returned
* 
* Return value: the length of the string
*/  
  public static int countLetters(String s) {
    int length = s.length();
    
    return length;
  }
}