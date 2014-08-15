package p1;
class derived extends protection
{
	derived()
	{
		System.out.println("Base Constructor");
		System.out.println("n"+":"+n);
		//System.out.println("n private"+":"+n_pri);
		System.out.println("n protected"+":"+n_pro);
		System.out.println("n public"+":"+n_pub);
	}
}