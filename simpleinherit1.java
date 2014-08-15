class a
{
	int i;
	private int j;
}
class b extends a
{
	int k;
	void setij(int a,int b)
	{
		i=a;
		j=b;
	}
	void sum()
	{
		System.out.println("i+j:"+(i+j));
	}
}
class simpleinherit1
{
	public static void main(String[] args) 
	{
		b o=new b();
		o.setij(10,20);
		o.sum();	
	}
}