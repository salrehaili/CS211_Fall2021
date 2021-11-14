/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Implement Stack using Java Stack Interface

import java.util.Stack;
public class MyStack{
	public static void main(String[] args){
		Stack<Integer> s = new Stack<>();
		System.out.println(s);
		s.push(3);
		System.out.println(s);
		s.push(9);
		s.push(1);
		s.push(10);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
	
	}
}


