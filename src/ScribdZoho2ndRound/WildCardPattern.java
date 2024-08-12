package ScribdZoho2ndRound;

import java.util.Scanner;

public class WildCardPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string s");
		String s=sc.nextLine();
		System.out.println("enter the string pattern");
		String pattern=sc.nextLine();
		int sindex=0,pindex=0,bool=0,smatch=0,pmatch=0;
		Character c='$';
		while(pindex!=pattern.length() && sindex!=s.length())
		{
			if(pindex!=0 && pattern.charAt(pindex-1)=='*' && pattern.charAt(pindex)!='*')
			{
				pmatch=pindex;
				smatch=sindex;
			}
			System.out.println("sindex="+sindex+" "+"pindex="+pindex);
			if(pattern.charAt(pindex)=='*')
			{
				System.out.println("*");
			    while(pattern.charAt(pindex)=='*')
			    pindex++;
			    c='*';
			    bool=1;
			}
			else if(pattern.charAt(pindex)=='?')
			{
				System.out.println("?");
				if(pattern.charAt(pindex-1)=='*')
				{
					smatch=sindex;
					pmatch=pindex;
					
				}
				sindex++;
				pindex++;
				c='?';
				bool=1;
			}
			else if(s.charAt(sindex)==pattern.charAt(pindex))
			{
				System.out.println("matched");
				if(c=='*')
				{
				smatch=sindex;
				pmatch=pindex;
				}
				else if(bool==0 && c=='$')
				{
					smatch=sindex;
					pmatch=pindex;
				}
				sindex++;
				pindex++;
				bool=1;
			}
			
			else if(bool==1 && (s.charAt(sindex)!=pattern.charAt(pindex)))
			{
				System.out.println("unmatched bool="+bool);
				if(c=='*')
				{
					sindex=smatch+1;
					pindex=pmatch;
				}
				else if(c=='?')
				{
					bool=0;
					break;
				}
				else if(c=='$' && bool==1)
				{
					bool=0;
					sindex=smatch+1;
					pindex=pmatch;
				}
				else if(bool==0 && c=='$')
				{
					pindex++;
					sindex++;
				}
				
			}
			else if(bool==0 && (s.charAt(sindex)!=pattern.charAt(pindex)))
			{
				System.out.println("unmatched bool="+bool);
				break;
				
			}
			
				
			
		}
		if(bool==0)
			System.out.println("false");
		else if(bool==1 && pindex>=pattern.length())
			System.out.println("true");
		else
			System.out.println("false");

	}

}
