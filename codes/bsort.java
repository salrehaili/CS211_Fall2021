import java.util.Arrays;
public class bsort{
	public static void main(String[] args)
	{
		int[] a={6,3,9, 1};
		System.out.println(Arrays.toString(a));
		BubbleSort(a);
		System.out.println(Arrays.toString(a));


		// int a = 9;
		// int b = 5;

		// int t;
		// t=a;
		// a=b;
		// b=t;

		// System.out.println("a = " + a);
		// System.out.println("b = " + b);

	}

	public static void BubbleSort(int[] a){
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
					swap(a, j-1, j);
			}
		}
	}

	public static void SelectionSort(int[] a){
		int n = a.length;
		int min;
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			swap(a, min, i);
		}
	}

	public static void swap(int[] a, int i1, int i2){
		int tmp=a[i1];
		a[i1]=a[i2];
		a[i2]=tmp;
	}
}