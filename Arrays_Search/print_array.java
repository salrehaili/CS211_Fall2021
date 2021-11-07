/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to print out all elements of a given an array?

import java.util.Arrays;
class print_array{
	public static void main(String[] args){
		
		int[] a = {9, 3, 6,7,2, 0};			//decleration
		
		print_ar(a);
	}
	public static void print_ar(int[] a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ,");
		System.out.println();
	}
}


