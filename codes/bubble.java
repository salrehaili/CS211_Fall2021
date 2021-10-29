import java.util.Arrays;
public class bubble{
	public static void main(String[] args){
		int[] a ={92,42,73,19,86,33,7,60};
		System.out.println(Arrays.toString(a));
		//SelectionSort(a);
		BubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void BubbleSort(int[] a){
		int n = a.length;
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				c++;
				if(a[j-1]>a[j])
				{
					int tmp=a[j-1];
					a[j-1]=a[j];
					a[j]=tmp;
				}
			}
			System.out.println("c="+c);
			c=0;
		}
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
			System.out.println("i="+i);
			System.out.println("arr="+Arrays.toString(a));
		}
	}
	
}