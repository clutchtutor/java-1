package p1;
class samepackage
{
	samepackage()
	{
		protection p=new protection();
		System.out.println("same package Constructor");
		System.out.println("n :"+p.n);
		//System.out.println("n private :"+p.n_pri);
		System.out.println("n protected :"+p.n_pro);
		System.out.println("n public :"+p.n_pub);
	}
}