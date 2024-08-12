package ZohoSet3;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArraysNotRepeated {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a[]= {8,9,10,13},b[]= {2,3,4,5,6},aindex=0,bindex=0,max,min;
		ArrayList<Integer>res=new ArrayList<Integer>();
        
        
		while(aindex<a.length || bindex<b.length)
		{
			if(aindex<a.length && bindex<b.length)
			{
				if(a[aindex]<b[bindex])
				{
					if(!res.contains(a[aindex]))
						res.add(a[aindex++]);
				}
				else if(b[bindex]<a[aindex])
				{
					if(!res.contains(b[bindex]))
						res.add(b[bindex++]);
				}
				else if(a[aindex]==b[bindex])
				{

					if(!res.contains(a[aindex]))
					{
						res.add(a[aindex]);
						aindex++;
						bindex++;
					}
							
				}
				
			}
			else
			{
				if(aindex>=a.length)
				{
					if(!res.contains(b[bindex]))
						res.add(b[bindex++]);
				}
				else if(bindex>=b.length)
				{
					if(!res.contains(a[aindex]))
						res.add(a[aindex++]);
				}
			}
			System.out.println("aindex="+aindex+" "+"bindex="+bindex);
		}
		for(int num:res)
			System.out.print(num+" ");
	}

}
