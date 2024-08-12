import java.util.Scanner;

public class ZohoModels_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] n=new int[1000][1000];
		System.out.println("x ,y");
		int r=sc.nextInt(),c=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;++i)
		{
			if(s.charAt(i)=='U')
				r--;
			else if(s.charAt(i)=='D')
				r++;
			else if(s.charAt(i)=='L')
				c--;
			else if(s.charAt(i)=='R')
				c++;
				
		}
		System.out.println(r+" "+c);
		
		

	}

}


