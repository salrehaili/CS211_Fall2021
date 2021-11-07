/*
 * The MIT License
 *
 /*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Compute the sum of numbers?

import java.util.Arrays;
class sum{
	public static void main(String[] args){
		int[] x={2, 9, 2, 4, 1};
        System.out.println(sum(x));
	}

    public static int sum(int[] x){
        int s=0;
        for(int i =0; i<x.length;i++)
            s+=x[i];
        return s;
    }
}
