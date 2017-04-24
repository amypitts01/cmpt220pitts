/**
 * file: Problem10_2.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 7
 * date: April 18, 2017
 * version: 1.0
 * 
 * This file contains the code that the drive for the object BMI calc 
 */
import java.util.Scanner;

public class Problem10_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    //collecting all the info
    System.out.println("Please list your age: ");
    int age = input.nextInt();
    
    System.out.println("Please list your weight in pounds:");
    double weight = input.nextDouble(); //in pounds
    
    System.out.println("Please list how tall you are (just the feet part):");
    double feet = input.nextDouble();
    
    System.out.println("Please list height (the inches part)");
    double inches = input.nextDouble();
    
    //Using the gathered information to invoke the object 
    BMI bmi1 = new BMI( age, weight, feet, inches);
    System.out.println("The BMI for this person is that is age: " + bmi1.getAge() + " is " 
      + bmi1.getBMI() + " " + bmi1.getStatus());
    
  }
}
 
 
