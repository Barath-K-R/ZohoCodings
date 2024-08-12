import java.util.Scanner;

public class ZohoModels_16_1 {
    static int move(int[][] a,int r,int c,int n,int m)
    {
    	int tempr=r,tempc=c,res=0;
    	if(r==n-1 && c==m-1)
    	{
    		System.out.println("reached so returning 1");
    		return 1;
    	}
    	for(int p=0;p<n*n;++p)
    	{
    		System.out.println("enteres");
    		tempr=r;
			tempc=c;
			if(r==n-1 && c==m-1)
	    	{
	    		System.out.println("reached returning inside loop 1");
	    		return 1;
	    	}
			if(c==m-1 )
        	{
				
    			if(a[++tempr][tempc]==0)
        	    	return 0;
        	    else
        	    {
        	    	r++;
        	    	 System.out.println("r and c value="+r+" "+c);
        	    	continue;
        	    }
        	    	
        	}
        	else if(r== n-1)
        	{
        		
        	    if(a[tempr][++tempc]==0)
        	    	return 0;
        	    else
        	    {
        	    	c++;
        	    	 System.out.println("r and c value="+r+" "+c);
        	    	continue;
        	    }
        	}
        	else
        	{
        		if(a[tempr][++tempc]==0)
        		{
        			System.out.println("entered down");
        			if(a[++tempr][--tempc]==1)
        			{
        			   System.out.println("down move tempr and tempc values="+tempr+" "+tempc);
        			
        			   r++;
        			   System.out.println("r and c value="+r+" "+c);
        			   continue;
        			}
        			--tempr;
        			++tempc;
                    
        			System.out.println("tempr and tempc="+tempr+"  "+tempc);
        		}
        		else if(a[++tempr][--tempc]==0)
        		{
        			System.out.println("entered right");
        			if(a[--tempr][++tempc]==1)
        			{
        			   System.out.println("right move tempr and tempc values="+tempr+" "+tempc);
        			
        			   c++;
        			   System.out.println("r and c value="+r+" "+c);
        			continue;
        			}
        			
        		}
        		else if(a[tempr][tempc]==1)
        		{
        			System.out.println("entered call");
        			if(a[--tempr][++tempc]==1)
        			{
        			   System.out.println("right call tempr and tempc values="+tempr+" "+tempc);
        			   //right call
        			   res=move(a,tempr,tempc,n,m);
        			   
        			   System.out.println("r and c value="+r+" "+c);
        			   System.out.println("res="+res);
        			   if(res==1)
        			   {
        				   System.out.println("returning 1");
        				   return 1;
        			   }
        			   System.out.println("down  call tempr and tempc values="+tempr+" "+tempc);
        			   //down call
        			   res=move(a,++tempr,--tempc,n,m);
        			   
        			   System.out.println("r and c value="+r+" "+c);
        			   if(res==1)
        				   return 1;
        			 return 0;
        			}
        			tempr=r;
        			tempc=c;
        		}
        		else if(a[tempr][tempc]==0)
        		{
        			System.out.println("entered zero checking");
        			if(a[++tempr][--tempc]==0)
        			{
        			  System.out.println("return tempr and tempc values="+tempr+" "+tempc);
        			  System.out.println("r and c value="+r+" "+c);	
        			  return 0;
        			}
        			tempr=r;
        			tempc=c;
        		}
        	}
			
        }
		return 0;
}
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n and m value");
		int n=sc.nextInt(),m=sc.nextInt();
		int r=0,c=0,res=0;
		int array[][]=new int[n][m];
		System.out.println("array values");
		for(int j=0;j<n;++j)
		{
			for(int b=0;b<m;++b)
				array[j][b]=sc.nextInt();
		}
		res=move(array,r,c,n,m);
		
		if(res==1)
			System.out.println("reached");
		else 
			System.out.println("not raeched");

	}

}
