/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to muliply two given matrices?

import java.util.Arrays;
class Matrices_Multiply{
	public static void main(String[] args){
		
		int[][] a={{1, 5}, {2, 3}, {1, 7}};
		int[][] b={{1, 2, 3, 7}, {5, 2, 8, 1}};

		int[][] c= product(a,b);
		printmatrix(c);
	}

    public static int[][] product(int[][] a, int[][] b){
    	int[][] p = new int[a.length][b[0].length];
    	if(a[0].length==b.length)
    	{
    		for(int i=0;i<p.length;i++)
    		{
    			for(int j=0;j<p[0].length;j++)
    			{
    				for(int k=0;k<b.length;k++)
    				{
    					//System.out.println(a[i][j] + "*" + b[j][i]);
    					p[i][j]+=a[i][k]*b[k][j];
    				}
    			}

    		}
    	}
    	else
    		System.out.println("first matrix's columns != second's rwos");
    	return p;
    }
    public static void printmatrix(int[][] a){
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[0].length;j++)
    			System.out.print(a[i][j]+" ");
    		System.out.println();
    	}
    }
}


