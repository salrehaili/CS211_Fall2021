/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to do addition,  dot product, and print out all elements of a given matrix?

import java.util.Arrays;
class Matrices{
	public static void main(String[] args){
		
		int[][] a={{1, 5}, {2, 3}, {1, 7}};
		int[][] b={{1, 2, 3, 7}, {5, 2, 8, 1}};

		int[][] c= product(a,b);
		printmatrix(c);
	}
	
	public static int[][]  add(int[][] a, int[][] b) {
		int row = a.length;
        int column = a[0].length;
        int[][] c = new int[row][column];
 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
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


