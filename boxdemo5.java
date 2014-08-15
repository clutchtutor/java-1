class box
{
	double width,heigth,length;
	box(double w,double h,double l)
	{
		width=w;
		heigth=h;
		length=l;
	}
	box()
	{
		width=-1;
		heigth=-1;
		length=-1;
	}
	box(double a)
	{
		width=heigth=length=a;
	}
	double vol()
	{
		return width*heigth*length;
	}
}
class boxdemo5
{
	public static void main(String args[])
	{
		box mybox1=new box(2,3,4);
		box mybox2=new box();
		box mybox3=new box(4);
		System.out.println(mybox1.vol());
		System.out.println(mybox2.vol());
		System.out.println(mybox3.vol());
	}
}