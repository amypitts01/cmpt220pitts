/**
 * file: Location.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 5
 * date: April 18, 2017
 * version: 1.0
 * 
 * This file contains the code that is the object for location finding.
 */
 
public class Location {

  //The default row 
  int rows; 
  
  //The default column
  int columns;
  
  //The default max value 
  double maxValue;
  
  //The default Constructor
  Location() {
  
  }
  
  //A Constructor that finds the max video
  Location(double[][] a) {
    //initializing columns to 0
    columns = 0; 
    //initializing rows to 0
    rows = 0; 
    //initializing maxValue to 0
    maxValue = a[0][0];
    
    //Finding the largest Value in the array
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++ ) {
        if (a[i][j] > maxValue) {
          maxValue = a[i][j];
          //Reassigning the rows where the largest value is 
          rows = i;
          //Reassigning the columns where the largest value is 
          columns = j;
        }
      }
    }
  }
}