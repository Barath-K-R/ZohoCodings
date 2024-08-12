import java.util.Scanner;

public class ZigZag2DMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n value and m value");
		int n=sc.nextInt(),m=sc.nextInt();
		
		int a[][]=new int[n][m];
		int res=0,r=0,c=0,temp1=0,temp2=0,t1=0,t2=0;
		
		System.out.println("array values");
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
				a[i][j]=sc.nextInt();
		}
		
		
		System.out.println(a[r][c]);
		
		while(res!=a[n-1][m-1])
		{
			
			//one step right
			if(r==0 || r==n-1||c==m-1)
			{
				
				if(++c==m)
				{
					
					c--;
					r++;
					res=a[r][c];
				}
				else {
				
				res=a[r][c];
				}
			}
			
			if(res==a[n-1][m-1])
				break;
			
			//downwards loop
			temp1=c;
			t1=r;
			
			for(int i1=t1;i1<temp1;++i1)
			{
				
				System.out.println(a[r][c]);
				res=a[r][c];
				c--;
				r++;
				
			}
			res=a[r][c];
			if(res==a[n-1][m-1])
				break;
			System.out.println(a[r][c]);
			
			//one step down
			if(c==0 || c==m-1 ||r==n-1)
			{
				if((++r)==n)
				{
					r--;
					c++;
					res=a[r][c];
				}
				else
				{
				   res=a[r][c];
				}
			}
			if(res==a[n-1][m-1])
				break;
			
			//upward loop
			temp2=r;
			t2=c;
			
			for(int i2=t2;i2<temp2;++i2)
			{
				
				res=a[r][c];
				System.out.println(a[r][c]);
				r--;
				c++;
				
			}
			res=a[r][c];
			if(res==a[n-1][m-1])
				break;
			System.out.println(a[r][c]);
			
		}
		
        System.out.println(a[r][c]);
	}

}
