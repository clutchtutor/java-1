class box
{
	double breadth;
	double depth;
	double length;
	box(double b,double d,double l)
	{
		breadth=b;
		depth=d;
		length=l;
	}
	double volume()
	{
		return breadth*depth*length;
	}
}
class boxdemo4
{
	public static void main(String args[])
	{
		box mybox=new box(10,10,10);
		System.out.println(mybox.volume());
	}
}