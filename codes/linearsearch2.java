import java.util.Arrays;
class linearsearch2{
	public static void main(String[] args){
		int[] a = {5, 7, 22, 28, 30, 31, 55, 78, 100};
		
		// String[] b={"Ahmad", "Sameer", "Khalid", "Waleed", "Tariq", "Hassan"};
		// int f= LinearSearch(b, "Mohammed");
		// System.out.println(f);



		System.out.println(Arrays.toString(a));
		//insert(a, 0, 22);
		SelectionSort(a);
		System.out.println(Binary(a, 50));
		System.out.println(Arrays.toString(a));
		//delete(a, 0);
		//System.out.println(Arrays.toString(a));*/

	}
	public static int LinearSearch(String[] a, String k){
		for (int i=0;i<a.length;i++)
		{
			System.out.println("iteration#"+i);
			if(k==a[i])
				return i;
		}
		return -1;
	}

	public static int LinearSearch(int[] a, int k){
		for (int i=0;i<a.length;i++)
			if(k==a[i])
				return i;
		return -1;
	}

	public static int  Binary(int[] a, int k){
		int l=0;
		int r=a.length-1;
		int mid;
		int c=0;
		while(l<=r){
			c++;

			mid = (int)Math.floor((l+r)/2);

			System.out.println(" c= "+c+ " M= "+ mid+  " l= "+l+ " r= "+r);
			if(k == a[mid])
				return mid;
			else if(k<a[mid])
				r=mid-1;
			else
				l=mid+1;
			
			
		}
		return -1;
	}




	public static void insert(int[] a, int loc, int k){
		
		// for (int i=a.length-1;i>loc;i--)
		// 	a[i]=a[i-1];
		//a[loc]=k;

		int i=a.length-1;
		int c=0;
		while(i>loc){
			System.out.println("iteration#"+c++);
			a[i]=a[i-1];
			i--;
		}
		a[loc]=k;
	}

	public static void delete(int[] a, int loc){
		
		// for (int i=loc;i<a.length-1;i++)
		// 	a[i]=a[i+1];
		//a[a.length-1]=0;


		int i=loc;
		while(i<a.length-1){
			a[i]=a[i+1];
			i++;
		}
		a[a.length-1]=0;
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






//Input: a set of numbers, a1, a2, ..., an, key
//Output: location of the given value in the set, or -1
//i<--1
//while i<= size of a do
//	if ai = key then
//		return i
//	end if
//end while
//return -1