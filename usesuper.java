class sup1
{
	int i;
}
class sup2 extends sup1
{
	int i;
	sup2(int a,int b)
	{
		super.i=a;
		i=b;
		System.out.println("i in superclass: "+super.i);
		System.out.println("i in subclass: "+i);
	}
}
class usesuper
{
	public static void main(String[] args)
	{
		sup2 o=new sup2(5,6);
	}
}