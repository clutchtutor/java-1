import java.awt.*;
class g extends Canvas
{
	g()
	{
		setSize(500,500);
		setBackground(Color.white);
	}
	public static void main(String args[])
	{
		g a=new g();
		Frame f=new Frame();
		f.setSize(600,600);
		f.add(a);
		f.setVisible(true);
	}
	public void paint(Graphics g)
	{
		int i,a=55,b=50,j;
		for(i=1;i<9;i++)
		{
			for(j=1;j<9;j++)
			{
				if((i+j)%2==0)
				{
					g.setColor(Color.red);
					g.fillRect(a,b,60,60);
					a+=60;
				}
				else
				{
					g.setColor(Color.blue);
					g.fillRect(a,b,60,60);
					a+=60;
				}
			}
			a=55;
			b+=60;
		}
	}
}