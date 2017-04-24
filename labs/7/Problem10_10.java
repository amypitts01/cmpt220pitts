/**
 * file: Problem10_10.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 7
 * date: April 23, 2017
 * version: 1.0
 * 
 * This file runs the Queue object
 */
public class Problem10_10 {
  public static void main(String[] args) {
    Queue queue = new Queue();
    
    for (int i = 0; i < 20; i++) {
      queue.enqueue(i);
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.println(queue.dequeue());
      if ((i+1) % 5 == 0 ) System.out.println(" " );
    }
  }
}