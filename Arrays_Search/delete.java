/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Write Java program to delete an element in a given an array?

import java.util.Arrays;
class delete{
	public static void main(String[] args){
		
		int[] a = {9, 3, 6,7,2, 0};			//decleration
		
		System.out.println(Arrays.toString((a)));
		
		delete(a, 3);
		System.out.println(Arrays.toString((a)));
		
	}
	public static void delete(int[] a, int loc){
		int i=loc;
		while (i<a.length-1){
			a[i]=a[i+1];
			i++;
		}
		a[a.length-1]=0;
	}
}


