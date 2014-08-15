abstract class figure
{
	double a,b;
	figure(double c,double d)
	{
		a=c;
		b=d;
	}
	abstract double area();
	
}
class rectangle extends figure
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area inside rectangle is");
		return a*b;
	}
}
class triangle extends figure
{
	triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area inside triangle is:");
		return a*b*0.5;
	}
}
class abstractdemo
{
	public static void main(String[] args) 
	{
		//figure f=new figure(10,20);
		rectangle r=new rectangle(10,20);
		triangle t=new triangle(10,20);
		figure g;
		g=r;
		System.out.println("Area is "+g.area());
		g=t;
		System.out.println("Area is "+g.area());
	}
}
