/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?
class SSL{
	public Node head;

	SSL(){
		this.head = null;
	}
	public void display()
	{
		for(Node curr = this.head; curr != null;curr = curr.getNext())
			{
				System.out.print(curr.getValue());
				if(curr.getNext()!=null)
					System.out.print("-->");
			}
			System.out.println();
	}
	public void insertAtFront(Node n){
		n.setNext(this.head);
		this.head = n;
	}

	public void insert(Node n, Object key){
		Node curr = this.SearchByValue(key);
		n.setNext(curr.getNext());
		curr.setNext(n);
	}

	public Node SearchByValue(Object key)
	{
		for(Node curr = this.head; curr != null;curr = curr.getNext())
			{
				if(curr.getValue() == key)
					return curr;
			}

		return null;

	}
}

class Node{
	private Object value;		// stores value
	private Node next;		// points to the next node in the list
	

	Node (Object v, Node n){
		this.value = v;
		this.next = n;
	}

	public Node getNext(){
		return this.next;
	}
	public Object getValue(){
		return this.value;
	}
	public void setValue(Object v){
		this.value = v;
	}
	public void setNext(Node n){
		this.next = n;
	}

}
public class linked_list{
	public static void main(String[] args){

		Node head = null;		// points to the first element in the linked list
		SSL ls = new SSL();
		
		ls.head = new Node(44, new Node(97, new Node(23, new Node(17, null))));
		ls.display();

		//Add at front
		ls.insertAtFront(new Node(55, null));
		ls.display();

		//Add at some position after 44
		ls.insert(new Node(33, null), 44);
		ls.display();

		//Add at last


		// Node n1 = new Node(17, null);
		// n1 = new Node(23, n1);
		// n1 = new Node(97, n1);
		// head = new Node(44, n1);
		// i_print_linked_list(head);



		// //Add at front
		// Node new_node1 = new Node(55, head);
		// head = new_node1;
		// i_print_linked_list(head);






		// //Add at some position after 44
		// // Node new_node2 = new Node(33, head);
		// // Node curr = Search(head, 44);
		// // new_node2.setNext(curr.getNext());
		// // curr.setNext(new_node2);
		
		// Node curr = Search(head, 44);
		// curr.setNext(new Node(33, curr.getNext()));
		// i_print_linked_list(head);



		// // Add new last
		// curr = Search_last(head);
		// curr.setNext(new Node(66, null));
		// i_print_linked_list(head);


		// // Delete
		
		
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
				if(curr.getNext()!=null)
					System.out.print("-->");
			}
			System.out.println();
	}

	public static Node Search(Node head, Object key)
	{
		for(Node curr = head; curr != null;curr = curr.getNext())
			{
				if(curr.getValue() == key)
					return curr;
			}

		return null;

	}

	public static Node Search_last(Node head)
	{
		for(Node curr = head; curr != null;curr = curr.getNext())
			{
				if(curr.getNext() == null)
					return curr;
			}

		return null;

	}
	
}


