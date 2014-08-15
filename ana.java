import java.io.*;
class ana
{
	public static void main(String[] args) 
	{
		BufferedReader o=new BufferedReader(new InputStreamReader(System.in));
		int n,i,e;
		n=Integer.parseInt(o.readLine());
		String a[]=new String[n];
		for(i=0;i<n;i++)
			a[i]=o.readLine();
		for(i=0;i<n;i++)
		{
			int l=a[i].length();
			if(l%2==0)
			{
				d=l/2;
				char c[]=new char[l];
				for(j=0;j<d;j++)
					c[j]=a[i].charAt(j);
				for(j=d;j<l;j++)
					c[j]=a[i].charAt(j)
				for(j=0;j<d;j++)
				{
					for(i=d;i<l;i++)
					{
						if(c[j]==c[i])
							continue
						else
							e++;
				}
			}
		}
		System.out.print(e);
	}
}