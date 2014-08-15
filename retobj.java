class test2
{
	int a;
	test2(int i)
	{
		a=i;
	}
	test2 incrbyten()
	{
		test2 temp=new test2(a+10);
		return temp;
	}
}
class retobj
{
	public static void main(String args[])
	{
		test2 ob1=new test2(2);
		test2 ob2;
		ob2=ob1.incrbyten();
		System.out.println("ob1.a before call :"+ob1.a);
		System.out.println("ob1.a after call: "+ob2.a);
	}
}