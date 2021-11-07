/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to lookup for an element in a given an array?

import java.util.Arrays;
class lookup{
	public static void main(String[] args){
		
		int[] a = {9, 3, 6,7,2, 0};			//decleration
		
		System.out.println(Arrays.toString((a)));
		
		lookup(a, 3);
		System.out.println(Arrays.toString((a)));
		
	}
	public static void lookup(int[] a, int loc){
		System.out.println(a[loc]);
	}
}


