package stack;

import java.util.Stack;

public class StackQues{
public static void main(String[] args) {
	Stack <String> s=new Stack<> ();
	s.push("hello");
	s.push("JAY");
	s.push("HOW");
	s.push("are");
	s.push("u");
	
	System.out.println(s);
	System.out.println(s.peek());
	
}
}
