package mypack;
public class balance1
{
	String n;
	double amt;
	public balance1(String a,double b)
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