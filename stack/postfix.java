/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Evaluating postfix expression using stacks

import java.util.Stack;
public class postfix{
	public static void main(String[] args){
		String exp = "234*+";
		System.out.println(evaluate(exp));

	
	}
	public static int evaluate(String exp){
		Stack<Integer> S = new Stack<>();

		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);

			if(Character.isDigit(c))
				S.push(Character.getNumericValue(c));
			else
			{
				int a = S.pop();
				int b = S.pop();

				switch(c){
					case '+':
					S.push(a+b);
					break;

					case '-':
					S.push(a-b);
					break;
					
					case '*':
					S.push(a*b);
					break;
					
					case '/':
					S.push(a/b);
					break;
					
				}
			}
		}
		return S.pop();
	}


	
}

// infix
// 2+(3*4) = 14
// (2+3)*4 = 20

// 2+3*4 = 14

// prefix
// +*234
// postfix
// 234*+
// S = [2 3 4]
// a= 4
// b =3
// S = [2]
// 3*4 =12
// S = [2 12]
// a= 12
// b=2
// S = []
// 2+12=14
// S = [14]


