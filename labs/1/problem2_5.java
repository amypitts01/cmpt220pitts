import java.util.Scanner;

public class Problem2_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // enter the subtotal
    System.out.println( "Enter subtotal: $" );
    double subtotal = input.nextDouble();
    
    // enter the gratuity rate
    System.out.println( "Enter gratuity rate: " );
    double gratuity = input.nextDouble();
    
    //calculating the total
    double total = ( subtotal * (gratuity/100) ) + subtotal;
    
    //reporting total
    System.out.println( "With a gratuity of: " + gratuity + " the total is : $" + total ); 
  }
}