/**
 * file: Problem4_15.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 16, 2017
 * version: 1.0
 * 
 * This file contains the code that prompts the user to enter a letter and displays its corresponding number.
 */

import java.util.Scanner;

public class Problem4_15 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //Prompts user to enter in a letter
    System.out.println("Type a number to see its corresponding number");
    String userL = input.next();
    
    //Defining variables
    String two = "a";
    String twotwo = "b";
    String twotwotwo = "c";
    String three = "d"; 
    String threethree = "e";
    String threethreethree = "f";
    String four = "g" ;
    String fourfour = "h" ;
    String fourfourfour = "i";
    String five = "j";
    String fivefive = "k";
    String fivefivefive = "l";
    String six = "m"; 
    String sixsix = "n";
    String sixsixsix = "o";
    String seven = "p";
    String sevenseven = "q";
    String sevensevenseven = "r";
    String sevensevensevenseven = "s";
    String eight = "t";
    String eighteight =  "u";
    String eighteighteight =  "v";
    String nine = "w";
    String ninenine = "x";
    String nineninenine = "y";
    String ninenineninenine = "z";
  
    //Figuring out what number goes to what letter
    if ( two.equalsIgnoreCase(userL) || twotwo.equalsIgnoreCase(userL) || twotwotwo.equalsIgnoreCase(userL) ) {
      System.out.println("The letter: " + userL + " is under the number two");
    }
  
    if ( three.equalsIgnoreCase(userL) || threethree.equalsIgnoreCase(userL) || threethreethree.equalsIgnoreCase(userL)) {
      System.out.println("The letter: " + userL + " is under the number three");
    }
    
    if ( four.equalsIgnoreCase(userL) || fourfour.equalsIgnoreCase(userL) || fourfourfour.equalsIgnoreCase(userL)) {
      System.out.println("The letter: " + userL + " is under the number four");
    }
    
    if ( five.equalsIgnoreCase(userL) || fivefive.equalsIgnoreCase(userL) || fivefivefive.equalsIgnoreCase(userL) ) {
      System.out.println("The letter: " + userL + " is under the number five");
    }
    
    if ( six.equalsIgnoreCase(userL) || sixsix.equalsIgnoreCase(userL) || sixsixsix.equalsIgnoreCase(userL) ) {
      System.out.println("The letter: " + userL + " is under the number six");
    }
    
    if ( seven.equalsIgnoreCase(userL) || sevenseven.equalsIgnoreCase(userL) || sevensevenseven.equalsIgnoreCase(userL) || sevensevensevenseven.equalsIgnoreCase(userL) ) {
      System.out.println("The letter: " + userL + " is under the number seven");
    }
    
    if ( eight.equalsIgnoreCase(userL) || eighteight.equalsIgnoreCase(userL) || eighteighteight.equalsIgnoreCase(userL)) {
      System.out.println("The letter: " + userL + " is under the number eight");
    }
    
    if ( nine.equalsIgnoreCase(userL) || ninenine.equalsIgnoreCase(userL) || nineninenine.equalsIgnoreCase(userL) || ninenineninenine.equalsIgnoreCase(userL) ) {
      System.out.println("The letter: " + userL + " is under the number nine");
    } 
    else {
      System.out.println("Please write a single letter");
    }
  }
}