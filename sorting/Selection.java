/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to order an array using selection sort algorithm?
import java.util.Arrays;
class Selection{
	public static void main(String[] args){
		int[] a={9, 4, 8, 1, 7, 2};
		System.out.println(Arrays.toString(a));
		SelectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void SelectionSort(int[] a){
		int n = a.length;
		int min;
		for(int i=0;i<n;i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int tmp=a[min];
			a[min]=a[i];
			a[i]=tmp;
		}
	}
}