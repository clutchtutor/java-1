class test3
{
	int a;
	public int b;
	private int c;
	void setc(int i)
	{
		c=i;
	}
	int getc()
	{
		return c;
	}
}
class accesstest
{
	public static void main(String args[])
	{
		test3 ob=new test3();
		ob.a=10;
		ob.b=20;
		ob.setc(30);
		int c;
		c=ob.getc();
		System.out.print(ob.a+" "+ob.b+" "+c)
	}
}