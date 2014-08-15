class newthread extends Thread
{
	newthread()
	{
		super("Demo Thread");
		System.out.println("Child Thread : "+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread is interrupted");
		}
		System.out.println("Child thread is exiting");
	}
}
class threaddemo1
{
	public static void main(String[] args) 
	{
		new newthread();
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interupted");
		}
		System.out.println("Main thread exiting");	
	}
}