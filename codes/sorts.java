import java.util.Arrays;
class sorts{
	public static void main (String[] args){
		int[] a={3,5,6,3};
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
		}
	}
}