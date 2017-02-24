/**
 * file: Problem4_26.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 16, 2017
 * version: 1.0
 * 
 * This file contains the code rewrite listing 2.10 to fix the possible los of accuracy.
 */

import java.util.Scanner;

public class Problem4_26 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //Receive the amount
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.next();
    
    //getting the two numbers separated from each other at the .
    int space = amount.indexOf(".");
    String dollars = amount.substring(0,space);
    String cents = amount.substring(space + 1);
    
    //turning the string back into numbers 
    int wholeNumbers = Integer.parseInt(dollars);

    //turing the numbers after the decimal places into real numbers
    int decimalNumbers = Integer.parseInt(cents);
    
    //find how many quarters 
    

    //Find the number of quarters in the remaining amount
    int numberOfQuarters = decimalNumbers / 25;
    decimalNumbers = decimalNumbers % 25;
    
    //Find the number of dimes in the remaining amount
    int numberOfDimes = decimalNumbers / 10;
    decimalNumbers = decimalNumbers % 10;
    
    //Find the number of nickels in the remaining amount 
    int numberOfNickles = decimalNumbers / 5;
    decimalNumbers = decimalNumbers % 5;
    
    //Find the number of pennies 
    int numberOfPennies = decimalNumbers;
    
    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("     " +wholeNumbers + " dollars");
    System.out.println("     " +numberOfQuarters + " quarters");
    System.out.println("     " +numberOfDimes + " dimes");
    System.out.println("     " +numberOfNickles + " nickles");
    System.out.println("     " +numberOfPennies + " pennies");
    

  }
}