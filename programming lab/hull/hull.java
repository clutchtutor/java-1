import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hull
{
    public static void main(String[] args)
    {
        GUI d = new GUI();
    }
}
class point
{
    int x,y;
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class GUI
{
    private int x;
    private int y;
    private DrawingBase canvas;
    point points[]=new point[100];
    int n=0;
    int h=0;
    GUI()
    {
        JFrame frame = new JFrame("Convex Hull Demo");
        JPanel mainpanel = new JPanel(), btnpanel = new JPanel(); 
        JButton b1=new JButton("Reset"), b2=new JButton("Start");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));
        btnpanel.setLayout(new GridLayout(1,2));
        canvas = new DrawingBase();
        canvas.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                points[n]=new point(x,y);
                n++;
                canvas.setlayout(points,n);
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                n=h=0;
                canvas.setlayout();
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                convexhull(points,n);
            }
        });
        btnpanel.add(b1);
        btnpanel.add(b2);
        mainpanel.add(btnpanel);
        mainpanel.add(canvas);
        frame.setContentPane(mainpanel);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
    int orientation(point p, point q, point r)
    {
        int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
        if (val == 0) return 0;  // colinear
        return (val > 0)? 1: 2; // clock or counterclock wise
    }
    void convexhull(point points[],int n)
    {
        point hp[]=new point[100];
        h=0;
        if(n<3)
            return;
        int next[]=new int[n],l=0,i,q,p;
        for(i=0;i<n;next[i++]=-1);
        for(i=1;i<n;i++)
            if(points[i].x<points[l].x)
                l=i;
        p=l;
        do
        {
            hp[h++]=new point(points[p].x,points[p].y);
            q=(p+1)%n;
            for(i=0;i<n;i++)
                if(orientation(points[p],points[i],points[q])==2)
                    q=i;
            next[p]=q;
            p=q;
        }while(p!=l);
        canvas.setlayout(hp,points,h,n);
    }    
}
class DrawingBase extends JPanel
{
    point points[],hp[];
    int n=0,h=0;
    public void setlayout(point points[], int n)
    {
        this.points=points;
        this.n=n;
        repaint();
    }

    public void setlayout()
    {
        n=h=0;
        repaint();
    }

    public void setlayout(point hp[],point points[],int h,int n)
    {
        this.points=points;
        this.hp=hp;
        this.n=n;
        this.h=h;
        repaint();
    }

    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 400));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(int i=0;i<n;i++)
            g.fillRect(points[i].x,points[i].y, 5, 5);
        if(h!=0)
            for(int i=0;i<h;i++)
                g.drawLine(hp[i].x,hp[i].y,hp[(i+1)%h].x,hp[(i+1)%h].y);
    }
}