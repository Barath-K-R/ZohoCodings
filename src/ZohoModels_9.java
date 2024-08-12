import java.util.Scanner;

public class ZohoModels_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("s value");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		char temp=0;
		
		int len=c.length-1,i=0;
		while(i<len)
		{
			
			temp=c[i];
			c[i]=c[len];
			c[len]=temp;
			--len;
			++i;
		}
       s=String.valueOf(c);
       System.out.println(s);
	}

}
