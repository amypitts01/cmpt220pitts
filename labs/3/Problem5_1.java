//Amy Pitts
/* 5.1 Count positive and negative numbers and compute the average of numbers. 
Write a program that reads an unspecified number of integers, determines how many positive and negative 
values have been read, and computes the total and average of the input values (not counting zero). 
Your program ends with the input 0.  Display the average as a floating-point number. 
(use do-while loop)*/
import java.util.Scanner;

public class Problem5_1 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //Receive the amount
    System.out.print("Enter an integer, the input ends if it is 0: ");
    double number = input.nextDouble();
    
    //setting all the variables equal to 0
    double increaseP = 0;
    double increaseN = 0;
    double sum = 0;
    double average = 0;
    double total = 0;
      
    //start of the do statement    
    do {
      //Calculates the total sum of all the numbers entered
      sum += number;
      
      //telling if the number is positive or negative 
      if (number > 0 ) {
        increaseP++;
        
        System.out.print("Enter an integer, the input ends if it is 0: ");
        number = input.nextDouble();

      }
      else if (number < 0) {
        increaseN++;
        
        System.out.print("Enter an integer, the input ends if it is 0: ");
        number = input.nextDouble();
        
      }  
      
      //Calculates the average from the sum and the total number of entries 
      average = sum / (increaseP + increaseN); 
      
      //calculate total entries 
      total = increaseP + increaseN;
    } while (number != 0);

    
    //prints the number of positive numbers 
    System.out.printf("The number of positive integers is:%.0f\n ", increaseP);
      
    //Prints the number of negative numbers
    System.out.printf("The number of negative integers is: %.0f\n ", increaseN);
      
    //Prints the total number of integers 
    System.out.printf("The total number of integers is: %.1f\n", total);
      
    //Prints the average numbers 
    System.out.printf("The average of the numbers is: %.2f\n", average);
  }
}