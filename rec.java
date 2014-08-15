class rectest
{
	int values[];
	rectest(int i)
	{
		values= new int[i];
	}
	void printarr(int i)
	{
		if(i==0)
			return;
		else
			printarr(i-1);
		System.out.println("["+(i-1)+"]"+values[i-1]);
	}
}
class rec
{
	public static void main(String[] args) 
	{
		rectest ob=new rectest(10);
		int i;
		for(i=0;i<10;i++)
			ob.values[i]=i;
		ob.printarr(10);	
	}
}