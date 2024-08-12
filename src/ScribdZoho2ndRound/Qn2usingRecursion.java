/*Given an input string and a dictionary of words, find out if the input string can besegmented into a space-separated sequence of dictionary words. See following examplesfor more details.
 * Consider the following dictionary{ i, like, sam, sung, samsung, mobile, ice,cream, icecream, man, go, mango}
 * 
 * Input: ilike
 * Output: YesThe string can be segmented as "i like".
 * Input: ilikesamsung
 * Output: YesThe string can be segmented as "i like samsung"or "i like sam sung".
3.Print the following pattern
13 26 5 410 9 8 710 9 8 76 5 43 2

 * */

package ScribdZoho2ndRound;

import java.util.Scanner;

public class Qn2usingRecursion {
	public static String [] dictionary= {"i","like","sam","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};
	static int wordcheck(int sindex,int dictionaryindex,String s)
	{
		if(sindex>=s.length())
			return sindex;
		int i=0,k=0,smatch=0,out=0;
		for( i=dictionaryindex;i<dictionary.length;++i)
		{
			if(dictionary[i].charAt(0)==s.charAt(sindex))
			{
				System.out.println(dictionary[i].charAt(0)+" matched with "+s.charAt(sindex));
				smatch=sindex;
				System.out.println(dictionary[i]);
				for( k=0;k<dictionary[i].length();++k)
				{
					
					if(sindex<s.length() && (s.charAt(sindex++)!=dictionary[i].charAt(k)))
					{
						System.out.println(s.charAt(sindex-1)+" not matched "+dictionary[i].charAt(k));
						break;
					}
					else if(sindex>s.length())
					{
						
						return -1;
					}
					System.out.println(s.charAt(sindex-1)+" matched with "+dictionary[i].charAt(k));
				}
				System.out.println("k="+k+" and "+dictionary[i].length());
				if(k>=dictionary[i].length())
				{
					sindex=wordcheck(sindex,0,s);
					if(sindex!=-1 && sindex<s.length())
					{
						sindex=smatch;
						System.out.println("sindex="+sindex);
						continue;
					}
					else
					{

						System.out.println("returning "+"sindex="+sindex);
						return sindex;
					}
					
				}
				else
				{
					sindex=smatch;
					continue;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] dictionary= {"i","like","sam","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};
		System.out.println("enter the string s");
		String s=sc.nextLine();
		int dictionaryindex=0,smatch=0,sindex=0,bool=1,i=0,k=0;
	    int res=wordcheck(sindex,dictionaryindex,s);
	    if(res>=s.length())
	    	System.out.println("true");
	    else
	    	System.out.println("false");
		
		

	}

}
