/**
 * file: ProjectOne.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: IHSA Calculator
 * date: March 17, 2017
 * version: 1.0
 * 
 * This file contains code that calculates points for IHSA horse show team
 */
 
import java.util.Scanner;

public class IhsaCalc {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    //Date of show
    System.out.println("Please enter the date of the show: ");
    String date = input.next();
    
    //First Name of Rider
    System.out.println("Enter First Name of Rider: ");
    String fName = input.next();
    
    //Last Name of Rider
    System.out.println("Enter Last Name of Rider: ");
    String lName = input.next();

    //Data for class
    System.out.println("Enter Riders Showing Class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) ");
    //Collects Data for class
    String cClass = input.next();
    
    /*This is wrong*/
    //Making sure that the input is correct for class
    if("WT"!=cClass || "BWTC"!=cClass || "AWTC"!=cClass || "NFLAT"!=cClass || "NFENCES"!=cClass 
        || "IFLAT"!=cClass || "IFENCES"!=cClass || "OFLAT"!=cClass || "OFENCES"!=cClass) {
      System.out.println("Please correct notation for class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) ");
    }
   
    
    //Data for Placement
    System.out.println("Enter Riders Placement in number form. (ex/ Second places = 2): ");
    int place = input.nextInt(); //Collects the correct data

    //calls on the pointCalc method
    int points = pointsCalc(place);
    
    //prints the points
    System.out.println("The Number of points received from the show is: " + points);
  }
/**
* Point Calculator
*
* This calculates the points received from the awarded ribbin
* 
* Parameters:
*   the place
* 
* Return value: returns the points
*/
  public static int pointsCalc(int num) {
    int points;
    switch (num) {
      case 1: points=7; break;
      case 2: points=5; break;
      case 3: points=4; break;
      case 4: points=3; break;
      case 5: points=2; break;
      case 6: points=1; break;
      default: points=0; 
    }   
    return points;
  }
}
//another method for total point calc 
