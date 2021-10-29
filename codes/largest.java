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
class largest{
	public static void main(String [] args){
		int[] a ={2,6,3,4,5};
		System.out.println(max3n(20,30,4));
	}

	public static int max3n(int a, int b, int c){
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}

	public static int maximum(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}

	public static int l1(int[] a){
		int max=a[0];
		int l2=max;
		int i=1;
		while(i<a.length)	//for(int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				l2=max;
				max=a[i];
			}
			else if(a[i]>l2)
				l2=a[i];
			i++;
		}
		return l2;
	}
}