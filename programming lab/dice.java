import java.util.*;
class dice
{
	public static void main(String[] args) 
	{
		Random obj=new Random();
		int a,b,s;
		a=obj.nextInt(6)+1;
		b=obj.nextInt(6)+1;
		System.out.println("Dice 1: "+a+"\n"+"Dice 2: "+b);
		s=a+b;
		System.out.println("Sum is: "+s);	
	}
}