class staticdemo
{
	static int a=42;
	static int b=34;
	static void call()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class usestatic1
{
	public static void main(String args[])
	{
		staticdemo.call();
		System.out.println("b: "+staticdemo.b);
	}
}