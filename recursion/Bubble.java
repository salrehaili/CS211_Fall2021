/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Bubble sort algorithm using iterative and recursive methods?
import java.util.Arrays;
class Bubble{
	public static void main(String[] args){
		int[] a={3, 9, 5, 1, 2};
		System.out.println(Arrays.toString(a));
		i_Bubble(a); // invoke the iterative bubble sort algorithm 
		//r_Bubble(a, a.length); // invoke the recursive bubble sort algorithm 
		System.out.println(Arrays.toString(a));
	}
	public static void i_Bubble(int[] a){
		int n = a.length;
		int tmp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
				{
					tmp=a[j-1];
					a[j-1]=a[j];
					a[j]=tmp;
				}
			}
		}
	}

	public static void r_Bubble(int[] a, int n){
		if(n==1)
			return;

		for(int j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int tmp=a[j+1];
				a[j+1]=a[j];
				a[j]=tmp;
			}
		r_Bubble(a, n-1);
		}

	}

}