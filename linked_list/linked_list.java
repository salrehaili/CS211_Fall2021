/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?
class Node{
	private int value;
	private Node next;
	Node (int v, Node n){
		value = v;
		next = n;
	}

	public Node getNext(){
		return this.next;
	}
	public int getValue(){
		return this.value;
	}
	public void setValue(int v){
		this.value = v;
	}
	public void setNext(Node n){
		this.next = n;
	}
}
public class linked_list{
	public static void main(String[] args){
		Node temp = new Node(17, null);
		temp = new Node(23, temp);
		temp = new Node(97, temp);
		Node head = new Node(44, temp);
		//System.out.println(head.next.next.next.next);



		r_print_linked_list(head);
		System.out.println();



		//Add at first
		Node new_node1 = new Node(55, head);
		head = new_node1;
		
		r_print_linked_list(head);
		System.out.println();






		//Add at after specific element 44
		Node new_node2 = new Node(33, head);
		Node curr = Search(head, 44);
		new_node2.setNext(curr.getNext());
		curr.setNext(new_node2);
		

		// Node curr = Search(head, 44);
		// curr.setNext(new Node(33, curr.getNext()));



		r_print_linked_list(head);
		System.out.println();



		// Delete
		
		
	}
	public static void r_print_linked_list(Node head)
	{
		System.out.print(head.getValue());
		if(head.getNext() !=null)
		{
			System.out.print("-->");
			r_print_linked_list(head.getNext());
		}
	}

	public static void i_print_linked_list(Node head)
	{
		for(Node curr = head; curr != null;curr = curr.getNext())
			{
				System.out.print(curr.getValue());
				System.out.print("-->");
			}

	}

	public static Node Search(Node head, int key)
	{
		for(Node curr = head; curr != null;curr = curr.getNext())
			{
				if(curr.getValue() == key)
					return curr;
			}

		return null;

	}
	
}


