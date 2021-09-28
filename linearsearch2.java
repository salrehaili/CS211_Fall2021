import java.util.Arrays;
class linearsearch{
	public static void main(String[] args){
		int[] a = {4,6,7,2,1, 0};
		
		System.out.println(Arrays.toString(a));
		insert(a, 0, 22);
		System.out.println(Arrays.toString(a));
		delete(a, 0);
		System.out.println(Arrays.toString(a));

	}
	public static int LinearSearch(int[] a, int k){
		for (int i=0;i<a.length;i++)
			if(k==a[i])
				return i;
		return -1;
	}
	public static void insert(int[] a, int loc, int k){
		
		// for (int i=a.length-1;i>loc;i--)
		// 	a[i]=a[i-1];
		//a[loc]=k;

		int i=a.length-1;
		while(i>loc){
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