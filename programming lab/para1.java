import java.lang.*;
import java.util.*;
class para1
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		String a;
		a=o.nextLine();
		char str[]=a.toCharArray();
		int b;
		b=a.length();
		str[0]=Character.toUpperCase(str[0]);
		for(int i=1;i<b-1;i++)
		{
			if(Character.isWhitespace(str[i])|| (str[i]=='.'))
			{
				str[i+1]=Character.toUpperCase(str[i+1]);
			}
		}
		System.out.print(str);
	}
}