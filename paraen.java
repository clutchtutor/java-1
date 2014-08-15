import java.util.*;
import java.io.*;
class paraen
{
	public static void main(String[] args)throws IOException 
	{
		Stack<Character> stk=new Stack<Character>();
		BufferedReader o=new BufferedReader(new InputStreamReader(System.in));
		int b,i,g,l,j;
		b=Integer.parseInt(o.readLine());
		String a[]=new String[b];
		for(i=0;i<b;i++)
			a[i]=o.readLine();
		for(i=0;i<b;i++)
		{
			g=0;l=0;
			int c=a[i].length();
			for(j=0;j<c;j++)
			{
				if(a[i].charAt(j)=='(')
					stk.push(a[i].charAt(j));
				else if(a[i].charAt(j)==')' && !stk.empty())
					stk.pop();
				else
					g++;
			}
			while(!stk.empty())
			{
				l++;
				stk.pop();
			}
			System.out.println(g+l);
		}
	}
}
