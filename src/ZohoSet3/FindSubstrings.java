package ZohoSet3;

import java.util.Scanner;

public class FindSubstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string s");
		String s=sc.nextLine(),test=sc.nextLine();
		int t=0,occ=-1;
        for(int k=0;k<s.length();++k)
        {
        	if(t==test.length())
        	{
        		
        		break;
        	}
        	if(s.charAt(k)==test.charAt(t))
        	{
        		if(t==0)
        			occ=k;
        	   t++;
        	}
        	else
        	{
        		t=0;
        		occ=-1;
        	}
        		
        	
        }
        if(!(t==test.length()))
        	occ=-1;
        System.out.println("occurence="+occ);
	}

}
