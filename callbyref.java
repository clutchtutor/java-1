class test
{
	int a,b;
	test(int i,int j)
	{
		a=i;
		b=j;
	}
	void meth(test o)
	{
		o.a*=2;
		o.b/=2;
	}
}
class callbyref
{
	public static void main(String args[])
	{
		test ob1=new test(15,20);
		test1 ob2=new test1(15,20);
		System.out.println("ob1.a and ob1.b before call :"+ob1.a+" "+ob1.b);
		ob1.meth(ob1);
		System.out.println("ob1.a and ob1.b after call :"+ob1.a+" "+ob1.b);
	}
}