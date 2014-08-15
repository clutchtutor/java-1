import java.util.*;
import java.lang.Math;
class binaryheap
{
	static int heapsize;	
	static int[] maxheapify(int[] a,int i)
	{
		int largest,t,l,r;
		l=2*i;
		r=2*i+1;
		if(l<heapsize && a[l]>a[i])
			largest=l;
		else
			largest=i;
		if(r<heapsize && a[r]>a[largest])
			largest=r;
		if(largest!=i)
		{
			t=a[i];
			a[i]=a[largest];
			a[largest]=t;
			maxheapify(a,largest);
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		int i,n;
		System.out.print("Enter the no. of elements : ");
		n=o.nextInt();
		int b[]=new int[n+1];
		int c[]=new int[n+1];
		System.out.println("Enter the elements");
		for(i=1;i<=n;i++)
			b[i]=o.nextInt();
		heapsize=b.length-1;
		for(i=(int)(Math.floor(n/2));i>=1;i--)
			c=maxheapify(b,i);
		for(i=1;i<=n;i++)
			System.out.print(c[i]+" ");
	}
}