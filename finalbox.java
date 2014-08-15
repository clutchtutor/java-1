class box
{
	double width,length,depth;
	box(box ob)
	{
		width=ob.width;
		length=ob.length;
		depth=ob.depth;
		System.out.println(width+" "+length+" "+depth);
	}
	box(double l)
	{
		width=length=depth=l;
	}
	box(double a,double b,double c)
	{
		width=a;
		length=b;
		depth=c;
	}
	box()
	{
		width=length=depth=-1;
	}
	double vol()
	{
		return width*length*depth;
	}
}
class boxweigth extends box
{
	double weigth;
	boxweigth(double w,double l,double d,double m)
	{
		width=w;
		length=l;
		depth=d;
		weigth=m;
	}
}
class finalbox
{
	public static void main(String[] args) 
	{
		boxweigth o1=new boxweigth(10,23,45.34,0.03);
		boxweigth o2=new boxweigth(12,21,43.43,9.05);
		box o3=new box(1,2,3);
		box o4=o3;
		double vol;
		vol=o1.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o1.weigth);
		vol=o2.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o2.weigth);
	}
}