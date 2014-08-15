class box
{
	double width,length,depth;
	box(box ob)
	{
		width=ob.width;
		length=ob.length;
		depth=ob.depth;
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
		super(w,l,d);
		weigth=m;
	}
	boxweigth(double l,double m)
	{
		super(l);
		weigth=m;
	}
	boxweigth()
	{
		super();
		weigth=-1;
	}
	boxweigth(boxweigth a)
	{
		super(a);
		weigth=a.weigth;
	}
}
class finalbox1
{
	public static void main(String[] args) 
	{
		boxweigth o1=new boxweigth(10,23,45.34,0.03);
		boxweigth o2=new boxweigth(10,2);
		boxweigth o3=new boxweigth();
		boxweigth myclone=new boxweigth(o1);
		double vol;
		vol=o1.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o1.weigth);
		vol=o2.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o2.weigth);
		vol=o3.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o3.weigth);
		vol=myclone.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+myclone.weigth);
	}
}