/*Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.*/
import java.util.Scanner;

public class ZohoModels_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n and m value");
        int n = sc.nextInt(), m = sc.nextInt(),a[][] = new int[n][m],r1=0,r2=n-1,c1=0,c2=m-1;
        System.out.println("array values");
        for (int i1=0;i1< n; ++i1) {
            for (int i2 = 0; i2 < m; ++i2) {
                a[i1][i2]=sc.nextInt();
            }
        }
        
        

        for (int i3=0;i3< n; ++i3) {
            for (int i4 = 0; i4 < m; ++i4) {
                System.out.println("i3 and i4="+i3+" "+i4);
                    r1=i3-1;
                    r2=i3+1;
                    c1=i4-1;
                    c2=i4+1;
              System.out.println("r1 and r2="+r1+" & "+r2+" c1 and c2="+c1+" & "+c2);
              
            //checking array for 1
            if(a[i3][i4]==1)
            {
                if(c1!=-1)
                a[i3][c1]=0;
                if(r1!=-1)
                a[r1][i4]=0;
                if(c2!=m )
                a[i3][c2]=0;
                if(r2!=n)
                a[r2][i4]=0;
                 
                
            }
            }
           
        }

        for(int j=0;j<n;++j)
        {
            for(int k=0;k<m;++k)
            {
                System.out.print(a[j][k]);
            }
            System.out.println();
        }
        
        }
}
