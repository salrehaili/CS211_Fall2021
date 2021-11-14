/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Array-based Stack Implementation
import java.util.Arrays;

class Stack {
	private int top;
    private int[] arr;

    Stack(int length) {
    	if (length <= 0)
    		throw new IllegalArgumentException("Stack's length must be positive");
    	arr = new int[length];
    	top = -1;
    }

    void push(int value) {
        if (top == arr.length)
        	throw new StackException("Stack's underlying array is overflow");
        top++;
        arr[top] = value;
    }

    int peek() {
    	if (top == -1)
    		throw new StackException("Stack is empty");
    	return arr[top];
    }

    int pop() {
    	if (top == -1)
    		throw new StackException("Stack is empty");

    	int tmp = arr[top];
        arr[top]=0;
        top--;
        return tmp;
    }

    boolean isEmpty() {
    	return (top == -1);
    }

    int size() {
    	return top+1;
    }

    public String toString() {
    	return Arrays.toString(arr);
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


