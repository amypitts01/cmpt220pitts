//Amy Pitts 
//(Sum the digits in an integer) 
/* Write a method that computes the sum of the digits in an integer.  User the following header
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2+3+4) 
hint: use the % operator to extract digits, and the / operator to remove the extracted digit.  
Use a loop to repeatedly extra and remove the digit until all the digits are extracted. 
 Write a test program that prompts the user to enter an integer and displays the sum of all the digits. */

import java.util.Scanner;

public class Problem6_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    //Prompts the user to enter a number
    System.out.println("Print a integer to so that the integers digit's can be added: "); 
    //Collecting data
    long n =input.nextLong();
    
    //calling the method and changing int to long
    int sum = sumDigits(n);
    
    //outputting the results
    System.out.println("The sum of the integer " + n + " is " + Math.abs(sum));
  }
  
  //The new method. 
  public static int sumDigits(long n) {

    int number = (int) n;
    int sum = 0; 
    int digit = 0; 
    
    //Creating a loop that test removes the numbers and adds them together
    while(number!=0) {
      //gets the digit by itself
      digit = number % 10;
      //adds that digit to the accumulating sum
      sum +=digit;
      //removes the digit from the number and replaces the number 
      number = number / 10;
    }
    return sum;
  }
}

 