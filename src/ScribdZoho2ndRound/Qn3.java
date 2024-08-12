package ScribdZoho2ndRound;

import java.util.Scanner;

public class Qn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=15,start=1,end=0,temp=1,spaces=3,tspaces=spaces;
		start=end+(temp++);
		while(start<=num)
		{
			
			if(tspaces>0)
			{
				
				System.out.print(" ");
				tspaces--;
				continue;
			}
			for(int i=start;i>end;--i)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			end=start;
			start=start+(temp++);
			
			tspaces=--spaces;
		}
		
		start=num;
		temp=temp-2;
		end=num-(temp--);
		spaces=0;
		tspaces=1;
		while(start>0)
		{
			if(tspaces<spaces)
			{
				
				System.out.print(" ");
				tspaces++;
				continue;
			}
			for(int i=start;i>end;--i)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			start=end;
			end=end-(temp--);
			spaces++;
			tspaces=0;
			
		}

	}

}
