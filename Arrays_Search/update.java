/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to update an element in a given an array?

import java.util.Arrays;
class update{
	public static void main(String[] args){
		
		int[] a = {9, 3, 6,7,2, 0};			//decleration
		
		System.out.println(Arrays.toString((a)));
		
		update(a, 3, 88);
		System.out.println(Arrays.toString((a)));
		
	}
	public static void update(int[] a, int loc, int k){
		a[loc]=k;
	}
}


