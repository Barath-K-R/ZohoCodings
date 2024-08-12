/*Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s */
package ZohoSet3;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int r=0,c=s.length()-1;
		for(int i=0;i<s.length();++i)
		{
			for(int j=0;j<s.length();++j)
			{
				
				if(((i==r) && (j==r)) || ((i==r) && (j==c)) || ((i==c) && (j==r)) || ((i==c) && (j==c)))
				{
					System.out.print(s.charAt(j)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			r++;
			c--;
			System.out.println();
		}

	}

}
