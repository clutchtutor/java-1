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
class testiface
{
	public static void main(String[] args) 
	{
		Callback c=new client();
		c.callback(42);	
	}
}