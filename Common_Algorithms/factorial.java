/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Calculate the factorial of a number?

class factorial{
	public static void main(String[] args){
		System.out.println(factorial(5));
	}

    public static int factorial(int n){
        int f=1;
        for(int i =2; i<=n;i++)
            f*=i;
        return f;
    }
}
