/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Evaluating postfix expression using stacks

import java.util.Stack;
public class PostFix{
	public static void main(String[] args){
		String exp = "231*+9-";
		System.out.println(evaluate(exp));
		
	
	}

	public static int evaluate(String exp)
	{
		Stack<Integer> S = new Stack<>();

		for(int i =0;i<exp.length();i++)
		{
			char c = exp.charAt(i);

			if(Character.isDigit(c))
				S.push(c -'0');
			else
			{
				int a = S.pop();
				int b = S.pop();

				switch(c)
				{
					case '+':
					S.push(a+b);
					break;

					case '-':
					S.push(a-b);
					break;

					case '/':
					S.push(a/b);
					break;

					case '*':
					S.push(a*b);
					break;
				}
			}
		}
		return S.pop();
	}
}

//exp = "234*+""

//[2 3 4]
		//a = 4
		//[2 3]
		//b = 3
		//[2]
		//[2 12]
		//a= 12
		//b=2
		//[]
		//[14]