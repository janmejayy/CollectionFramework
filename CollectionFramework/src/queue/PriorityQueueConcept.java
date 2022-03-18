package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcept {
	public static void main(String[] args) {
 // Queue<Integer> p=new PriorityQueue<>();
  Queue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());

  //by default first element will be smallest element 
  //and will get priority first and rest element will be same as before
  
  p.offer(12);
  p.add(13);
  p.add(16);
  p.offer(24);
  p.add(10);
  p.add(123);
  System.out.println(p);
  System.out.println(p.poll());//to remove First element
  System.out.println(p.peek());//to check which element will come out first
  
}
}