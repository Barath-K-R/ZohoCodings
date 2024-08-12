/*Input  : ((abc)((de))
  Output : ((abc)(de))  
  
  Input  : (((ab)
  Output : (ab)
  
  */
package ZohoSet2;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> st=new Stack<Character>();
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		System.out.println("string s");
		String s=sc.nextLine();
		ArrayList<Character>a=new ArrayList<Character>();
		for(int h=0;h<s.length();++h)
			a.add(s.charAt(h));
		for(int i=0;i<s.length();++i)
		{
			System.out.println("comes");
			if((s.charAt(i)=='(')||(s.charAt(i)==')'))
			{
				if(st.isEmpty())
				{
					System.out.println("comes1");
					st.push(s.charAt(i));
					arr.add(i);
					continue;
				}
				else if(st.peek()!=s.charAt(i))
				{
					System.out.println("comes2");
					arr.remove(arr.size()-1);
					st.pop();
				}
				else
				{
					System.out.println("comes3");
					st.push(s.charAt(i));
					arr.add(i);
				}
				System.out.println("end");
				System.out.println();
			}
		  
		}
		System.out.println(a.toString());
		for(int num:arr)
			System.out.println(num);
		int t=1;
		for(int p=0;p<arr.size();++p)
		{
			System.out.println("enters");
			if(p==0)
			{
				System.out.println(a.get(arr.get(p)));
			a.remove(arr.get(p));
			}
			else
				a.remove(arr.get(p)-(t++));
			System.out.println(a.toString());
		}
		
		System.out.println(a.toString());
		
	}
}
