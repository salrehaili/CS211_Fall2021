/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Array-based Stack Implementation
import java.util.Arrays;

class Stack {
	private int top;
    private int[] storage;

    Stack(int capacity) {
    	if (capacity <= 0)
    		throw new IllegalArgumentException("Stack's capacity must be positive");
    	storage = new int[capacity];
    	top = -1;
    }

    void push(int value) {
        if (top == storage.length)
        	throw new StackException("Stack's underlying storage is overflow");
        top++;
        storage[top] = value;
    }

    int peek() {
    	if (top == -1)
    		throw new StackException("Stack is empty");
    	return storage[top];
    }

    void pop() {
    	if (top == -1)
    		throw new StackException("Stack is empty");
    	top--;
    }

    boolean isEmpty() {
    	return (top == -1);
    }

    int size() {
    	return top+1;
    }

    public String toString() {
    	return Arrays.toString(storage);
    }

    public class StackException extends RuntimeException {
    	public StackException(String message) {
    		super(message);
    	}
    }
}

public class Array_Stack{
	public static void main(String[] args){
		Stack s = new Stack(10);
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
		System.out.println(s.isEmpty());
		System.out.println(s);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);


		System.out.println(s.size());
	
	}
}


