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