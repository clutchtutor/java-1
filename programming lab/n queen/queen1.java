import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
class gui
{
	static int n;
	gui()
	{
		String s=JOptionPane.showInputDialog("Enter the number of queen");
		n=Integer.parseInt(s);
	}
	gui(int[] a)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int l,k;
		JFrame f=new JFrame(n+" queen");
		JPanel mainpanel = new JPanel(new GridLayout(n,n));
		JButton[][] b=new JButton[n+1][n+1];
		for(l=1;l<=n;l++)
		{
			for(k=1;k<=n;k++)
			{
				b[l][k]=new JButton();
				mainpanel.add(b[l][k]);
			}
		}
		for(l=1;l<=n;l++)
		{
			b[l][a[l]].setBackground(Color.BLACK);
		}
		f.setSize(600,600);
		f.add(mainpanel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}
}
class queen1
{
	int x[]=new int[100];
	boolean place(int k,int i)
	{
		for(int j=1;j<=k-1;j++)
		{
			if(x[j]==i || Math.abs(x[j]-i)==Math.abs(k-j))
				return false;
		}
		return true;
	}	
	void nqueen(int k,int n)
	{
		int j,i;
		for(i=1;i<=n;i++)
		{
			if(place(k,i))
			{
				x[k]=i;
				if(k==n)
				{
					gui g=new gui(x);
				}
				else
					nqueen(k+1,n);
			}
		}
	}
	public static void main(String args[])
	{
		gui o=new gui();
		queen1 q=new queen1();
		int n=gui.n;
		q.nqueen(1,n);
	}
}