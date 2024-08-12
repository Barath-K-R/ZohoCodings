import java.util.Scanner;

public class ZohoModels_3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("n value");
        int n=sc.nextInt(),a[]=new int[n],leftsum=0,rightsum=0,equilibriumindex=-1;
        System.out.println("a values");
        for(int i=0;i<n;++i)
            a[i]=sc.nextInt();
        for(int j=1;j<n-1;++j)
        {
            leftsum=0;
            rightsum=0;
            
            for(int j1=0;j1<j;++j1)
            {
               leftsum=leftsum+a[j1];
               
            }
            
            for(int j2=j+1;j2<n;++j2)
            {
               rightsum=rightsum+a[j2];
               
            }
            
            
            if(leftsum==rightsum)
            equilibriumindex=j;
        }
        
        System.out.println(equilibriumindex);
    }
}
