/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Computing the factorial of n using iterative and recursive methods?
class factorial{
	public static void main(String[] args){
		System.out.println(recursive_factorial(6));
	}
	public static int iterative_factorial(int n){
		int f=1;
		for (int i=2;i<=n;i++)
			f=f*i;		//f*=i;
		return f;
	}

    public static int recursive_factorial(int n){
        if(n==0)
            return 1;
        else
            return n*recursive_factorial(n-1);
    }
}