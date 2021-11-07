/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?
class Cell{
	private int value;
	private Cell next;
	Cell (int v, Cell n){
		value = v;
		next = n;
	}

	public Cell getNext(){
		return this.next;
	}
	public int getValue(){
		return this.value;
	}
	public void setValue(int v){
		this.value = v;
	}
}
public class linked_list{
	public static void main(String[] args){
		Cell temp = new Cell(17, null);
		temp = new Cell(23, temp);
		temp = new Cell(97, temp);
		Cell myList = new Cell(44, temp);
		//System.out.println(myList.next.next.next.next);


		print_linked_list(myList);
		System.out.println();
	}
	public static void print_linked_list(Cell head)
	{
		System.out.print(head.getValue());
		if(head.getNext() !=null)
		{
			System.out.print("-->");
			print_linked_list(head.getNext());
		}
	}

	
}


