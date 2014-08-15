import java.lang.*;
class passob
{
	int a,b;
	passob(int i,int j)
	{
		a=i;
		b=j;
	}
	boolean equals(passob o)
	{
		if(o.a==a && o.b==b)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		passob ob1=new passob(100,22);
		passob ob2=new passob(100,22);
		passob ob3=new passob(-1,-1);
		System.out.println("ob1==ob2 :"+ob1.equals(ob2));
		System.out.println("ob1==ob3 :"+ob1.equals(ob3));
	}
}