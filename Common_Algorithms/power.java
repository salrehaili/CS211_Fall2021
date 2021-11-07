/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Compute the power of a number?

import java.util.Arrays;
class power{
	public static void main(String[] args){
		System.out.println(power(3,3));
	}

    public static int power(int x, int n){
        int p=1;
        for(int i =1; i<=n;i++)
            p*=x;
        return p;
    }
}
