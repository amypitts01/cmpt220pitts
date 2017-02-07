/* Amy Pitts
   2/4/15 */
import java.util.Scanner;
/* Find the number of days in a month */
/* Write a program that prompts the user to enter the month and year display 
 the number of days in the month.   ex/ user enters month 2 year 2012 the program
 should display february 2012 had 29 days.*/

public class Problem3_11 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //First prompt 
    System.out.println( "Enter a month's number: " );
    int month = input.nextInt();
    
    System.out.println( "Enter a year: ");
    int year = input.nextInt();
    
    switch (month) {
      case 1: System.out.println("the month January has 31 days in the year " + year);
        break;
      case 2: 
        if (year % 4 == 0 ) {
          System.out.println("the month February has 29 days in the year " + year);
        } 
        else {
          System.out.println("the month February has 28 days in the year " + year);
        }
        break;
      case 3: System.out.println("the month March has 31 days in the year " + year);
        break;
      case 4: System.out.println("the month April has 30 days in the year " + year);
        break;
      case 5: System.out.println("the month May has 31 days in the year " + year);
        break;
      case 6: System.out.println("the month June has 30 days in the year " + year);
        break;
      case 7: System.out.println("the month July has 31 days in the year " + year);
        break;
      case 8: System.out.println("the month August has 31 days in the year " + year);
        break;
      case 9: System.out.println("the month September has 30 days in the year " + year);
        break;
      case 10: System.out.println("the month October has 31 days in the year " + year);
        break;
      case 11: System.out.println("the month November has 30 days in the year " + year);
        break;
      case 12: System.out.println("the month December has 31 days in the year " + year);
        break;
      default: System.out.println("Error: invalid status");
        System.exit(1);
    } 
  }
}