class box
{
	double breadth;
	double depth;
	double length;
	void volume()
	{
		System.out.print(breadth*depth*length);
	}
}
class boxdemo1
{
	public static void main(String args[])
	{
		box mybox=new box();
		mybox.breadth=10;
		mybox.depth=10;
		mybox.length=10;
		mybox.volume();
	}
}