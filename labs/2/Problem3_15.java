/**
 * file: Problem3_15.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.0
 * 
 * This file contains the code lets a user play a lottery game.
 */
   
import java.util.Scanner;

public class Problem3_15 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    //Generate a 3 digit number 
    int lottery = (int)( 100 + Math.random() * ((999 - 100)+1));
    
    //First prompt 
    System.out.println( "Enter a three digit number to try to win a price: " );
    int userNum = input.nextInt();
    
    //get single numbers from the user's guess
    int firstUser = userNum / 100 %  10;
    int secondUser = userNum / 10 % 10;
    int thirdUser =  userNum  % 10;
    
    //get the single numbers form the lottery 
    int firstLottery= lottery / 100 % 10;
    int secondLottery = lottery / 10 % 10;
    int thirdLottery = lottery % 10;
    
    //Printing random number
    System.out.println("the random number is " + lottery);
    
    //setting variable to a 0 before it is reassigned.  
    int result = 0; 
    
    //if else statement.  need to convert to switch 
    if (firstLottery == firstUser &&  secondLottery == secondUser && thirdLottery==thirdUser){ 
      result = 3;
    }
    else if (firstUser == secondLottery && secondUser == thirdLottery && thirdUser == firstLottery ) {
      result = 2;
    }
    else if (firstUser == thirdLottery && secondUser == firstLottery && thirdUser == secondLottery ) {
      result = 2;
    }
    else if (firstUser == firstLottery && secondUser == thirdLottery && thirdUser == secondLottery ) {
      result = 2;
    }
    else if (firstUser == thirdLottery && secondUser == secondLottery && thirdUser == firstLottery ) {
      result = 2;
    }
    else if (firstUser == secondLottery && secondUser == firstLottery && thirdUser == thirdLottery ) {
      result = 2;
    }
    else if (firstUser == firstLottery || firstUser == secondLottery || firstUser == thirdLottery || 
             secondUser == firstLottery || secondUser == secondLottery || secondUser == thirdLottery ||
             thirdUser == firstLottery || thirdUser == secondLottery || thirdUser == thirdLottery ) {
      result = 1;
    } else {
      result = 0;
    }
    
    //Switch statements that print the results. 
    switch (result) {
      case 0: System.out.println(" No numbers match."); break;
      case 1: System.out.println("One Number match!  Award = $1,000"); break;
      case 2: System.out.println("All digits matched but wrong order! Award = $3,000"); break;
      case 3: System.out.println("You won the lottery! Award = $10,000"); break;
      default: System.out.println("No matching numbers");
        System.exit(1);
    } 
  }
}