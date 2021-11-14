/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Singly Linked List

class Node<E>{
	private E value;	// Holds the data of the node
	private Node<E> next;		// Holds the follwoing node's address

	Node(E v, Node<E> n){
		this.value =v;
		this.next = n;
	}

	public Node<E> getNext(){
		return this.next;
	}

	public E getValue(){
		return this.value;
	}

	public void setNext(Node<E> n){
		this.next=n;
	}

	public void setValue(E v)
	{
		this.value=v;
	}
}

class SLL{
	public Node head;
	SLL(){
		this.head=null;
	}

	public  void display(){
		Node curr = this.head;
		while(curr != null)
		{
			System.out.print(curr.getValue());
			if(curr.getNext()!=null)
				System.out.print("-->");
			curr=curr.getNext();
		}
		System.out.println();
	}

	public void insertAtFront(Object v){
		Node new_node = new Node(v, this.head);
		this.head = new_node;
	}

	public void insertAtEnd(Object v){
		Node curr = this.head;
		while(curr .getNext()!= null)
			curr = curr.getNext();

		Node new_node = new Node(v, null);
		curr.setNext(new_node);
	}

	public void insertAfter(Object v, Object key){
		Node curr = this.head;
		while(curr.getValue() != key)
			curr=curr.getNext();

		Node new_node = new Node(v, curr.getNext());
		curr.setNext(new_node);

	}

	public void Delete(Object v)
	{
		if(v == this.head.getValue())
			this.head = head.getNext();
		else
		{
			Node curr = this.head;
			Node previous = this .head;
			while(curr.getValue()!=v)
			{
				previous = curr;
				curr = curr.getNext();
			}
			previous.setNext(curr.getNext());
		}
	}

	public Node Search(Object v){
		Node curr = this.head;
		while(curr != null)
		{
			if(curr.getValue() == v)
				return curr;
			curr = curr.getNext();
		}
		return null;
	}

	//The following function gets the last node in the list
	public Node Last(){
		Node curr = this.head;
		while(curr.getNext()!= null)
			curr = curr.getNext();
		return curr;
	}

	// Count the elements of the lsit
	public int size(){
		Node curr = this.head;
		int c=0;
		while(curr != null)
		{
			curr = curr.getNext();
			c++;
		}
		return c;
	}

}
public class Singly_Linked_List_generic{
	public static void main(String[] args){
		// /*Node temp = new Node(17, null);
		// temp = new Node(23, temp);
		// temp = new Node(97, temp);*/
		// Node n4 = new Node(1, null);
		// Node n3 = new Node(21, n4);
		// Node n2 = new Node(22, n3);
		// Node n1 = new Node(3, n2);
		// Node head = n1;


		SLL ls = new SLL();
		ls.insertAtFront(1);
		ls.insertAtFront(21);
		ls.insertAtFront(22);
		ls.insertAtFront(3);
		ls.display();

		//ls.insertAtEnd(33);
		//ls.insertAtFront(33);

		//ls.insertAfter(33, 22);
		//ls.Delete(22);
		//Node g = ls.Search(22);
		//System.out.println(g.getNext().getValue());

		System.out.println(ls.size());
		System.out.println(ls.Last().getValue());
		//ls.display();
	
	}
}


