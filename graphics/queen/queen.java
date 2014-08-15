import java.awt.*;
import java.applet.*;
public class queen extends Applet{
    static int a[][] = new int[100][100];
    static int n=15;
    public boolean safe(int a[][],int row,int col)
    {
        int i,j;
        for(i=0;i<col;i++)
        {
            if(a[row][i]==1)
            return false;
        }
        for(i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(a[i][j]==1)
            return false;
        }
        for(i=row,j=col;i<n&&j>=0;i++,j--)
        {
            if(a[i][j]==1)
            return false;
        }
        return true;
    }
    
    public boolean solve(int a[][],int col){
        {
            if(col>=n)
            return true;
        }
        for(int i=0;i<n;i++)
        {
            if(safe(a,i,col))
            {
                a[i][col]=1;
                if(solve(a,col+1)==true)
                return true;
                a[i][col]=0;
            }
        }
        return false;
    }
    
    public boolean startw()
    {
        if(solve(a,0)==false)
        {
            return false;
        }
       return true;
    }
    public void paint(Graphics g)
    {
        //piy pyu = new piy();
        //start();
      int i,j,x,y;
      startw();
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              x=i*30;
              y=j*30;
              if(a[i][j]==1)
              {g.setColor(Color.red);}
              else
              {g.setColor(Color.green);}
              g.fillRect(x,y,30,30);
            }
        }
    }
}