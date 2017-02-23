//Amy Pitts
/*  5.12 (Find the smallest n such that n^2>12000) use a while loop to find the 
smallest integer n such that n^2 is less then 12000*/

public class Problem5_12 {
  public static void main(String[] arg) {
    
    //setting the variable equal to a random number 
    double n=50;
    //finding that number to the 2nd
    double i=Math.pow(n,2.0);
    
    //finding what number is the smallest 
    while (i>1200 && n>0) {
      n--;
      i=Math.pow(n,2.0);
    }
    n=n+1;
    //printing the results.
    System.out.println("the smallest n can be is : " + n+1);
  }  
}