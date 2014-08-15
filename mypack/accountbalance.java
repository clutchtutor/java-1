package mypack;
public class balance
{
	String n;
	double amt;
	public balance(String a,double b)
	{
		n=a;
		amt=b;
	}
	public void show()
	{
		if (amt<0)
			System.out.println("-->");
		else
			System.out.println(n+" "+amt);
	}
}
class accountbalance
{
	public static void main(String[] args) 
	{
		balance c[]=new balance[3];
		c[0]=new balance("Harry",98.90);
		c[1]=new balance("Sree",78.43);
		c[2]=new balance("praveen",798.42);
		for(int i=0;i<3;i++)
		{
			c[i].show();
		}	
	}
}