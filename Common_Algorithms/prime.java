/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Find out whether a given number is prime or not?

import java.util.Arrays;
class prime{
	public static void main(String[] args){
		System.out.println(Prime(7));
	}

    public static boolean Prime(int x){
        for(int i =2; i<x;i++)
            if(x%i==0)
                return false;
       return true;
    }
}
