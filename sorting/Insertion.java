/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to order an array using insertion sort algorithm?
import java.util.Arrays;
class Insertion{
	public static void main(String[] args){
		int[] a={9, 4, 8, 1, 7, 2};
		System.out.println(Arrays.toString(a));
		InsertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void InsertionSort(int[] a){
		int tmp;
		int n = a.length;
		for (int i = 1; i < n; i++){
			int j = i;
			tmp = a[i];
			while (j > 0 && tmp < a[j - 1]){
				a[j] = a[j - 1]; // shifting to the right
				j--;
			}
			a[j] = tmp;
	}
}
}