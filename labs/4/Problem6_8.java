/**
 * file: Problem6_8.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 4
 * date: March 1, 2017
 * version: 1.0
 * 
 * This file contains code that converts between Celsius and Fahrenheit. 
 */
 
import java.util.Scanner;

public class Problem6_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //These are the values the table in the books start with. 
    double celsiusFirst = 40.0;
    double fahrenheitSecond = 120.0;
    
    System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius   ");
    System.out.println("__________________________________________________________");
    
    for (int first=0 ; first < 10 ; first++) {

      System.out.printf("%.1f        %5.1f          |     ", celsiusFirst, celsiusToFahrenheit(celsiusFirst)); 
      celsiusFirst = celsiusFirst - 1;
      
      //The book needs two digits for the last value of the column of the table.
      System.out.printf("%5.1f         %5.2f\n", fahrenheitSecond, fahrenheitToCelsius(fahrenheitSecond));
      fahrenheitSecond = fahrenheitSecond - 10;
    }
    
  }
  //Convert from celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    
    double fahrenheitFirst = (9.0/5) * celsius + 32;
      
    return fahrenheitFirst;
  }
  //Convert from Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
    
    double celsiusSecond = (5.0/9) * (fahrenheit - 32);
      
    return celsiusSecond;
  }
  
}