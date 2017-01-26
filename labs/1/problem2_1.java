import java.util.Scanner;

public class Problem2_1 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    //Prompt user to write celsius
    System.out.print("Enter a degree in celsius: ");
    double celsius = input.nextDouble();
    
    //calculations
    double fahrenheit = ((9 / 5 ) * celsius ) + 32 ;
    
    //display results
    System.out.println( celsius + " Celsius is " + fahrenheit + " Fahrenheit." );
  }
}