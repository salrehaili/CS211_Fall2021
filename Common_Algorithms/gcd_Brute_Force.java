/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find the greatest common divisor (GCD) of two integers, a and b?

class gcd_Brute_Force{
	public static void main(String[] args){
		System.out.println("gcd1 = "+gcd1(3000,1200));
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

}