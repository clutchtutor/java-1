import java.lang.*;
import java.io.*;
class para
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		String a;
		System.out.println("Enter the paragraph :");
		a=obj.readLine();
		int l,i,j,c;
		char b;
		l=a.length();
		char d[]=new char[l];
		int temp[]=new int[l];
		if(a.charAt(0)>96 && a.charAt(0)<123)
		{
			d[0]=a.charAt(0);
			temp[0]=1;
			c=a.charAt(0);
			c=c-32;
			d[0]=(char)c;
		}
		for(i=1;i<l-1;i++)
		{
			b=a.charAt(i);
			if(Character.isWhitespace(b))
			{
				if(a.charAt(i+1)>96 && a.charAt(i+1)<123)
				{
					d[i+1]=a.charAt(i+1);
					temp[i+1]=1;
					c=a.charAt(i+1);
					c=c-32;
					d[i+1]=(char)c;
				}
				else
					continue;
			}
		}
		for(i=0;i<l;i++)
		{
			if(temp[i]==1)
				System.out.print(d[i]);
			else
				System.out.print(a.charAt(i));
		}
		System.out.println();
	}
}