package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAL {
	public static void main(String[] args) {
		
	
	ArrayList<String>list=new ArrayList<>();
	list.add("hello");
	list.add("my");
	list.add("name");
	list.add("is");
	list.add("jay");
	Collections.sort(list);

	System.out.println(list);
	
	//sorting number
	 List<Integer> list2=new ArrayList<Integer>();  
	  list2.add(21);  
	  list2.add(11);  
	  list2.add(51);  
	  list2.add(1);  
	  list2.add(1);  
	  list2.add(1);  

	  //Sorting the list  
	  Collections.sort(list2);
	  System.out.println(list2);
}
}