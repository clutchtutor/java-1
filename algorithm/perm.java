import java.io.*;
class perm
{
	static void permute(char[] a,int k,int f)
	{
		int i;
		char t;

		if(k==f)
		{
			System.out.println(a);
		}
		else
		{
			for(i=k;i<f;i++)
			{
				t=a[k];
				a[k]=a[i];
				a[i]=t;
				permute(a,k+1,f);
				t=a[k];a[k]=a[i];a[i]=t;
			}
		}
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader	obj=new BufferedReader(new InputStreamReader(System.in));
		int n,i;
		String g;
		g=obj.readLine();
		char b[]=g.toCharArray();
		n=g.length();
		System.out.println("Output is: ");
		permute(b,0,n);
	}
}