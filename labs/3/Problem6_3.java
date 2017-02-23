//Amy Pitts 
//(Palindrome integer) 
/* Write the methods with the following headers

//Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

//Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome if its reverssal is the same as itself. 
Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.  */

import java.util.Scanner;

public class Problem6_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Prompts the user 
    System.out.println("Type a number to see if its a palindrome: ");
    int number = input.nextInt();
    
    //implementing the method
    int reverseNum = reverse(number);
    
    //implementing other method
    boolean palindrome = isPalindrome(number);
    
    //outputting the results when true
    if (palindrome==true) {
      System.out.println("The number " + number + " is a Palindrome ");
    }
    else {
      //outputting the results when false
      System.out.println("The number " + number + " is not a Palindrome ");
    }
  }


  //Return the reversal of an integer, i.e., reverse(456) returns 654
  public static int reverse(int number) {  
    int reverseNum =0;
    while (number != 0) {
      //getting the digits alone 
      int digit = number % 10;
      
      reverseNum = reverseNum * 10 + digit;  
      
      //taking the last digit off
      number = number / 10;
      
    }
    return reverseNum;
  }
  //Return true if number is a palindrome
  public static boolean isPalindrome(int number) {
    if (number == reverse(number))
      return true; 
    else
      return false; 
  }
}