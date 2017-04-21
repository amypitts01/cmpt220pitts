/**
 * file: Problem4_25.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * date: April 20, 2017
 * version: 1.0
 * 
 * This file randomizes numbers
 */

import java.util.Scanner;

public class Problem4_25 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
     //Generates a 4 digit number 
    int numbers = (int)( 1000 + Math.random() * ((9999 - 1000)+1));
    
    //Generate a number from 0 to 25 to help with letters 
    int genNum1 = (int)( Math.random() * 25);
    int genNum2 = (int)( Math.random() * 25);
    int genNum3 = (int)( Math.random() * 25);
    
    
    //The  string with all the letters 
    String message = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    //Getting a letter from the string using generated numbers!!! 
    char firstLetter = message.charAt(genNum1);
    char secondLetter = message.charAt(genNum2);
    char thirdLetter = message.charAt(genNum3);
    
    
    System.out.println("This is your generated license plate number: " + firstLetter + secondLetter + thirdLetter + numbers);

  }
}