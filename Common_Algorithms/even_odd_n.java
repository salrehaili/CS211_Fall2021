/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find odd and even numbers of first n ?

import java.util.Arrays;
class even_odd_n{
	public static void main(String[] args){
		check(5);
	}

	public static void check(int n){
        for(int i=1;i<=n;i++)
            if(i%2==0)
                System.out.println( i +" even");
            else
                System.out.println( i+ " odd");
    }
}
