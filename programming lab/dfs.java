import java.util.*;
class stack
{
	int top,a;
	stack()
	{
		top=-1;
	}
	int stk[]=new int[1000];
	void push(int item)
	{
		stk[++top]=item;
	}
	void pop()
	{
		top--;
	}
	int peek()
	{
		return stk[top];
	}
	boolean empty()
	{
		if(top==-1)
			return false;
		else 
			return true;
	}
}
class dfs
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no. of nodes: ");
		int n;
		n=obj.nextInt();
		System.out.println("Enter the adjacency matrix: ");
		int adj[][]=new int[n+1][n+1];
		int visit[]=new int[n+1];
		int i,j;
		for(i=1;i<n+1;i++)
		{
			for(j=1;j<n+1;j++)
				adj[i][j]=obj.nextInt();
		}
		int b,c,flag;
		stack st=new stack();
		st.push(1);
		visit[1]=1;
		System.out.print(1+" ");
		while(st.empty())
		{
			b=st.peek();
			flag=0;
			for(i=1;i<n+1;i++)
			{
				if(adj[b][i]==1 && visit[i]==0)
				{
					visit[i]=1;
					st.push(i);
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.print(st.peek()+" ");
			else
				st.pop();
		}
	}
}