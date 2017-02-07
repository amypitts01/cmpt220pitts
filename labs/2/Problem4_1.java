/* Amy Pitts
   2/4/15 */
import java.util.Scanner;  
/*Write a program that prompts the the user to enter the length from the center of a pentagon to a vertex 
and computes the are of the pentagon, ans shown in the figure on page 150 */

public class Problem4_1 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user to enter information about length
    System.out.println("Enter a number for the length from the center to a vertex: ");
    double length = input.nextDouble();
    
    //calculates a side 
    double side = 2.0 * length * ( Math.sin(Math.PI / 5.0 ) );
    
    //calculates the area
    double area = ( 5.0 * ( side * side ) ) / ( 4.0 * Math.tan(Math.PI/5.0) );
    
    double roundArea= Math.round(area * 100.0)/100.0;
    
    System.out.println("The area of the pentagon is: " + roundArea);
  
  }
}