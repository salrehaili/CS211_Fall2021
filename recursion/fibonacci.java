/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Compute Fibonacci series using recursive and non-recursive methods?
class fibonacci{
	public static void main(String[] args){
		fib(3); // invoke the recursive method
		fib1(3); // invoke the non-recursive function
	}
	public static int fib(int n){
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

	public static int fib1(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		return (n-1)+(n-2);
	}

}