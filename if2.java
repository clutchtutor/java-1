class dynstck implements instck
{
	private int stck[];
	private int tos;
	dynstck(int p)
	{
		stck=new int[p];
		tos=-1;
	}
	public void push(int a)
	{
		if(tos==stck.length-1)
		{
			int temp[]=new int[stck.length*2];
			for(int i=0;i<stck.length;i++)
				temp[i]=stck[i];
			stck=temp;
			stck[++tos]=a;
		}
		else
			stck[++tos]=a;
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}
class if2
{
	public static void main(String[] args) 
	{
		dynstck d1=new dynstck(6);
		int i;
		for(i=0;i<12;i++)
		{
			d1.push(i);
		}	
		for(i=0;i<12;i++)
		{
			System.out.println(d1.pop());
		}
	}
}