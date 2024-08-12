import java.util.Scanner;

public class ZohoModels_7 {
    public static int check(String s1,String s2,int firstindex,int lastindex) {
    	if(firstindex==-1)
    		firstindex=0;
    	for(int i=firstindex;i<=lastindex;++i)
        {
    		
            if(s2.charAt(i)<s1.charAt(i))
            {
            	return 0;
            }
            else if(s2.charAt(i)>s1.charAt(i))
            	return 1;
            else
            	continue;
        }
    	return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("s1 and s2 values");
		String s1=sc.nextLine(),s2=sc.nextLine();
        String temps=" ",dot=".";
        int res=-1;
        int firstindex=0,lastindex=0;
        firstindex=s1.indexOf(temps);
        lastindex=s1.lastIndexOf(dot);
       
        //function call
        res=check(s1,s2,firstindex,lastindex);
        
        if(res==1)
        {
        System.out.println("Upgraded");
        }
        else if(res==0)
        System.out.println("downgraded");
        else 
        {
        	if(Integer.parseInt(s2.substring(lastindex+1,s2.length()))>Integer.parseInt(s1.substring(lastindex+1,s1.length())))
        	System.out.println("Upgraded");
        	else
        		System.out.println("Downgraded");
        	
        }
        
        
        
        
	}

}
