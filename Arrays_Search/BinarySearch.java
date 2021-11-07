/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find a value in an array using binary search algorithm?

class BinarySearch{
	public static void main(String[] args){
		int[] a = {100, 50, 17, 87, 22, 1, 70, 30, 31, 55};

		SelectionSort(a);
		System.out.println(Binary(a, 22));
	}

	public static int  Binary(int[] a, int k){
		int l=0;
		int r=a.length-1;
		int mid;
		while(l<=r){
			mid = (int)Math.floor((l+r)/2);

			if(k == a[mid])
				return mid;
			else if(k<a[mid])
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
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


