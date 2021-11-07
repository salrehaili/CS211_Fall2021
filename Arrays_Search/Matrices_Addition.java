/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program that add two given matrices?

import java.util.Arrays;
class Matrices_Addition{
	public static void main(String[] args){
		
		int[][] a={{11, 15}, {12, 13}, {21, 17}};
		int[][] b={{21, 14}, {19, 18}, {12, 13}};

		int[][] c= add(a,b);
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

    public static void printmatrix(int[][] a){
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[0].length;j++)
    			System.out.print(a[i][j]+" ");
    		System.out.println();
    	}
    }
}


