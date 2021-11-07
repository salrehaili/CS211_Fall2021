/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/
//Print numbers from 1 to n using iterativ and recursive methods?
class printing{
	public static void main(String[] args){
		r_printn(3); // invoke the recursive function
		i_printn(3); // invoke the iterative function
	}
	public static void i_printn(int n){
		for(int i=1;i<=n;i++)
			System.out.println(i);
	}
	public static void r_printn(int n){
		if(n==1)
			System.out.println(1);
		else
		{
			r_printn(n-1);
			System.out.println(n);
		}
	}

}