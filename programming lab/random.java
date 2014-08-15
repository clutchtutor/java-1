import java.lang.*;
class random
{
	static int rand(int max,int min)
	{
		int range=(max-min)+1;
		return (int)(Math.random()*range)+min;
	}
	public static void main(String args[])
	{
		int x=rand(1,6);
		int z=rand(1,6);
		System.out.println("Numbers on dice are: "+x+" "+z);
		System.out.println("Sum is: "+(z+x));
	}
}