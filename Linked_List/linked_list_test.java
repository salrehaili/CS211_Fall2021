/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?

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

class SSL{
	public Node head;

	SSL(){
		this.head = null;
	}
	public void display2()
	{
		for(Node curr = this.head; curr != null;curr = curr.getNext())
			{
				System.out.print(curr.getValue());
				if(curr.getNext()!=null)
					System.out.print("-->");
			}
			System.out.println();
	}

	public void display()
	{
		Node curr = this.head;
		while(curr != null)
			{
				System.out.print(curr.getValue());
				if(curr.getNext()!=null)
					System.out.print("-->");

				curr = curr.getNext();
			}
			System.out.println();
	}

	// Insertion at the beginning
	public void insertAtFront(Object v){
		Node tmp = new Node(v, this.head);
		this.head = tmp;
	}

	//Insertion after a given node
	public void insertAfter(Object v, Object key){
		Node tmp = this.head;
		while(tmp.getValue() !=key)
		{
			tmp = tmp.getNext();
		}
		Node newNode = new Node(v, null);
		newNode.setNext(tmp.getNext());
		tmp.setNext(newNode);
	}

	//Insertion at end
	public void insertAtEnd(Object key){
		Node tmp = this.head;
		while(tmp.getNext() !=null)
			tmp = tmp.getNext();

		tmp.setNext(new Node(key, tmp.getNext()));
	}

	//Deleting
	public void Delete(Object key){
		if(key == this.head.getValue())
			this.head = head.getNext();
		else
		{
			Node tmp = this.head;
			Node pre =this.head;
			while(tmp.getValue() !=key)
			{
				pre = tmp;
				tmp = tmp.getNext();
			}
			pre.setNext(tmp.getNext());
		}
	}

	public Node Search(Object key)
	{
		Node curr = this.head;
		while( curr != null)
			{
				if(curr.getValue() == key)
					return curr;
				curr = curr.getNext();
			}
		return null;

	}
}


public class linked_list{
	public static void main(String[] args){

		Node head = null;		// points to the first element in the linked list
		SSL ls = new SSL();
		
		ls.head = new Node(44, new Node(97, new Node(23, new Node(17, null))));
		ls.display();

		//Add at front
		ls.insertAtFront(55);
		ls.display();

		//Add at some position after 44
		ls.insertAfter(33, 44);
		ls.display();

		//Add at last
		ls.insertAtEnd(99);
		ls.display();


		//Delete 97
		ls.Delete(55);
		ls.display();

		System.out.println(ls.Search(99));
		
	}
	
}


