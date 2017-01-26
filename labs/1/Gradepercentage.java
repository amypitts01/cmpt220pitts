import java.util.Scanner;

public class Gradepercentage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //This is the imput for the for midterm grades
    System.out.println( "Input midterm exam grade:" );
    double midterm = input.nextDouble();
    
    //This is the input for the final grade
    System.out.println( "Input final exam grade:" );
    double finalgrade = input.nextDouble();
    
    //This is the input for projects
    System.out.println( "Input projects grade:" );
    double projects = input.nextDouble();
    
    //This is the input for the homework and labs 
    System.out.println( "Input homework and labs grade:" );
    double hwlab = input.nextDouble();
    
    double calculations = ( hwlab*.4 + projects*.2 + finalgrade*.2 + midterm*.2 );
    
    System.out.println( "Your final grade is: " + calculations + "%" );
  }
}