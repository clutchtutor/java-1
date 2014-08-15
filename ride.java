class a
{
	int i,j;
	a(int c,int d)
	{
		i=c;
		j=d;
	}
	void show()
	{
		System.out.println("i and j: "+i+" "+j);
	}
}
class b extends a
{
	int k;
	b(int c,int d,int l)
	{
		super(c,d);
		k=l;
	}
	void show()
	{
		super.show();
		System.out.println("k: "+k);
	}
}
class ride
{
	public static void main(String[] args) 
	{
		b o1=new b(10,20,30);
		o1.show();	
	}
}