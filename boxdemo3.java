class box
{
	double breadth;
	double depth;
	double length;
	box()
	{
		breadth=10;
		depth=10;
		length=10;
	}
	double volume()
	{
		return breadth*depth*length;
	}
}
class boxdemo3
{
	public static void main(String args[])
	{
		box mybox=new box();
		System.out.println(mybox.volume());
	}
}