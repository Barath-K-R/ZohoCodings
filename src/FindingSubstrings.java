//put string="welcometozohocorporation" in two dimensional array 
//w e l c o 
//m e t o z
//o h o c o
//r p o r a
//t i o n
// and find the substring too in vertical side
import java.util.Scanner;
public class FindingSubstrings
{
	public static void main(String[] args) {
	    Scanner se=new Scanner(System.in);
	    System.out.println("s and sample value");
	    String s=se.nextLine();
	    
	    String sample=se.nextLine();
	    System.out.println("n and m value");
	    int n=se.nextInt(),m=se.nextInt(),i=0,sampindex=0,temp=0;
	    int rs1=0,re1=0,rs2=0,re2=0;
	    char[][] arr=new char[n][m];
	    
	      for(int j=0;j<n;++j)
	        {
	            for(int k=0;k<m;++k)
	            {
	                if(i>=s.length())
	                break;
	                arr[j][k]=s.charAt(i++);
	             }
	        }
	       
	         for(int l=0;l<m;++l)
	        {
	            for(int f=0;f<n;++f)
	            {
	                
	  
	                if(temp==sample.length())
	                break;
	                if(arr[f][l]==sample.charAt(sampindex))
	                {
	                    sampindex++;
	                    temp++;
	                    if(sampindex==1)
	                    {
	                        rs1=f;
	                        re1=l;
	                    }
	                    else if(sampindex==sample.length())
	                    {
	                        rs2=f;
	                        re2=l;
	                    }
	                    continue;
	                }
	                else{
	                    if(temp!=0)
	                    temp=0;
	                    sampindex=0;
	                }
	             }
	             if(temp==sample.length()-1)
	                break;
	        }
	        
	    System.out.println(rs1+" "+re1+" "+rs2+" "+re2);
	}
}