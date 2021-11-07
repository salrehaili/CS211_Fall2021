/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Compute the sum of first n-odd numbers?

import java.util.Arrays;
class sum_odd_n{
	public static void main(String[] args){
        System.out.println(sum(2));
	}

    public static int sum(int n){
        int s=0;
        for(int i =1; i<n*2;i+=2)
            s+=i;
        return s;
    }

    public static int sum1(int n){
        return n*n;
    }
}
