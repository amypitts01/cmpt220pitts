/**
 * file: Problem5_7.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 23, 2017
 * version: 1.0
 * 
 * This file contains the financial application: compute future tuition code using a for loop.
 */

public class Problem5_7 {
  public static void main(String[] arg) {

    //Computing the tuition in ten years. 
    double tuition = 10000;
    double tuitionFour = 0;
    for (double years =0 ; years <= 14 ; years++  ) {
      tuition = tuition * 1.05; 
      for (years=10 ; years <=14 ; years++ ) {
        tuitionFour=tuition + tuitionFour;
      }
    } 
    System.out.printf("The tutition for 4 years in 10 years will be : $%.2f \n", tuitionFour );
  }
}