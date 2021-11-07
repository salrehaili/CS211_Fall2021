/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Computing the power of a number?

import java.util.Arrays;
class power{
	public static void main(String[] args){
		System.out.println(recursive_power(2,2));
	}

    public static int iterative_power(int x, int n){
        int p=1;
        for(int i =1; i<=n;i++)
            p*=x;
        return p;
    }
    public static int recursive_power(int x, int n){
        if(n==1)
            return x;
        else
            return x * recursive_power(x, n-1);
    }
}
