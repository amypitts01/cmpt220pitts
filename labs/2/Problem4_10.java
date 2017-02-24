/**
 * file: Problem4_10.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code is a rewritten version of Listing 4.3 that has users enter characters.
 */
   
import java.util.Scanner;  

public class Problem4_10 {
  public static void main(String[] arg) {
    
    String set1 =
      " 1  3  5  7\n" +
      " 9 11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";
      
    String set2 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";
    
    String set3 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";
    
    String set4 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
      
    String set5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
      
    int day = 0;
    
    Scanner input = new Scanner(System.in);
    
    //Set 1 
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter No or Yes: ");
    String answer = input.next();
    
    String yes = "Yes";
    if ( yes.equalsIgnoreCase(answer) ) {
      day += 1; 
    }
    
    //Set 2
    System.out.print("Is your birthday in Set2?\n");
    System.out.print(set2);
    System.out.print("\nEnter No or Yes: ");
    answer = input.next();
    
    if ( yes.equalsIgnoreCase(answer) ) {
      day += 2; 
    }
    
    //Set 3
    System.out.print("Is your birthday in Set3?\n");
    System.out.print(set3);
    System.out.print("\nEnter No or Yes: ");
    answer = input.next();
    
    if ( yes.equalsIgnoreCase(answer) ) {
      day += 4; 
    }
    
    //Set 4
    System.out.print("Is your birthday in Set4?\n");
    System.out.print(set4);
    System.out.print("\nEnter No or Yes: ");
    answer = input.next();
    
    if ( yes.equalsIgnoreCase(answer) ) {
      day += 8; 
    }
    
    //Set 5
    System.out.print("Is your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter No or Yes: ");
    answer = input.next();
    
    if ( yes.equalsIgnoreCase(answer) ) {
      day += 16; 
    }
    
    System.out.println("\nYour birthday is " + day + "!");
  }
}