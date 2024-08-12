import java.util.ArrayList;
import java.util.Scanner;

public class ZohoModels_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n and sum value");
		int n=sc.nextInt(),sum=sc.nextInt(),sum1=0;
		int[]a=new int[n];
		
		System.out.println("arrayvalues");
		for(int j=0;j<n;++j)
			a[j]=sc.nextInt();
		
		long powerSet = (long) Math.pow(2, n);

		// Running a counter loop form 0 to to powerSet.
		for (int counter = 0; counter < powerSet; counter++) {
			ArrayList<Integer>temp=new ArrayList<Integer>();
			sum1=0;
			for (int i = 0; i < n; i++) {
				// if the i-th bit is set then print the i-th element
				if ((counter & (1 << i)) > 0)
				{
					sum1=sum1+a[i];
					temp.add(a[i]);
					
				}
			}
			if(sum1==sum)
			{
			for(int b=0;b<temp.size();++b)
			{
				System.out.print(temp.get(b)+" ");
			}
			System.out.println();
			}
		
	}

	}
}
