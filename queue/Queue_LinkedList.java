/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Building a stack using an array

class Node{
	private Object value;	// Holds the data of the node
	private Node next;		// Holds the follwoing node's address

	Node(Object v, Node n){
		this.value =v;
		this.next = n;
	}

	public Node getNext(){
		return this.next;
	}

	public Object getValue(){
		return this.value;
	}

	public void setNext(Node n){
		this.next=n;
	}

	public void setValue(Object v)
	{
		this.value=v;
	}

	
}

class Queue{
	public Node front;
	Queue(){
		this.front=null;
	}

	public  void display(Node h){
		if(h==this.front)
			System.out.print("[");
		if(h!=null)
		{
			
			System.out.print(h.getValue()+ ", ");
			display(h.getNext());

		}
		if(h==this.front)
			System.out.println("]");
	}

	public void enqueue(Object v){
		if(this.front ==null)
		{
			Node new_node = new Node(v, null);
			this.front=new_node;
		}
		else
		{
			Node curr = this.front;
			while(curr.getNext()!= null)
				curr = curr.getNext();

			Node new_node = new Node(v, null);
			curr.setNext(new_node);
		}
	}

	public Node dequeue(){
		Node tmp =this.front;
		this.front=this.front.getNext();
		return tmp;
	}
	public Node peek(){
		return this.front;
	}

	public boolean isEmpty()
	{
		return (this.front==null);
	}

	// Count the elements of the lsit
	
	public int size(){
		Node curr = this.front;
		int c=0;
		while(curr != null)
		{
			curr = curr.getNext();
			c++;
		}
		return c;
	}

}
public class Queue_LinkedList{
	public static void main(String[] args){
		


		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(21);
		q.enqueue(22);
		q.enqueue(3);
		q.display(q.front);
		q.dequeue();
		q.display(q.front);

		q.dequeue();
		q.display(q.front);
		q.enqueue(99);

		q.display(q.front);

		q.dequeue();
		q.display(q.front);


		
	
	}
}


