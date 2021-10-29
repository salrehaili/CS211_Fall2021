/*
 * The MIT License
 *
 * Copyright (c) 2021 Sameer Alrehaili <salrehaili@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/*
Fall 2021
CS211-Algorithm & Data Structures
Dr. Sameer M. Alrehaili
*/
//Computing the sum of two matrices?

import java.util.Arrays;
class Matrices_sum{
	public static void main(String[] args){
		int[][] x={{2, 9}, {2, 4}, {1, 2}};
        int[][] y={{20, 19}, {3, 5}, {6, 1}};
        int[][] c = add(x,y);
        print_matrix(c);
	}

    public static int[][] add(int[][] a, int[][] b) {
        int row = a.length;
        int column = a[0].length;
        int[][] c = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void print_matrix(int[][] x){
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[0].length;j++)
                System.out.print(x[i][j]+" ");
            System.out.println();
        }
    }
}
