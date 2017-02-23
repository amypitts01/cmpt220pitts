//Amy Pitts
/* 5.7 (financial application: compute future tuition) 
Suppose that the tuition for a university is $10000 this year and increases 5% every year. 
In one year, the tuition will be $10500. Write a program that computes the tuition in ten years
 and total cost of four years' worth of tuition after the tenth year. (use a for loop)*/

public class Problem5_7 {
  public static void main(String[] arg) {

    //Computing the tuition in ten years. 
    double tuition = 10000;
    double tuitionFour = 0;
    for (double years =0 ; years <= 14 ; years++  ) {
      tuition = tuition * 1.05; 
      for (years=10 ; years <=14 ; years++ ) {
        tuitionFour=tuition + tuitionFour;
      }
    } 
    System.out.printf("The tutition for 4 years in 10 years will be : $%.2f \n", tuitionFour );
  }
}