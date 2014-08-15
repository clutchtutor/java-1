import java.util.*;
import java.lang.Math;
class minheap
{
	static int heapsize;
	static int[] minheapify(int[] a,int i)
	{
		int left,right,min,t;
		left=2*i;
		right=2*i+1;
		if(left<=heapsize && a[left]>a[i])
			min=i;
		else
			min=left;
		if(right<=heapsize && a[right]<a[min])
			min=right;
		if(min != i)
		{
			t=a[i];
			a[i]=a[min];
			a[min]=t;
			minheapify(a,min);
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		System.out.print("Enter the no. of elements : ");
		int n;
		n=o.nextInt();
		int i,j;
		int b[]=new int[n+1];
		int c[]=new int[n+1];
		for(i=1;i<=n;i++)
			b[i]=o.nextInt();
		heapsize=b.length-1;
		for(i=(int)(Math.floor(n/2));i>=1;i--)
			c=minheapify(b,i);
		for(i=1;i<=n;i++)
			System.out.print(c[i]+" ");
	}
}