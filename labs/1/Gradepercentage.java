import java.util.Scanner;

public class Gradepercentage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println( "Input midterm exam grade:" );
    double midterm = input.nextDouble();
    
    System.out.println( "Input final exam grade:" );
    double finalgrade = input.nextDouble();
    
    System.out.println( "Input projects grade:" );
    double projects = input.nextDouble();
    
    System.out.println( "Input homework and labs grade:" );
    double hwlab = input.nextDouble();
    
    double calculations = ( hwlab*.4 + projects*.2 + finalgrade*.2 + midterm*.2 );
    
    System.out.println( "Your final grade is: " + calculations + "%" );
  }
}