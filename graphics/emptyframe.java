import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class emptyframe
{
	static int i=1;
	static int v[]=new int[11];
	static int b[]=new int[11];
	static void check()
	{
		JFrame f=new JFrame("Message");
		if(v[1]==1&&v[2]==1&&v[3]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[1]==2&&v[2]==2&&v[3]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[4]==1&&v[5]==1&&v[6]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[4]==2&&v[5]==2&&v[6]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[7]==1&&v[8]==1&&v[9]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[7]==2&&v[8]==2&&v[9]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[1]==1&&v[4]==1&&v[7]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[1]==2&&v[4]==2&&v[7]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[2]==1&&v[5]==1&&v[8]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[2]==2&&v[5]==2&&v[8]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[3]==1&&v[6]==1&&v[9]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[3]==2&&v[6]==2&&v[9]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[1]==1&&v[5]==1&&v[9]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[1]==2&&v[5]==2&&v[9]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(v[3]==1&&v[5]==1&&v[7]==1)
			{JOptionPane.showMessageDialog(f,"Player 1 wins");i=0;}
		else if(v[3]==2&&v[5]==2&&v[7]==2)
			{JOptionPane.showMessageDialog(f,"Player 2 wins");i=0;}
		else if(i==10)
			JOptionPane.showMessageDialog(f,"Its a draw");
	}
	emptyframe()
	{
		gui( );
	}
	public static void main(String[] args) 
	{
		emptyframe ef=new emptyframe();
	}
	public void gui()
	{ 
		final ImageIcon icon=new ImageIcon("cross.png");
		final ImageIcon icon1=new ImageIcon("circle.png");
		JFrame frame=new JFrame("Tic Tac Toe");
		frame.setSize(700,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel controlpanel=new JPanel(new GridLayout(3,3));
		controlpanel.setMaximumSize(new Dimension(100,100));
		frame.add(controlpanel);
		final JButton j1=new JButton();
		final JButton j2=new JButton();
		final JButton j3=new JButton();
		final JButton j4=new JButton();
		final JButton j5=new JButton();
		final JButton j6=new JButton();
		final JButton j7=new JButton();
		final JButton j8=new JButton();
		final JButton j9=new JButton();
		controlpanel.add(j1);
		controlpanel.add(j2);
		controlpanel.add(j3);
		controlpanel.add(j4);
		controlpanel.add(j5);
		controlpanel.add(j6);
		controlpanel.add(j7);
		controlpanel.add(j8);
		controlpanel.add(j9);
		frame.setVisible(true);
		j1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[1]==0)
				{
					if(i%2==0)
					{
						j1.setIcon(icon1);
						v[1]=2;
						i++;
						b[1]=1;
					}
					else
					{
						j1.setIcon(icon);
						v[1]=1;
						i++;
						b[1]=1;
					}
				}
				check();
			}
		});
		j2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[2]==0)
				{
					if(i%2==0)
					{
						j2.setIcon(icon1);
						v[2]=2;
						i++;
						b[2]=1;
					}
					else
					{
						j2.setIcon(icon);
						v[2]=1;
						i++;
						b[2]=1;
					}
				}
				check();
			}
		});
		j3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[3]==0)
				{
					if(i%2==0)
					{
						j3.setIcon(icon1);
						v[3]=2;
						i++;
						b[3]=1;
					}
					else
					{
						j3.setIcon(icon);
						v[3]=1;
						i++;
						b[3]=1;
					}
				}
				check();
			}
		});
		j4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[4]==0)
				{
					if(i%2==0)
					{
						j4.setIcon(icon1);
						v[4]=2;
						i++;
						b[4]=1;
					}
					else
					{
						j4.setIcon(icon);
						v[4]=1;
						i++;
						b[4]=1;
					}
				}
				check();
			}
		});
		j5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[5]==0)
				{
					if(i%2==0)
					{
						j5.setIcon(icon1);
						v[5]=2;
						i++;
						b[5]=1;
					}
					else
					{
						j5.setIcon(icon);
						v[5]=1;
						i++;
						b[5]=1;
					}
				}
				check();
			}
		});
		j6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[6]==0)
				{
					if(i%2==0)
					{
						j6.setIcon(icon1);
						v[6]=2;
						i++;
						b[6]=1;
					}
					else
					{
						j6.setIcon(icon);
						v[1]=1;
						i++;
						b[6]=1;
					}
				}
				check();
			}
		});
		j7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[7]==0)
				{
					if(i%2==0)
					{
						j7.setIcon(icon1);
						v[7]=2;
						i++;
						b[7]=1;
					}
					else
					{
						j7.setIcon(icon);
						v[7]=1;
						i++;
						b[7]=1;
					}
				}
				check();
			}
		});
		j8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[8]==0)
				{
					if(i%2==0)
					{
						j8.setIcon(icon1);
						v[8]=2;
						i++;
						b[8]=1;
					}
					else
					{
						j8.setIcon(icon);
						v[8]=1;
						i++;
						b[8]=1;
					}
				}
				check();
			}
		});
		j9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(b[9]==0)
				{
					if(i%2==0)
					{
						j9.setIcon(icon1);
						v[9]=2;
						i++;
						b[9]=1;
					}
					else
					{
						j9.setIcon(icon);
						v[9]=1;
						i++;
						b[9]=1;
					}
				}
				check();
			}
		});	
	}

}