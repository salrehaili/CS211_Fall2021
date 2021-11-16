
/*
Fall 2021
CS211-Algorithm & Data Structures
Dr. Sameer M. Alrehaili
*/
//Reversing an array using a stack

import java.util.Stack;
class Reversing_by_Stack{
	public static void main(String[] args){
		Stack<Integer> S = new Stack<>();
        int[] a={5, 7, 1, 9, 0, 2};

        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();


        for(int i =0;i<a.length;i++)
            S.push(a[i]);



        for(int i =0;i<a.length;i++)
            a[i] = S.pop();



        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();




        


	}
}
