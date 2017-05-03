/**
 * file: Rectangle.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 6
 * date: April 16, 2017
 * version: 1.0
 * 
 * This file contains the code that is the object rectangle.
 */
 
class Rectangle {

  //The default width
  double width = 1.0;
  
  //The default height
  double height = 1.0;

  //The default Constructor
  Rectangle() {
  
  }
  
  //A Constructor that creates a rectangle with a specific hight and width
  Rectangle(double w, double h) {
    width = w;
    height = h;
  }
  
  //Method that returns the area of rectangle
  double getArea() {
    return height * width;
  }
  
  //Method that returns the perimeter of a rectangle
  double getPerimeter() {
    return (2 * height) + (2 * width);
  }
  
}