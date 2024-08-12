/*Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid */


package ZohoSet2;

import java.util.Scanner;
import java.util.Stack;

public class ValidMathematicalExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character>st=new Stack<Character>(),st2=new Stack<Character>();
		System.out.println("enter string s");
		String s=sc.nextLine();
		int res=1;
		for(int i=0;i<s.length();++i)
		{
			if(s.charAt(i)=='(')
			{
				if(!st2.isEmpty())
				{
					res=0;
					break;
				}
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')' )
			{
				if(!st2.isEmpty())
				{
					res=0;
					break;
				}
				if(!st.isEmpty() && st.peek()=='(')
			     st.pop();
				else
				{
					res=0;
					break;
				}
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				if(st2.isEmpty())
					st2.push(s.charAt(i));
			    else if(st2.peek()>=33 && st2.peek()<=47)
				{
					st2.pop();
				}
				else
				{
					res=0;
					break;
				}
			}
			else if(s.charAt(i)>=33 && s.charAt(i)<=47)
			{
				if(!st2.isEmpty() && st2.peek()>=97 && st2.peek()<=122)
				{
					st2.pop();
					st2.push(s.charAt(i));
				}
				else 
				{
					res=0;
					break;
				}
			}
		}
		if(res==1 && st.isEmpty())
			System.out.println("final valid");
		else if(!st.isEmpty() || res==0)
			System.out.println("final invalid");

	}

}
