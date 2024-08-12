/*
         Input  : {1, 2, 3, 4, 5, 6, 7}
         Output : {7, 1, 6, 2, 5, 3, 4} 
 */

package ZohoSet2;

public class AlternateSorting {

	public static void main(String[] args) {
		int a[]= {3,4,2,1,6,5},b[]=new int[a.length],start=0,end=a.length-1,index=0;
		for(int i=0;i<a.length;++i)
		{
			for(int j=0;j<a.length-1;++j)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
       for(int k=0;k<=a.length/2;++k)
       {
    	   if(start==end)
    	   {
    		   b[index]=a[start];
    		   break;
    	   }
    	   else if(start>end)
    		   break;
    	   b[index++]=a[end--];
    	   b[index++]=a[start++];
    	   System.out.println("index="+index+" "+"start="+start+" "+"end="+end);
       }
       for(int num:b)
    	   System.out.println(num);
	}

}
