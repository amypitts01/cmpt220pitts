/**
 * file: ProjectOne.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: IHSA Calculator
 * date: March 17, 2017
 * version: 1.0
 * 
 * This file contains code that calculates points for IHSA horse show team
 */
 
import java.util.Scanner;
import java.sql.*;

public class IhsaCalc {
  public static void main(String[] args) 
      throws SQLException, ClassNotFoundException {
    //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");
    
    //Connect to the database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
    System.out.println("Database connected");
    
    Scanner input = new Scanner(System.in); 
    
    //First Name of Rider
    System.out.println("1) Enter First Name of Rider: ");
    String fName = input.next();
    
    //Last Name of Rider
    System.out.println("2) Enter Last Name of Rider: ");
    String lName = input.next();

    //Data for class
    System.out.println("3) Enter Riders Showing Class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) ");
    String cClass = input.next();

    //Data for Placement
    System.out.println("4) Enter Riders Placement in number form. (ex/ Second places = 2): ");
    int place = input.nextInt();
    
    //Is this a new rider or a rider in a different class info
    System.out.println("5) Please yes if this is a new rider/ rider in a new class or no for the opposite : ");
    String yesOrNo = input.next();
    
    //If new rider in a different class coming 
    System.out.println("6) If answer above is yes enter in amount of point that new rider is coming in with. If no enter 0: ");
    int yesData = input.nextInt();
    
    //calls on the pointsCalc method
    int points = pointsCalc(place);
    
    //if answer to 5th question yes adding points  might need to cast to a string
    int newRiderP = yesData + points;
    
    //checking to see if the rider and class is already entered into data base
    if(yesOrNo == "yes" ) {
      NewRider(fName, lName, cClass, newRiderP);   
    } 
    else {
      int tPoints = totalPoints(points, lName, cClass); 
      Update(tPoints, lName, cClass); 
    }
    
    //prints the points
    System.out.println("The Number of points received from the show is: " + points);
  }
/**
 * Point Calculator
 *
 * This calculates the points received from the awarded ribbin
 * 
 * Parameters:
 *   the place
 * 
 * Return value: returns the points
 */
  public static int pointsCalc(int num) {
    int points;
    switch (num) {
      case 1: points=7; break;
      case 2: points=5; break;
      case 3: points=4; break;
      case 4: points=3; break;
      case 5: points=2; break;
      case 6: points=1; break;
      default: points=0; 
    }   
    return points;
  }
/**
 * Total Point Calculator 
 *
 * This calculates the total points a rider has 
 * 
 * Parameters:
 *   the points earned, last name, competition class
 * 
 * Return value: returns the points
 */
  public static int totalPoints(int earned, String last, String c)
    throws SQLException, ClassNotFoundException {
    
     //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    
    //Connect to database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
      
    //Create a statment 
    Statement statement = connection.createStatement();
    
    //Gets information from the table
    ResultSet totalP = statement.executeQuery
      ("SELECT points from MaristIHSA WHERE lastName = '" + last + "', competitionClass = '" + c + "';");
    
    //Saving the current total point value in a variable  
    int ctotal = 0;
    if(totalP.next())
      ctotal = totalP.getInt(1);
    
    //new total points that needs to be entered into database.
    int tPoints = earned + ctotal;

    
    return tPoints;  
  }
/**
 * Updates
 *
 * This updates the number of points a rider has
 * 
 * Parameters:
 *   the points, last name, competition class
 * 
 * Return value: returns the points
 */
  public static void Update(int total, String last, String c) 
    throws SQLException, ClassNotFoundException {
    
     //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    
    //Connect to database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
      
    //Changes the riders total points 
    PreparedStatement riderUpdate = connection.prepareStatement
      ("UPDATE MaristIHSA, SET points = " + total + "where lastName = '" + last + "' and competitionClass = '" + c + "';");
    riderUpdate.executeUpdate();
  }
/**
 * NewRider
 *
 * This updates the number of points a rider has
 * 
 * Parameters:
 *   the points, last name, competition class
 * 
 * Return value: returns the points
 */
 public static void NewRider(String first, String last, String c, int p) 
    throws SQLException, ClassNotFoundException {
    
     //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    
    //Connect to database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
    
    //Enters riders information 
    PreparedStatement newRiderInsert = connection.prepareStatement
        ("INSERT INTO MaristIHSA (firstName, lastName, competitionClass, points) values('" + first + "','" + last + "','" + c + "'," + p + ");"); 
    newRiderInsert.executeUpdate();  
    
  }
}