class overloaddemo
{
	void test()
	{
		System.out.println("No argument");
	}
	void test(double a)
	{
		System.out.println("a: "+a);
	}
}
class overload1
{
	public static void main(String args[])
	{
		overloaddemo o=new overloaddemo();
		int i=8;
		o.test();
		o.test(i);
		o.test(5.4);
	}
}