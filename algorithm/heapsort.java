import java.util.*;
import java.lang.Math;
class heapsort
{
	static int heapsize;
	static int[] build(int[] a,int n)
	{
		int i;
		int d[]=new int[n+1];
		heapsize=a.length-1;
		for(i=(int)(Math.floor(n/2));i>=1;i--)
			d=maxheapify(a,i);
		return d;
	}
	static int[] maxheapify(int[] b,int i)
	{
		int largest,t,l,r;
		l=2*i;
		r=2*i+1;
		if(l<=heapsize && b[l]>b[i])
			largest=l;
		else
			largest=i;
		if(r<=heapsize && b[r]>b[largest])
			largest=r;
		if(largest!=i)
		{
			t=b[i];
			b[i]=b[largest];
			b[largest]=t;
			maxheapify(b,largest);
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter no. of elements : ");
		n=o.nextInt();
		System.out.println("Enter the numbers :");
		int c[]=new int[n+1];
		int e[]=new int[n+1];
		int f[]=new int[n+1];
		for(i=1;i<=n;i++)
			c[i]=o.nextInt();
		e=build(c,n);
		heapsize=e.length-1;
		for(i=n;i>=2;i--)
		{
			j=e[i];
			e[i]=e[1];
			e[1]=j;
			heapsize--;
			f=maxheapify(e,1);
		}
		for(i=1;i<=n;i++)
			System.out.print(f[i]+" ");
	}
}