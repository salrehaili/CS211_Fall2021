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
//Find the maximum number in an array?

import java.util.Arrays;
class max_array{
	public static void main(String[] args){
		
		int[] x = {2, 8, 5, 3, 9, 4, 1};
		System.out.println(max(x));
	}

	public static int max(int[] x){
		int max =x[0];
        for(int i=1;i<x.length;i++)
            if(x[i]>max)
                max=x[i];
		return max;
	}
}
