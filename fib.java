import java.util.*;
import java.math.BigInteger;
class fib
{
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		int n,i,j,flag;
		n=o.nextInt();
		BigInteger a[]=new BigInteger[n];
		BigInteger x,y,t;
		for(i=0;i<n;i++)
			a[i]=o.nextBigInteger();
		for(i=0;i<n;i++)
		{
			x=BigInteger.ZERO;
			y=BigInteger.ONE;
			flag=0;
			for(j=0;j<1010;j++)
			{
				if(a[i].compareTo(x)==0)
				{
					System.out.println("IsFibo");
					flag=1;
					break;
				}
				t=y.add(x);
				x=y;
				y=t;
			}
			if(flag==0)
				System.out.println("IsNotFibo");
		}
	}
}