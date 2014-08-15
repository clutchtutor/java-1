import java.util.*;
class p
{
	public static void main(String[] args) 
	{
		long temp1,temp2;
		int i;
		String temp;
		for(i=0;i<100;i++)
		{	temp=Integer.toBinaryString(i);
			temp1=Long.parseLong(temp);
			temp2=temp1*9;
			System.out.println(i+":"+temp1+":"+temp2);
		}	
	}
}