/**
 * file: SquareNumbers.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 7
 * date: April 19, 2017
 * version: 1.0
 * 
 * This file finds the first ten square numbers that are greater than a value
 */
 import java.math.BigDecimal;
 
 public class SquareNumbers {
   public static void main(String[] args ) {
   
   //The longest Long can be is 9223372036854775807
   
    BigDecimal bigLong = new BigDecimal(Long.MAX_VALUE);
    //This takes the square root of the value 
    long squareRootL = (long) Math.sqrt(Long.MAX_VALUE);
    //Put it back into a bigDecimal
    BigDecimal i = new BigDecimal(squareRootL);
    
    //Initializing the count 
    int num = 0;
    
    //while loop that make sure the num stays under ten
    while ( num < 10 ) {
      //Squaring the number found above
      BigDecimal sqrt = i.multiply(i);
      //the if loop that makes sure the number is bigger then 0.  need to use the compare 
      //because they are objects
      if ( sqrt.compareTo(bigLong) > 0 ) {
        //increases the count
        num++;
        //Prints the results
        System.out.println(num + " is: " + sqrt);
      } 
      //Adding the big decimal constant one to the number found above
      i = i.add(BigDecimal.ONE);
    }
  } 
}