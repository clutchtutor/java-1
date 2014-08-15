import java.util.*;
class pk1
{    
	
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		long test[]=new long[10000];
		String temp=new String();
		int i,t,n,k;
		long temp1;
		boolean trigger;

		for(i=0;i<10000;i++)
		{	temp=Integer.toBinaryString(i);
			temp1=Long.parseLong(temp);
			temp1*=9;
			test[i]=temp1;
		}
		t=o.nextInt();

		for(i=0;i<t;i++)
		{	trigger=false;
			n=o.nextInt();
			k=1;
			if(n==0)
			{
				System.out.println(n);
				continue;
			}
			while(trigger==false)
			{
				if(test[k]%n==0)
					{System.out.println(test[k]);
						trigger=true;
						break;


					}
				k++;
			}

		}

	}
}