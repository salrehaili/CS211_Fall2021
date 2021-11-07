/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using linear search algorithm?

class LinearSearch{
	public static void main(String[] args){
		int[] a = {100, 50, 17, 87, 22, 1, 70, 30, 31, 55};
		System.out.println(LinearSearch(a, 22));
	}
	
	public static int LinearSearch(int[] a, int k){
		for (int i=0;i<a.length;i++)
			if(k==a[i])
				return i;
		return -1;
	}
}


