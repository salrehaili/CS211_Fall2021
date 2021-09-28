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
class gcd{
	public static void main(String[] args){
		long t1 = System.nanoTime();
		System.out.println("gcd1 = "+gcd1(3000,1200));
		long t2 = System.nanoTime();
		System.out.printf("gcd1 took %.9f\n", (t2-t1)/1e9);


		t1 = System.nanoTime();
		System.out.println("gcd2 = "+gcd2(3000,1200));
		t2 = System.nanoTime();
		System.out.printf("gcd2 took %.9f\n", (t2-t1)/1e9);




		t1 = System.nanoTime();
		System.out.println("gcd3 = "+gcd3(3000,1200));
		t2 = System.nanoTime();
		System.out.printf("gcd3 took %.9f\n", (t2-t1)/1e9);
	}

	public static int gcd1(int a, int b){
		int gcd=0;
		int m =(a>b)?a:b;
		int i=2;
		while(i<=m)
		{
			if(a%i==0 && b%i==0 )
				gcd=i;
			i++;
		}
		return gcd;
	}

	public static int gcd2(int a, int b){
		while(a!=b)
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
	}

	public static int gcd3(int a, int b){
		int r=0;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}


}
n=4
max=a[0];					1*2=2
i=1;						1*1=1
while(i<n){					n*1=n
	if(a[i]>max)			2(n-1)=2n-2   (n-1)*2 =2(n-1)
		max=a[i]			2(n-1)=2n-2
	i++; 					2(n-1)=2n-2
}
return max;					1
2+1+n+2n-2+2n-2+2n-2+1=7n-2