import java.util.Scanner;

public class Problem2_6 {
 public static void main(String[] arg) {
   Scanner input = new Scanner(System.in);
   
   //enter a number
   System.out.println( "Enter an integer between 0-1000: " );
   int integer = input.nextInt();
   
   //extract the digits
   int sum = 0;
   sum = sum + integer % 10;
   integer = integer / 10;
   sum = sum + integer % 10;
   integer = integer / 10;
   sum = sum + integer % 10;
   
   //printing results
   System.out.println( "The integer: " + integer + " sum of all the digits is: " + sum );
 }
}