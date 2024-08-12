/*Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd*/
     

package ZohoSet3;

import java.util.Scanner;

public class Set3_1 {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("string str");
		String str=sc.nextLine(),s=new String(),num="",result="";
		s=str.substring(0,1);
		for(int i=1;i<str.length();++i)
		{
			System.out.println("i="+i);
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
				
				num=num+str.substring(i,i+1);
				System.out.println("num="+num);
				if(i==str.length()-1)
				{
					for(int j=0;j<Integer.parseInt(num);++j)
	            	{
	            		result=result+s;
	            	}
				}
 	            
            }
            else if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {
            	for(int j=0;j<Integer.parseInt(num);++j)
            	{
            		result=result+s;
            	}
            	s=str.substring(i,i+1);
            	num="";
            }
            
		}
		System.out.println(result);
		}
}

