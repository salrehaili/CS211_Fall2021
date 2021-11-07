/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java code to reverse the order of a given array?

import java.util.Arrays;
class reverse{
	public static void main(String[] args){
		int[] x={7, 9, 2, 4, 1};
        recursive_reverse(x, 0, x.length-1);
        //iterative_reverse(x);
        
        System.out.println(Arrays.toString(x));

	}

    public static void iterative_reverse(int[] x){
        int n = x.length;
        int tmp;
        for(int i =0; i<n/2;i++)
        {
            tmp = x[i];
            x[i] = x[(n-1)-i];
            x[(n-1)-i] = tmp;
        }
    }
    public static void recursive_reverse(int[] x, int i, int j){
        if(i<j)
            {
                int tmp = x[i];
                x[i] = x[j];
                x[j] = tmp;
                recursive_reverse(x, i+1, j-1);
            }
    }
}
