/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to insert an element in a given an array?

import java.util.Arrays;
class insert{
	public static void main(String[] args){
		
		int[] a = {9, 3, 6,7,2, 0};			//decleration
		
		System.out.println(Arrays.toString((a)));
		
		insert(a, 3, 74);
		System.out.println(Arrays.toString((a)));
		
	}
	public static void insert(int[] a, int loc, int k){
		int i=a.length-1;
		while (i>loc){
			a[i]=a[i-1];
			i--;
		}
		a[loc]=k;
	}
}


