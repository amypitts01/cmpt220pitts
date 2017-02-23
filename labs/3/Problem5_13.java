//Amy Pitts 
/*(find the largest n such that n^3 <12000) 
Use a while loop to find the largest integer n such that n^3 is less than 12000.*/

public class Problem5_13 {
  public static void main(String[] arg) {
    
    //setting the variables equal a random number 
    double n=50;
    //Finding the n to the 3rd
    double i=Math.pow(n,3.0);
    
    //figuring out what number is the smallest 
    System.out.println("this is i " +i);
    while (i>1200 && n>0) {
      n--;
      i=Math.pow(n,3.0);
    }
    n=n+1;
    //printing the results
    System.out.println("the smallest n can be is : " + n);
  }  
}