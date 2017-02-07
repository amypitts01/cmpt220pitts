/* Amy Pitts
   2/4/15 */
import java.util.Scanner;  
/* A regular polygon is an n-sided polygon in which all sides are of the 
same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
The formula for computing the area of a regular polygon is listed on page 151 */

public class Problem4_5 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //prompts the user to enter information about length
    System.out.println("Enter a number of side wanted for a polygon: ");
    double sides = input.nextDouble();
    
    System.out.println("Enter a length for a polygon: ");
    double length = input.nextDouble();
    
    //calculates the area
    double area = ( sides * ( length * length ) ) / (4.0 * Math.tan(Math.PI/sides));
    
    System.out.println("The area of the polygon is: " + area);
  }
}