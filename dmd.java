class q
{
	void call()
	{
		System.out.println("Inside Q");
	}
}
class m extends q
{
	void call()
	{
		System.out.println("Inside m");
	}
}
class n extends m
{
	void call()
	{
		System.out.println("Inside n");
	}	
}
class dmd
{
	public static void main(String[] args) 
	{
		q o1=new q();
		m o2=new m();
		n o3=new n();
		q r;
		r=o1;
		r.call();
		r=o2;
		r.call();
		r=o3;
		r.call();	
	}
}