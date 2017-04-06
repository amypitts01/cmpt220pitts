/**
 * file: DataBaseP.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: April 1, 2017
 * version: 1.0
 * 
 * This file contains the code that is going to help me practice databases.
 */
 
import java.util.Scanner;
import java.sql.*;

public class DataBaseP {
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
    
    //Create a statement
    Statement statement = connection.createStatement();
    
    //Adding info to the table
    PreparedStatement preparedStatement = connection.prepareStatement
      ("INSERT INTO MaristIHSA (firstName, lastName, competitionClass, points) values( 'Amy', 'Pitts', 'AWTC', 25);"); 

    //Gets information from the table
    preparedStatement.executeUpdate();
      //("SELECT lastName, competitionClass, points from MaristIHSA where lastName = Pitts, competitionClass = AWTC");
    
   ResultSet info = statement.executeQuery
     ("SELECT lastName, competitionClass, points from MaristIHSA");
    
    
    while(info.next())
      System.out.println(info.getString(1) + "\t" );
    
    //Close the connection
    connection.close();
  }
}
  
