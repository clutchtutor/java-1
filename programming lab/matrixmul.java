import java.util.*;
class mul
{
	int k;
	synchronized void multiply(int n,int[][] a,int[][] b,int i,int[][] c)
	{
		try
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=0;
				for(k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+"	");
			}
			System.out.println();
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is interrupted");
		}
	}
}
class mat implements Runnable
{
	int m;
	int a[][];
	int b[][];
	Thread t;
	mul target;
	mat(int n,mul targ,int[][] x,int[][] z)
	{	
		m=n;
		a=x;
		b=z;
		target=targ;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		int c[][]=new int[m][m];
		for(int i=0;i<m;i++)
		{
			target.multiply(m,a,b,i,c);
		}
	}
}
class matrixmul
{
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int n,i,j;
		n=o.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		System.out.println("Enter matrix A: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=o.nextInt();
			}
		}
		System.out.println("Enter Matrix B: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=o.nextInt();
			}
		}
		System.out.println("Result is: ");
		mul o1=new mul();
		mat o2=new mat(n,o1,a,b);
		try
		{
			o2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is interrupted");
		}	
	}
}