package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {
public static void main(String[] args) {
	Queue<Integer> q=new LinkedList<>();
	
	q.offer(12);
	q.offer(23);
	q.offer(56);
	System.out.println(q.poll());//to remove FIFO
	
	System.out.println(q.peek());//TO ckeck which FIFO
	System.out.println(q);//
}
}
