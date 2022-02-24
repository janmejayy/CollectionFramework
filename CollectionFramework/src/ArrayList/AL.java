package ArrayList;
import java.util.*;
public class AL {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<>();
	list.add("hello");
	list.add("my");
	list.add("name");
	list.add("is");
	list.add("jay");


	System.out.println(list);
	//Iteratinng arraylist using iterator
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//method 2
	for(String name:list) {
		System.out.println(name);
	}
	System.out.println();
}
}
