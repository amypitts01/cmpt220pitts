/* Amy Pitts
   2/4/15 */
import java.util.Scanner;  
/*Find the character of an ASCII code) Write a program that receives an ASCII code 
(an integer between 0 and 127) and displays its character*/

public class Problem4_8 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user a number 
    System.out.println("Enter a value 1-127 to learn it's ASCII character: ");
    int value = input.nextInt();
    
    //converting int to a char
    char ch = (char) value;
    
    System.out.println("The value of " + value + " is the character of " + ch );
  }
}

