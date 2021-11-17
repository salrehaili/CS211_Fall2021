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

class Stack{
	public Node top;
	Stack(){
		this.top=null;
	}

	public  void display(Node h){
		if(h==this.top)
			System.out.print("[");
		if(h!=null)
		{
			display(h.getNext());
			System.out.print(h.getValue()+ ", ");

		}
		if(h==this.top)
			System.out.println("]");
	}

	public void push(Object v){
		Node new_node = new Node(v, this.top);
		this.top = new_node;
	}

	public Node pop(){
		Node tmp =this.top;
		this.top=this.top.getNext();
		return tmp;
	}
	public Node peek(){
		return this.top;
	}

	public boolean isEmpty()
	{
		return (this.top==null);
	}

	// Count the elements of the lsit
	
	public int size(){
		Node curr = this.top;
		int c=0;
		while(curr != null)
		{
			curr = curr.getNext();
			c++;
		}
		return c;
	}

}
public class LinkedList_Stack{
	public static void main(String[] args){
		// /*Node temp = new Node(17, null);
		// temp = new Node(23, temp);
		// temp = new Node(97, temp);*/
		// Node n4 = new Node(1, null);
		// Node n3 = new Node(21, n4);
		// Node n2 = new Node(22, n3);
		// Node n1 = new Node(3, n2);
		// Node head = n1;


		Stack ls = new Stack();
		ls.push(1);
		ls.push(21);
		ls.push(22);
		ls.push(3);
		ls.display(ls.top);
		System.out.println(ls.peek().getValue());
		ls.display(ls.top);

		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		
	
	}
}


