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
/**
 * GCD1 using Brute Force method
 * GCD2 using Subtraction Method
 * GCD3 using Recursive method
**/
import java.util.Arrays;
class alg0002{
	public static void main(String[] args){
		
		int[] arr = {2, 8, 5, 3, 9, 4, 1};
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(bubblesort(arr)));	
		
		
		//System.out.println(GCD1(2053801444,1254540146));
		
		//long stime = System.currentTimeMillis();
		//System.out.println(GCD1(4200002,3000050));
		//System.out.printf("Took %.4f%n", (System.currentTimeMillis() - stime)/1e9);


		//System.out.println(GCD4(30,8));
		//System.out.println(GCD2(80,48));
		System.out.println(GCD3_1(30,12));
		//System.out.println(GCD1_1(16,27));  have no common divisor
	}

	public static int GCD1(int a, int b){
		int m = Math.min(a,b);
		int c=0;
		int gcd=0;
		for(int i=1;i<=m;i++)
		{
			System.out.println(++c);
			if(a%i ==0 && b%i==0)
				gcd=i;
		}
		return gcd;
	}

	public static int GCD1_1(int a, int b){
		int m = Math.min(a,b);
		int gcd=0;
		int i=2;
		while(i<=m)
		{
			if(a%i ==0 && b%i==0)
				gcd=i;
		i++;
		}
		return gcd;
	}


	public static int GCD2(int a, int b){
		int c=0;
		while (a != b) {
			System.out.println(++c);
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static int GCD3_1(int a, int b){
		int c=0;
		int r;
		while(b!=0){
			System.out.println(++c);
			r= a%b;
			a=b;
			b=r;
		}
		return a;
	}

	public static int GCD3_2(int a, int b){
		int c=0;
		if (b==0)
			return a;
		else
		{
			System.out.println(++c);
			return GCD3_2(b, a % b);
		}
	}

	public static int GCD4(int a, int b){
		int c=0;
		System.out.println(++c);
		while(b!=0){
			a=b;
			b=a%b;
		}
		return a;
	}


}
