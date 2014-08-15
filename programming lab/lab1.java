import java.util.Scanner;
public class lab1 {
    
    public static void main(String args[]){
    	Scanner input = new Scanner(System.in);
    	int n;
    	System.out.println("Enter the nos of vertices :");
    	n=input.nextInt();
    	int a[][] = new int[n+1][n+1];
    	int b[] = new int[n+1];
    	int v[] = new int[n+1];
    	int i,j,p=1,q,x=1,c=0;
        System.out.println("Enter the adjacency matrix: ");
    	for(i=1;i<=n;i++)
    	{
    		for(j=1;j<=n;j++)
    		{
    			a[i][j]=input.nextInt();
    		}
    	}
    	v[1]=1;
    	b[1]=1;
    	System.out.print("1" +" ");
    	while(p<n)
    	{
    		q=b[p];
    		for(i=1;i<=n;i++)
    		{
    			if(a[q][i]==1&&v[i]==0)
    			{
    				System.out.print(i + " ");
    				x++;
    				b[x]=i;
    				v[i]=1;
    			}
    		}
    		p++;
    	}
    }
}