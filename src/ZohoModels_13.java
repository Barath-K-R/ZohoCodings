import java.util.Scanner;

public class ZohoModels_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("s value");
		String s=sc.nextLine();
		for(int i=0;i<s.length();++i)
		{
			for(int j=0;j<s.length();++j)
			{
				if(i==j)
					System.out.print(s.charAt(j));
				else if(i+j==s.length()-1)
				{
					System.out.print(s.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
