/**
 * file: Problem5_13.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 23, 2017
 * version: 1.0
 * 
 * This file contains the (find the largest n such that n^3 <12000) code using a while loop.
 */

public class Problem5_13 {
  public static void main(String[] arg) {
    
    //setting the variables equal a random number 
    double n=50;
    //Finding the n to the 3rd
    double i=Math.pow(n,3.0);
    
    //figuring out what number is the smallest 
    System.out.println("this is i " +i);
    while (i>1200 && n>0) {
      n--;
      i=Math.pow(n,3.0);
    }
    n=n+1;
    //printing the results
    System.out.println("the smallest n can be is : " + n);
  }  
}