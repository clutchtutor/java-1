package p2;
class otherpackage
{
	otherpackage()
	{
		p1.protection p=new p1.protection();
		System.out.println("other package Constructor");
		//System.out.println("n"+":"+p.n);
		//System.out.println("n private"+":"+p.n_pri);
		//System.out.println("n protected"+":"+p.n_pro);
		System.out.println("n public"+":"+p.n_pub);
	}
}