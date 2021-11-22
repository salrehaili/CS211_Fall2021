/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Implement Stack using Java Stack Interface

import java.util.LinkedList;
import java.util.Queue;
public class MyQueue{
	public static void main(String[] args){
		Queue<Integer> s = new LinkedList<>();
		System.out.println(s);
		s.add(3);
		System.out.println(s);
		s.add(9);
		s.add(1);
		s.add(10);
		System.out.println(s);
		s.remove();
		System.out.println(s);
		
	
	}
}


