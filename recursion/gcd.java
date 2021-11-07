/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find the greatest common divisor (GCD) of two integers, a and b using recursive method?

class gcd{
	public static void main(String[] args){
		System.out.println(r_gcd(12,6));
	}

    public static int i_gcd(int a, int b){
        int r;
        while(b!=0){
            r= a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int r_gcd(int a, int b){
        if (b==0)
            return a;
        else
        {
            return r_gcd(b, a % b);
        }
    }
}
