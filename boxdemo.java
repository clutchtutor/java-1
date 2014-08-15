class box
{
	double breadth;
	double depth;
	double length;
}
class boxdemo
{
	public static void main(String args[])
	{
		box mybox=new box();
		mybox.breadth=10;
		mybox.depth=10;
		mybox.length=10;
		double vol;
		vol=mybox.breadth*mybox.depth*mybox.length;
		System.out.print(vol);
	}
}