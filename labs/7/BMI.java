/**
 * file: BMI.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 7
 * date: April 19, 2017
 * version: 1.0
 * 
 * This file contains the code that is the object for the BMI calc.
 */
 
 public class BMI {
  //initializing variables
  private int age;
  private double weight;  //in pounds
  private double feet;
  private double inches;
  
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
  
 
  //first Constructor 
  BMI() {
   
  }
  
  //Given modified constructor
  public BMI(int age, double weight, double feet, double inches) {
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
  }
  
  //Constructor  
  public BMI(double weight, double feet, double inches) {
    this(20, weight, feet, inches);
  }
  
  //The getBMI constructor
  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND / 
      (((inches + (feet * 12 )) * METERS_PER_INCH) * ((inches + (feet * 12 )) * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  
  //The getStatus constructor tells the person what there BMI means
  public String getStatus() {
    double bmi = getBMI();
    if(bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else 
      return "Obese";
  }
  
  public int getAge() {
    return age;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public double getFeet() {
    return feet;
  }
  
  public double getInches() {
    return inches;
  }
}