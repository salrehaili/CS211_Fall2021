/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Implement Queue using Java Queue Interface

import java.util.LinkedList;
import java.util.Queue;
public class MyQueue{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q);
		q.add(3);
		System.out.println(q);
		q.add(9);
		q.add(1);
		q.add(10);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
	
	}
}


