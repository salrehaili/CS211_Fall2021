import java.util.Arrays;
class ar{
	public static void main(String[] args){
		

		int[] a = {9, 3, 6,7,2, 0};
		//a[1]=20;
		//System.out.println(a[1]);
		System.out.println(Arrays.toString((a)));
		insert(a, 0, 44);
		System.out.println(Arrays.toString((a)));
		update(a, 3, 88);
		System.out.println(Arrays.toString((a)));
		lookup(a, 5);
	}
	public static void insert(int[] a, int loc, int k){
		int i=a.length-1;
		while (i>loc){
			a[i]=a[i-1];
			i--;
		}
		a[loc]=k;
	}

	public static void delete(int[] a, int loc){
		int i=loc;
		while (i<a.length-1){
			a[i]=a[i+1];
			i++;
		}
		a[a.length-1]=0;
	}

	public static void print_ar(int[] a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ,");
		System.out.println();
	}


	public static void update(int[] a, int loc, int k){
		a[loc]=k;
	}

	public static void lookup(int[] a, int loc){
		System.out.println(a[loc]);
	}
}


