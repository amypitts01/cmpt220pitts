/**
 * file: ProjectOne.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: IHSA Calculator
 * date: March 17, 2017
 * version: 1.0
 * 
 * This file contains code that calculates points for IHSA horse show team.
 */
 
import java.util.Scanner;
import java.sql.*;

public class IhsaCalc {
  public static void main(String[] args) 
      throws SQLException, ClassNotFoundException {
    while(true) {
      //Load the JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver loaded");
    
      //Connect to the database
      Connection connection = DriverManager.getConnection
        ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
      System.out.println("Database connected");
    
      Scanner input = new Scanner(System.in);
    
      //initializing Variables 
      String fName;
      String lName;
      String cClass;
      int place;
      int points;
    
      //Beginning Question that determines further questioning. 
      System.out.println("If a new rider type 1. \nIf you want to update a rider's points type 2. \nIf you want delete a rider type 3. \nIf you want to view the database type 4. \nIf you want to stop enter 5.");
      int pathNum = input.nextInt();
    
      switch(pathNum) {
        case 1: //New Rider
          //First Name of Rider
          System.out.println("Enter First Name of Rider: ");
          fName = input.next();
    
          //Last Name of Rider
          System.out.println("Enter Last Name of Rider: ");
          lName = input.next();

          //Data for class
          System.out.println("Enter Rider's Showing Class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) ");
          cClass = input.next();

          //Data for Placement
          System.out.println("Enter Rider's Placement in number form. (ex/ Second places = 2): ");
          place = input.nextInt();

          //If new rider in a different class coming 
          System.out.println("Enter the amount of point that new rider is coming in with. If none enter 0: ");
          int yesData = input.nextInt();
      
          //calls on the pointsCalc method if needed
          points = pointsCalc(place);
      
          //Calculated total points rider is coming in with 
          int newRiderP = yesData + points;
      
          //Calling the method into action
          NewRider(fName, lName, cClass, newRiderP); 
      
          //prints the points
          System.out.println("The Number of points received from the show is: " + points);
          break;
        
        case 2: //Update riders total points
          //Last Name of Rider that is getting data changed
          System.out.println("Enter Last Name of Rider: ");
          lName = input.next();

          //Data for class of the rider that is getting data changed
          System.out.println("Enter Rider's Showing Class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) ");
          cClass = input.next();

          //Data for Placement of rider that is getting data changed
          System.out.println("Enter Rider's Placement in number form. (ex/ Second places = 2): ");
          place = input.nextInt();
      
          //calls on the pointsCalc method if needed
          points = pointsCalc(place);
      
          //Calling the method into action
          int tPoints = totalPoints(points, lName, cClass); 
          Update(tPoints, lName, cClass); 
      
          //prints the points
          System.out.println("The Number of points received from the show is: " + points);
          break;
        
        case 3: //Deletes rider
          //Last Name of Rider that is being deleted
          System.out.println("Enter Last Name of Rider that is being deleted: ");
          lName = input.next();
      
          //Data for class that is being deleted
          System.out.println("Enter Rider's Showing Class (ex/ WT, BWTC, AWTC, NFLAT, NFENCES, ..,:) that is being deleted:");
          cClass = input.next();
        
          //Invoking the method to delete
          DeleteRider(lName,cClass); 
          break;
        
        case 4: //Views the database
          //Ask for last name to use to look at database.
          System.out.println("Type in a last name of a rider or class that you would like to look at?");
          String random = input.next();
        
          System.out.println("This is the database for: " + random);
        
          //Invoke the method 
          ViewData(random);
        
          break;
        case 5: //Ends the while statement
         return;
         
        default: System.out.println("Error: invalid Status");
      }
    }
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
      ("SELECT points from MaristIHSA WHERE lastName = '" + last + "' and competitionClass = '" + c + "';");
    
    //Saving the current total point value in a variable  
    int ctotal = 0;
    if(totalP.next())
      ctotal = totalP.getInt(1);
    
    //new total points that needs to be entered into database.
    int tPoints = earned + ctotal;
    
    //Close the connection
    connection.close();
    
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
 * Return value: returns nothing 
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
      ("UPDATE MaristIHSA SET points = " + total + " WHERE lastName = '" + last + "' and competitionClass = '" + c + "';");
    riderUpdate.executeUpdate();
    
    //Close the connection
    connection.close();
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
    
    //Close the connection
    connection.close();
    
  }
/**
 * DeleteRider
 *
 * This deletes a rider from the database
 * 
 * Parameters:
 *   last name, competition class
 * 
 * Return value: nothing
 */
 public static void DeleteRider( String l, String c) 
   throws SQLException, ClassNotFoundException {
   
   //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    
    //Connect to database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
      
    PreparedStatement riderDelete = connection.prepareStatement
      ("DELETE FROM MaristIHSA WHERE lastName = '" + l + "' and competitionClass = '" + c + "';");
    riderDelete.executeUpdate();  
 
    //Close the connection
    connection.close();
 }
/**
 * ViewData
 *
 * This views all the data
 * 
 * Parameters:
 *   
 * 
 * Return value: nothing
 */
  public static void ViewData(String r) 
    throws SQLException, ClassNotFoundException { 
   
    //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    
    //Connect to database
    Connection connection = DriverManager.getConnection
      ("jdbc:mysql://localhost/javabook?useSSL=false" , "amy" , "IHSA");
    
    //Create a statement
    Statement statement = connection.createStatement();
     
    //Seeing if the input is a last name or a class
    if( r.equals("WT") || r.equals("BWTC") || r.equals("AWTC") || r.equals("NFLAT") || r.equals("NFENCES") || 
        r.equals("IFLAT") || r .equals("IFENCES") || r.equals("OFLAT") || r.equals("OFENCES") ) {
      ResultSet info = statement.executeQuery
        ("SELECT firstName, lastName, competitionClass, points from MaristIHSA WHERE competitionClass = '" + r + "';");
      
      //Printing the table  
      while(info.next()) {
        System.out.println(info.getString(1) + " " + info.getString(2) + " "  + info.getString(3) + " " + info.getInt(4));
      } 
    } else {
      ResultSet info = statement.executeQuery
        ("SELECT firstName, lastName, competitionClass, points from MaristIHSA WHERE lastName = '" + r + "';");
        
      //Printing the table  
      while(info.next()) {
        System.out.println(info.getString(1) + " " + info.getString(2) + " "  + info.getString(3) + " " + info.getInt(4));
      } 
    }
    //Close the connection
    connection.close(); 
  }
}