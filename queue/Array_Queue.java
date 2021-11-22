/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Array-based Queue Implementation
import java.util.Arrays;

class Queue {
	private int rear;
	private int front;
    private int[] arr;

    Queue(int length) {
    	if (length <= 0)
    		throw new IllegalArgumentException("Stack's length must be positive");
    	arr = new int[length];
    	rear = -1;
    	front=0;
    }

    void enqueue(int value) {
        this.rear++;
        this.arr[this.rear]=value;
    }

    int peek() {
    	if (rear == -1)
    		throw new StackException("Stack is empty");
    	return arr[0];
    }

    int dequeue() {
    	if (rear == -1)
    		throw new StackException("Stack is empty");

    	int tmp = arr[0];
    	for(int i=1;i<=this.rear;i++)
    		this.arr[i-1]=this.arr[i];
        this.arr[rear]=0;
        this.rear--;
        return tmp;
    }

    boolean isEmpty() {
    	return (rear == -1);
    }

    int size() {
    	return rear+1;
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

public class Array_Queue{
	public static void main(String[] args){
		Queue q = new Queue(10);
		System.out.println(q);
		q.enqueue(3);
		System.out.println(q);
		q.enqueue(9);
		q.enqueue(1);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		
	
	}
}


