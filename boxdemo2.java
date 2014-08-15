class box
{
	double breadth;
	double depth;
	double length;
	double volume()
	{
		return breadth*depth*length;
	}
	void setdim(double b,double d,double l)
	{
		breadth=b;
		depth=d;
		length=l;
	}
}
class boxdemo2
{
	public static void main(String args[])
	{
		box mybox=new box();
		mybox.setdim(10,10,10);
		System.out.println(mybox.volume());
	}
}