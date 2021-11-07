/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find the largest value in a given array?
class second_largest{
	public static void main(String [] args){
		int[] a ={2,6,3,4,5};
		System.out.println(second_max(a));
	}

	public static int second_max(int[] a){
		int max=a[0];
		int l2=max;
		int i=1;
		while(i<a.length)	//for(int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				l2=max;
				max=a[i];
			}
			else if(a[i]>l2)
				l2=a[i];
			i++;
		}
		return l2;
	}
}