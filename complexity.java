class complexity{
	public static void main(String[] args){
		int[][] a={{3,9},{2,3}};
		double[] arr={3, 5, 6.0, 6.5};
		//printg(a);
		System.out.println("s="+sum(5));
		System.out.println("s="+sum_formula(5));


		//6, 12, 18, 24.

	}
	public static void printg(int[][] a){
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			System.out.println(a[i][j]);
	}


	public static double sum1(double[] arr){
		double s=0;
		for(int i=0;i<arr.length;i++)
			s+=arr[i];
		return s;
	}


	public static int sum(int n){
		int s=0;
		for(int i=1;i<=n*2;i+=2)
		{
			System.out.println(i);
			s+=i;
		}
		return s;
	}
	

	public static int sum_formula(int n){
		return n*n;
	}


}

