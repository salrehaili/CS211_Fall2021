/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Wrtie Java program to find whether a given number is even or odd?

import java.util.Arrays;
class even_odd{
	public static void main(String[] args){
		check(2);
	}

    public static void check(int x){
            if(x%2==0)
                System.out.println( x +" even");
            else
                System.out.println( x+ " odd");
    }
}
