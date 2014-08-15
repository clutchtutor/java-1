class usestatic
{
	static int a;
	static int b;
	static void meth(int x)
	{
		a=10;
		System.out.println("x: "+x);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	static
	{
		System.out.println("This will initialise b");
		b=a*4;
	}
	public static void main(String args[])
	{
		meth(42);
	}
}