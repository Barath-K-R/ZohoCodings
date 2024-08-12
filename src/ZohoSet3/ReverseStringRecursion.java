/*Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I */

package ZohoSet3;

import java.util.Scanner;

public class ReverseStringRecursion {

	static String reverse(int start,String s,String s2) {
		int end=0;
		for(int i=start;i<s.length();++i)
		{
			
			if(s.charAt(i)==' ')
			{
				end=i-1;
				s2=reverse(i+1,s,s2);
				return s2+" "+s.substring(start,end+1);
			}
			if(i==s.length()-1)
			{
				end=i+1;
				return s2+s.substring(start,end);
			}
		}
		return s2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string s");
		String s=sc.nextLine(),s2="";
		s2=reverse(0,s,s2);
        System.out.println(s2);
	}

}
