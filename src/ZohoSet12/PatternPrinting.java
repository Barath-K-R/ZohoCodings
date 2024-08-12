/*for n = 6
	1	7	12	16	19	21
	2	8	13	17	20
3	9	14	18	
4	10	15
5	11	
6 */


package ZohoSet12;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6,num=1,t1=0,t2=0;
		int[][] res=new int[n][n];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n-i;++j)
			{
				if((i==0 && j==0)||(i==0 && j==1))
				{
					if(i==0 && j==0)
					{
					    t1=num++;
					    System.out.println("t1="+t1);
					}
					else if(i==0 && j==1)
					{
					    t2=num++;
					    System.out.println("t2="+t2);
					}
					
					continue;
				}
				else if(j==0 || j==1)
				{ 
					if(j==0)
					{
					    res[j][i]=t1;
					    t1=num++;
					    System.out.println("t1="+t1);
					}
					else if(j==1)
					{
						res[j][i]=t2;
						t2=num++;
						System.out.println("t2="+t2);
					}
				}
				else
				{
					res[j][i]=num++;
					System.out.println("res[][]="+res[j][i]);
				}
			   
			}
		}
		for(int k=0;k<n;++k)
		{
			for(int l=0;l<n;++l)
			{
				System.out.print(res[k][l]+" ");
			}
			System.out.println();
		}
		
		
	}

}
