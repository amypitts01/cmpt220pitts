/**
 * file: Problem3_4.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code that generates an integer between 1and 12 and prints the corresponding month.
 */

public class Problem3_4 {
  public static void main(String[] arg) {
    //Generate a random number between 1-12
    int genNumber = (int)(1 + Math.random() * 13);
   
    //get the computer to say a month based of the random number
    if (genNumber == 1) {
      System.out.println("The Random generator says the month is January");
    }
    if (genNumber == 2) {
      System.out.println("The Random generator says the month is February");
    }
    if (genNumber == 3) {
      System.out.println("The Random generator says the month is March");
    }
    if (genNumber == 4) {
      System.out.println("The Random generator says the month is April");
    }
    if (genNumber == 5) {
      System.out.println("The Random generator says the month is May");
    }
    if (genNumber == 6) {
      System.out.println("The Random generator says the month is June");
    }
    if (genNumber == 7) {
      System.out.println("The Random generator says the month is July");
    }
    if (genNumber == 8) {
      System.out.println("The Random generator says the month is August");
    }
    if (genNumber == 9) {
      System.out.println("The Random generator says the month is September");
    }
    if (genNumber == 10) {
      System.out.println("The Random generator says the month is October");
    }
    if (genNumber == 11) {
      System.out.println("The Random generator says the month is November");
    }
    if (genNumber == 12) {
      System.out.println("The Random generator says the month is December");
    }
  }
}