class overloaddemo
{
	void test()
	{
		System.out.println("No parameter");
	}
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	void test(int a,int b)
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	double test(double a)
	{
		return a;
	}
}
class Overload
{
	public static void main(String args[])
	{
		overloaddemo o=new overloaddemo();
		o.test();
		o.test(10);
		o.test(10,20);
		double t;
		t=o.test(3.4);
		System.out.println("t="+t);
	}
}