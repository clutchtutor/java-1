import java.util.*;
class queue
{
	int que[]=new int[1000];
	int front=0,rear=999,n=999;
	void ins(int a)
	{
		if(front==0)
		{
			front=1;
			rear=1;
		}
		else if(rear==n)
		{
			rear=1;
		}
		else
			rear=rear+1;
		que[rear]=a;
	}
	void rem()
	{
		if(front==rear)
		{
			front=0;
			rear=0;
		}
		else if(front==n)
		{
			front=1;
		}
		else
			front=front+1;
	}
	boolean empty()
	{
		if(front==0)
			return false;
		else
			return true;
	}
	int peek()
	{
		return que[front];
	}
}
class bfs
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i,j,n,a;
		System.out.print("Enter the no. of nodes: ");
		n=obj.nextInt();
		System.out.println("Enter the adjacency matrix: ");
		int adj[][]=new int[n+1][n+1];
		int visit[]=new int[n+1];
		for(i=1;i<n+1;i++)
		{
			for(j=1;j<n+1;j++)
				adj[i][j]=obj.nextInt();
		}
		queue o=new queue();
		o.ins(1);
		visit[1]=1;
		while(o.empty())
		{
			a=o.peek();
			for(i=1;i<n+1;i++)
			{
				if(adj[a][i]==1 && visit[i]==0)
				{
					o.ins(i);
					visit[i]=1;
				}
			}
			System.out.print(o.peek()+" ");
			o.rem();
		}
	}
}