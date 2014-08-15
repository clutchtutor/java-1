class callme
{
	synchronized void call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.print("It is interrupted");
		}
		System.out.print("]");
	}
}
class caller implements Runnable
{
	callme target;
	String msg;
	Thread t;
	caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
			target.call(msg);
	}
}
class call
{
	public static void main(String[] args) 
	{
		callme target=new callme();
		caller ob1=new caller(target,"hello");
		caller ob2=new caller(target,"Synchronized");
		caller ob3=new caller(target,"world");
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.print("It is interrupted");
		}	
	}
}