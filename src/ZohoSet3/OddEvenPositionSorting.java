/*Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
*/

package ZohoSet3;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenPositionSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  thr n value");
		int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>(),odd=new ArrayList<Integer>(),even=new ArrayList<Integer>();
        System.out.println("enter the arr avlues");
        for(int h=0;h<n;++h)
        	arr.add(sc.nextInt());
        
        for(int i=0;i<arr.size();++i)
        {
        	if(i%2!=0)
        		even.add(arr.get(i));
        	else
        		odd.add(arr.get(i));
        }
        
        for(int j=0;j<odd.size()-1;++j)
        {
        	for(int k=0;k<odd.size()-1;++k)
        	{
        		if(odd.get(k)<odd.get(k+1))
        		{
        			int temp=odd.get(k);
        			odd.set(k,odd.get(k+1));
        			odd.set(k+1, temp);
        			
        		}
        		if(even.get(k)>even.get(k+1))
        		{
        			int temp=even.get(k);
        			even.set(k,even.get(k+1));
        			even.set(k+1, temp);
        		}
        	}
        }
        int temp=0;
        for(int v=0;v<odd.size();v++)
        {
        	arr.set(temp++, odd.get(v));
        	arr.set(temp++, even.get(v));
        }
        for(int num:arr)
        	System.out.println(num);
        
	}

}
