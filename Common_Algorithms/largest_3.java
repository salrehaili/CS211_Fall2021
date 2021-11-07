/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to find the maximum value of three given numbers?
class largest_3{
	public static void main(String [] args){
		int a=5, b=9, c=2;
		System.out.println(max3n(a, b, c));
	}

	public static int max3n(int a, int b, int c){
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
}