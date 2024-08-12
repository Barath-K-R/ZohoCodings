import java.util.Scanner;

public class ZohoModels_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n value");
		int n=sc.nextInt();
		int [][]a=new int[n][n];
		System.out.println("array values");
		for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
				a[i][j]=sc.nextInt();
		for(int k=0;k<n;++k)
		{
			for(int l=0;l<n;++l)
			{
				int tempk=k,templ=l;
				if(k==0 || k==n-1 || l==0 || l==n-1)
					continue;
				else
				{
					if(a[--tempk][templ]==-1 && a[++tempk][++templ]==-1 && a[++tempk][--templ]==-1 && a[--tempk][--templ]==-1)
						System.out.println(k+" and "+l);
					
				}
			}
		}
	}

}
