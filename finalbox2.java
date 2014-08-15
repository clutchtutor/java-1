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
class shipment extends boxweigth
{
	double cost;
	shipment(shipment ob)
	{	
		super(ob);
		cost=ob.cost;
	}
	shipment(double w,double l,double d,double m,double c)
	{
		super(w,l,d,m);
		cost=c;
	}
}
class finalbox2
{
	public static void main(String[] args) 
	{
		shipment o1=new shipment(10,23,45.34,0.03,500);
		shipment o2=new shipment(10,2,3,0.05,600);
		double vol;
		vol=o1.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o1.weigth);
		System.out.println("cost: "+o1.cost);
		vol=o2.vol();
		System.out.println("vol: "+vol);
		System.out.println("weigth: "+o2.weigth);
		System.out.println("cost: "+o2.cost);
	}
}