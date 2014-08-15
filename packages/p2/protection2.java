package p2;
class protection2 extends p1.protection
{
	protection2()
	{
		System.out.println("derived other package Constructor");
		//System.out.println("n"+":"+n);
		//System.out.println("n private"+":"+n_pri);
		System.out.println("n protected"+":"+n_pro);
		System.out.println("n public"+":"+n_pub);
	}
}