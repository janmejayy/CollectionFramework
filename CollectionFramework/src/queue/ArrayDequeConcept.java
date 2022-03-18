package queue;

import java.util.ArrayDeque;

public class ArrayDequeConcept {
	public static void main(String[] args) {
		
	
	ArrayDeque<Integer> ad=new ArrayDeque<>();
	//we can insert element from stating index as well as from last of the index
	ad.offer(10);
	ad.offer(23);
	ad.offerFirst(20);
	ad.offerLast(45);
	System.out.println(ad);
	
}
}