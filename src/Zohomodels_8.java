import java.util.Scanner;

public class Zohomodels_8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("n value");
		 int n=sc.nextInt();
		 System.out.println("array values");
		 int a[]=new int[n];
		 for(int k=0;k<n;++k)
			 a[k]=sc.nextInt();
		 long powerSet = (long) Math.pow(2, n);

			// Running a counter loop form 0 to to powerSet.
			for (int counter = 0; counter < powerSet; counter++) {
				for (int i = 0; i < n; i++) {
					// if the i-th bit is set then print the i-th element
					if ((counter & (1 << i)) > 0)
						System.out.print(a[i] + " ");
				}
				System.out.println();
			}

	}

}
