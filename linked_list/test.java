/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
class Node{
	private int value;
	private Node next;

	Node(int v, Node n){
		this.value =v;
		this.next = n;
	}

	public Node getNext(){
		return this.next;
	}

	public int getValue(){
		return this.value;
	}

	public void setNext(Node n){
		this.next=n;
	}

	public void setValue(int v)
	{
		this.value=v;
	}
}
public class test{
	public static void main(String[] args){
		Node temp = new Node(17, null);
		temp = new Node(23, temp);
		temp = new Node(97, temp);
		Node head = new Node(44, temp);

		i_print(head);

		
		//Atfront
		Node node1 = new Node(55, head);
		head = node1;
		i_print(head);


		//Add at some position after 44
		Node curr = SearchByValue(head, 44);
		Node new_node1= new Node(33, curr.getNext());
		curr.setNext(new_node1);
		i_print(head);


		// // Add new last
		// curr = Search_last(head);
		// curr.setNext(new Node(66, null));
		// i_print(head);

	}

	public static void r_print(Node head){
		System.out.print(head.getValue());
		if(head.getNext()!=null)
		{
			System.out.print("-->");
			r_print(head.getNext());
		}
	}

	public static void i_print(Node head){
		for(Node curr = head;curr != null;curr=curr.getNext())
		{
			System.out.print(curr.getValue());
			if(curr.getNext()!=null)
				System.out.print("-->");
		}
		System.out.println();
	}
	public static Node SearchByValue(Node head, int key)
	{
		for(Node curr = head;curr != null;curr=curr.getNext())
		{
			if(curr.getValue() == key)
				return curr;

		}
		return null;
	}

	
	
}


