/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find the greatest common divisor (GCD) of two integers, a and b?

class gcd{
	public static void main(String[] args){
		long t1 = System.nanoTime();
		System.out.println("gcd1 = "+gcd1(3000,1200));
		long t2 = System.nanoTime();
		System.out.printf("gcd1 took %.9f\n", (t2-t1)/1e9);


		t1 = System.nanoTime();
		System.out.println("gcd2 = "+gcd2(3000,1200));
		t2 = System.nanoTime();
		System.out.printf("gcd2 took %.9f\n", (t2-t1)/1e9);




		t1 = System.nanoTime();
		System.out.println("gcd3 = "+gcd3(3000,1200));
		t2 = System.nanoTime();
		System.out.printf("gcd3 took %.9f\n", (t2-t1)/1e9);
	}

	public static int gcd1(int a, int b){
		int gcd=0;
		int m =(a>b)?a:b;
		int i=2;
		while(i<=m)
		{
			if(a%i==0 && b%i==0 )
				gcd=i;
			i++;
		}
		return gcd;
	}

	public static int gcd2(int a, int b){
		while(a!=b)
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
	}

	public static int gcd3(int a, int b){
		int r=0;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}


}