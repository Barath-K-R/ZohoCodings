//remove duplicates in string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String value");
		String s=sc.nextLine();
		HashMap<String,Integer> map=new HashMap<>();
		int temp=0,i=0;
		
		while(i<s.length())
		{
			
			if(map.containsKey(s.substring(i,i+1)))
			{
				temp=map.get(s.substring(i,i+1));
				temp+=1;
				map.put(s.substring(i,i+1),temp);

			    if(temp>1)
			    {
			    	
			    	s=s.substring(0,i)+s.substring(i+1,s.length());
			    	
			    }
			}
			else
			{
				map.put(s.substring(i,i+1),1);
				i++;
			}
		}
		
		System.out.println(s);

	}

}
