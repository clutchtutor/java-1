class NewThread implements Runnable
{
	NewThread()
	{
		Thread t=new Thread(this, "Demo Thread");
		System.out.println("Child Thread : "+t);
		t.start();
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
class threaddemo
{
	public static void main(String[] args) 
	{
		new NewThread();
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