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
class power{
	public static void main(String[] args)
	{
		long start = System.nanoTime();
		System.out.println(p(30000000000.2,200000000));
		long end = System.nanoTime();
		double seconds = (double)(end-start)/1000000000;
		System.out.printf("%8.9f\n", seconds);
		String a="dfsd";
		String b="rrr";
		int[] array= {2,4,9,23,435};
		System.out.println(average(array));

	}
	public static double p(double b, int e){
		double t=1.0;
		for(int i=1;i<=e;i++)
			t=t*b;
		return t;

	}

	public static double average(int[] array) {
	// write your code here
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		return (double) sum/array.length;
}
}