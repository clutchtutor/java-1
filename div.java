import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class div
{
	static int tot(String a)
	{
		char b[]=a.toCharArray();
		int c=a.length();
		int d=Integer.parseInt(a);		
		int e=0,i;
		for(i=0;i<c;i++)
		{
			int l=Character.getNumericValue(b[i]);
			if(l==0)
				continue;
			else if(d%l==0)
				e++;
		}
		return e;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader o=new BufferedReader(new InputStreamReader(System.in));
		int n,i;
		n=Integer.parseInt(o.readLine());
		String a[]=new String[n];
		int f[]=new int[n];
		for( i=0;i<n;i++)
		{
			a[i]=o.readLine();
		}
		for(i=0;i<n;i++)
		{
			f[i]=tot(a[i]);
			System.out.println(f[i]);
		}
	}
}