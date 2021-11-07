/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?
public class SLLNode {
	protected Object element;
	protected SLLNode succ;
	protected SLLNode(Object elem, SLLNode succ) {
		this.element = elem;
		this.succ = succ;
	}
}