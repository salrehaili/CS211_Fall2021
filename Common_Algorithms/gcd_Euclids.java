/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find the greatest common divisor (GCD) of two integers, a and b?

class gcd_Euclids{
	public static void main(String[] args){
		System.out.println("gcd3 = "+gcd3(3000,1200));
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