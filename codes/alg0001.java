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
import java.util.Arrays;
class alg0001{
	public static void main(String[] args){
		
		int[] arr = {2, 8, 5, 3, 9, 4, 1};
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(bubblesort(arr)));	
		System.out.println(max(9,2,3));
	}

	public static int[] bubblesort(int[] arr){
		int tmp;
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print("\ti="+i);
			for(int j=1;j<arr.length-i;j++)
			{
				if (arr[j-1]>arr[j])
				{
					tmp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					System.out.print("\tswap" + "("+ (j-1) +","+j+")");
				}
			}
			System.out.print("\n");
		}
		return arr;
	}
	public static int max(int a, int b, int c){
		int m=a;
		if(b>m)
			m=b;
		if(c>m)
			m=c;

		return m;
	}
}
