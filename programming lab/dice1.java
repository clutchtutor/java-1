import java.util.*;
class dice1
{
	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		Random obj=new Random();
		int s=0,n,i;
		System.out.print("Enter the number of dice: ");
		n=o.nextInt();
		int c[]=new int[n];
		for(i=0;i<n;i++)
		{
			c[i]=obj.nextInt(6)+1;
		}
		System.out.print("Number on dice are: ");
		for(i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			s+=c[i];
		}
		System.out.println();
		System.out.println("Sum is: "+s);	
	}
}