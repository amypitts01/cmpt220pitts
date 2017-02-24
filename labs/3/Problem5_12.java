/**
 * file: Problem5_12.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 23, 2017
 * version: 1.0
 * 
 * This file contains Find the smallest n such that n^2>12000 code that uses a while loop.
 */

public class Problem5_12 {
  public static void main(String[] arg) {
    
    //setting the variable equal to a random number 
    double n=50;
    //finding that number to the 2nd
    double i=Math.pow(n,2.0);
    
    //finding what number is the smallest 
    while (i>1200 && n>0) {
      n--;
      i=Math.pow(n,2.0);
    }
    n=n+1;
    //printing the results.
    System.out.println("the smallest n can be is : " + n+1);
  }  
}