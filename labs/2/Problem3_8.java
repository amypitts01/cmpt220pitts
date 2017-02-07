/* Amy Pitts
   2/4/15 */
   
import java.util.Scanner;
/*write a program that prompts the user to enter three integers and 
display the integers in non-decreasing order. */

public class Problem3_8 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //First prompt 
    System.out.println( "Enter an integer: " );
    int first = input.nextInt();
    
    //Second prompt
    System.out.println( "Enter a second integer: ");
    int second = input.nextInt();
    
    //Third prompt
    System.out.println( "Enter one more integer: ");
    int third = input.nextInt(); 
    
    //Put the numbers in the correct order using if else statements. There are six different possibilities   
    if (first >= second && second >= third ) {
      System.out.println( "The order is: " + third + ", " + second + ", " +  first);
    } else if (third >= first && first >= second ) {
      System.out.println( "The order is: " + second + ", " + first + ", " + third);
    } else if (first >= third && third >= second ) {
      System.out.println( "The order is: " + second + ", " + third + ", " + first );
    } else if (third >= second && second >= first) {
      System.out.println( "The order is: " + first + ", " + second + ", " + third );
    } else if ( second >= third && third >= first) {
      System.out.println( "The order is: " + first + ", " + third + ", " + second);
    } else if ( second >= first && first >= third ) {
      System.out.println( "The order is: " + third + ", " + first + ", " + second);
    } else {
      System.out.println( "Please enter numbers");
    }
    
  }
}