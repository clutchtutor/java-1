interface Callback
{
	void callback(int param);
}
class client implements Callback
{
	public void callback(int p)
	{
		System.out.println("Call back called with :"+p);
	}
	void nonifacemeth()
	{
		System.out.println("class that implements can also have their methods");
	}
}
class anotherclient implements Callback
{
	public void callback(int p)
	{
		System.out.println("Another version of callback");
		System.out.println("p is squared"+p*p);
	}
}
class testiface1
{
	public static void main(String[] args) 
	{
		Callback c=new client();
		anotherclient o=new anotherclient();
		c.callback(42);	
		c=o;
		c.callback(42);
	}
}