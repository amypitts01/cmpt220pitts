public class Problem10.10 {
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