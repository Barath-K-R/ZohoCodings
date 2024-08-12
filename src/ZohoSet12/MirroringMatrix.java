/*
  1-vertical
 2-horizontal
*/
package ZohoSet12;

import java.util.Scanner;

public class MirroringMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int b[][]= {{21,22,23,24,25},{16,17,18,19,20},{11,12,13,14,15},{6,7,8,9,10},{1,2,3,4,5}};
		int[][] res=new int[n][n];
		System.out.println("enter the rot");
		int rot=sc.nextInt(),r1=0,c1=0,temp1=n-1,temp2=n-1,bool=1;
		for(int i=0;i<n;++i)
		{
			temp1=n-1;
			for(int j=0;j<n;++j)
			{
				if(rot==1)
				{
					r1=i;
					c1=temp1--;
				}
				else if(rot==2)
				{
					r1=temp2;
					c1=j;
				}
				res[r1][c1]=a[i][j];
			}
			temp2--;
		}
		
		for(int k=0;k<n;++k)
		{
			System.out.println();
			for(int l=0;l<n;++l)
			{
				if(b[k][l]!=res[k][l])
				{
					System.out.println(b[k][l]+" "+res[k][l]);
				  bool=0;
				}
				System.out.print(res[k][l]+" ");
				
				
			}
		}
		if(bool==0)
			System.out.println("false");
		else
			System.out.println("true");
        
	}

}
