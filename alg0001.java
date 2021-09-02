
import java.util.Arrays;
class alg0001{
	public static void main(String[] args){
		
		int[] arr = {2, 8, 5, 3, 9, 4, 1};
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(bubblesort(arr)));	
		System.out.println(max(9,2,3));
	}

	public static int[] bubblesort(int[] arr){
		int tmp;
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print("\ti="+i);
			for(int j=1;j<arr.length-i;j++)
			{
				if (arr[j-1]>arr[j])
				{
					tmp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					System.out.print("\tswap" + "("+ (j-1) +","+j+")");
				}
			}
			System.out.print("\n");
		}
		return arr;
	}
	public static int max(int a, int b, int c){
		int m=a;
		if(b>m)
			m=b;
		if(c>m)
			m=c;

		return m;
	}
}
