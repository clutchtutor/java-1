import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n,i,j;
        n=o.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=o.nextInt();
        int b[]=new int[n];
        for(i=0;i<n;i++)
            b[i]=101;
        for(i=0;i<n;i++)
        {
            int k=a[i],flag=0;
            for(j=0;j<n;j++)
            {
                if(a[j]==k && j!=i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                b[i]=k;
        }
        for(i=0;i<n;i++)
        {
            if(b[i]!=101)
                System.out.print(b[i]+" ");
        }
    }
}