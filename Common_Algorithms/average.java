/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Compute the average of numbers?

import java.util.Arrays;
class average{
	public static void main(String[] args){
		int[] x={2, 9, 2, 4, 1};
        System.out.println(avg(x));
	}

    public static double avg(int[] x){
        int s=0;
        for(int i =0; i<x.length;i++)
            s+=x[i];
        return (double)s/x.length;
    }
}
