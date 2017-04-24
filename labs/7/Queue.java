/**
 * file: Queue.java
 * author: Amy Pitts
 * course: CMPT 220
 * assignment: lab 7
 * date: April 23, 2017
 * version: 1.0
 * 
 * This file contains stores integers 
 */
 import java.util.Arrays;
 
 public class Queue {
  //initializing variables
  private int[] elements; //stores the int values in the queue
  private int size; //stores the number of elements in the queue
  private int capacity; //the default capacity 
  
  //constructor that creates a Queue object with default capacity 8
  public Queue() {
    this(8);   
  }
  
  //constructer that had a specific max capacity
  public Queue(int capacity) {
    this.capacity = capacity;
    elements = new int[capacity];
  }
  
  //this adds a value in the queue
  public void enqueue(int value) {
    if(size >= elements.length) {
      int[] temp = new int[size * 2];
      System.arraycopy(elements, 0, temp, 0, size);
      elements = temp;
    }
    elements[size++] = value;
  }
  
  //This dequeues the queue
  public int dequeue() {
    int x = elements[0];
    size--;
    for (int i =0; i < size; i++) {
      elements[i] = elements[i + 1];
    }
    return x;
  }
  
  //Test whether the stack is empty
  public boolean empty() {
    return size == 0;
  }
  
  //return the number of elements in the stack
  public int getSize() {
    return size;
  }
  
  //Sets the capacity 
  public int getCapacity() {
    return capacity;
  } 
}