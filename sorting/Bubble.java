/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to order an array using bubble sort algorithm?
import java.util.Arrays;
class Bubble{
	public static void main(String[] args){
		int[] a={9, 5, 4, 3, 1, 2};
		System.out.println(Arrays.toString(a));
		BubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void BubbleSort(int[] a){
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int tmp=a[j-1];
					a[j-1]=a[j];
					a[j]=tmp;
				}
			}
			System.out.println("#->"+ Arrays.toString(a));
		}
	}
}