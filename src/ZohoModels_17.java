import java.util.Scanner;

public class ZohoModels_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n value");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("array values");
		for(int i=0;i<n;++i)
          a[i]=sc.nextInt();
		for(int j=0;j<n;++j)
		{
			int sum=0,multiply=1,temp=a[j];
			
			while(temp>0)
			{
				sum=sum+(temp%10);
				multiply=multiply*(temp%10);
				temp=temp/10;
			}
			if(sum>multiply)
				a[j]=sum;
			else
				a[j]=multiply;
		}
		for(int res:a)
			System.out.println(res);
	}

}
