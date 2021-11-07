/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find the largest value in a given array?
class largest{
	public static void main(String [] args){
		int[] a ={2,6,3,4,5};
		System.out.println(maximum(a));
	}

	public static int maximum(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
}