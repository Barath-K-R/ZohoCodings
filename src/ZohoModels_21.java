import java.util.Scanner;

public class ZohoModels_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n values");
		int n=sc.nextInt(),temp=1,num=n;
		for(int i=0;i<n;++i)
		{
			if(i%2==0)
			{
				for(int j=0;j<n;++j)
				{
					System.out.print(temp);
					temp++;
				}
				num=num+4;
				temp=num;
				System.out.println();
			}
			else
			{
				for(int k=0;k<n;++k)
				{
					System.out.print(temp);
					temp--;
				}
				num=num+4;
				temp=num-4+1;
			}
		}

	}

}
