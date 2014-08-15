class newthread1 implements Runnable
{
	String name;
	Thread t;
	newthread1(String threadname)
	{
		name=threadname;
		t=new Thread(this, name);
		System.out.println("New Thread : "+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name+" thread is interrupted");
		}
		System.out.println(name+" thread is exiting");
	}
}
class threaddemo2
{
	public static void main(String[] args) 
	{
		newthread1 o1=new newthread1("one");
		newthread1 o2=new newthread1("two");
		newthread1 o3=new newthread1("three");
		System.out.println("Thread one is alive: "+o1.t.isAlive());
		System.out.println("Thread two is alive: "+o2.t.isAlive());
		System.out.println("Thread three is alive: "+o3.t.isAlive());
		try
		{
			System.out.println("Waiting for thread to finish");
			o1.t.join();
			o2.t.join();
			o3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted");
		}
		System.out.println("Thread one is alive: "+o1.t.isAlive());
		System.out.println("Thread two is alive: "+o2.t.isAlive());
		System.out.println("Thread three is alive: "+o3.t.isAlive());
		System.out.println("Main thread is exiting");	
	}
}