import java.util.Scanner;

class Points{
	double x,y,angle;
	Points(){
		angle=0;
	}
	public void swap(Points p){
		double tx,ty,tz;
		tx=x;x=p.x;p.x=tx;
		ty=y;y=p.y;p.y=ty;
		tz=angle;angle=p.angle;p.angle=tz;	
	}
	public void setAngle(Points p){
		if(p.x==x){
			angle=1;
		}
		else if(p.x>x){
			angle=(y-p.y)/Math.sqrt(Math.pow(p.x-x, 2)+Math.pow(p.x-x, 2));
		}
		else
		{
			angle=2-((y-p.y)/Math.sqrt(Math.pow(p.x-x, 2)+Math.pow(p.x-x, 2)));	
		}
	}
}

public class Covex {

public static void main(String args[]){
    int n,index = 0,top=-1;
    Scanner ob;
    System.out.print("Enter the no. of points:");
    ob = new Scanner(System.in);
    n = ob.nextInt();
    if(n>=3){
    int s[]=new int[n];
    Points p[] = new Points[n];
    for (int i=0;i<n;i++){
        System.out.print("Coordinates of point "+(i+1)+" are:");
        p[i] = new Points();
        p[i].x =ob.nextDouble();
        p[i].y = ob.nextDouble();
        if((i>0)&&((p[index].y>p[i].y)||(p[index].y==p[i].y&&p[index].x>p[i].x)))
            index=i;
    }
    p[0].swap(p[index]);
    //calculate polar angle
    for(int i=1;i<n;i++){
        p[i].setAngle(p[0]);
    }
    //sorting
    for(int i=1;i<n-1;i++)
        for(int j=1;j<n-1-i;j++)
        if(p[j].angle>p[j+1].angle)
            p[j].swap(p[j+1]);
    //convex hull
    s[++top]=0;
    int z=1;
    index=1;
    try{
    while(p[z].angle==p[z+1].angle){
        if(Math.sqrt(Math.pow((p[z].x-p[0].x),2)+Math.pow((p[z].y-p[0].y),2))>Math.sqrt(Math.pow((p[z+1].x-p[0].x),2)+Math.pow((p[z+1].y-p[0].y),2)))
            index=z;
        else
            index=z+1;
        z++;
    }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("All Points are collinear.Not possible to have a ConvexHull");
        System.exit(0);
    }
    s[++top]=index;
    s[++top]=index+1;
    for(int i=index+2;i<n;i++){
        while(checking(p[s[top-1]].x,p[s[top-1]].y,p[s[top]].x,p[s[top]].y,p[i].x,p[i].y)>0)
            top--;
        if(checking(p[s[top-1]].x,p[s[top-1]].y,p[s[top]].x,p[s[top]].y,p[i].x,p[i].y)==0){
           if(((p[s[top]].x-p[s[top-1]].x)*(p[s[top]].x-p[i].x))<0||((p[s[top]].y-p[s[top-1]].y)*(p[s[top]].y-p[i].y))<0)
               s[top]=i;
        }
        s[++top]=i;
    }
    if(checking(p[s[top-1]].x,p[s[top-1]].y,p[s[top]].x,p[s[top]].y,p[s[0]].x,p[s[0]].y)==0)
        top--;
    //printing
    System.out.println("The points in ConvexHull are:");
    for(int i=0;i<=top;i++)
        System.out.println((i+1)+"("+p[s[i]].x+" ,"+p[s[i]].y+")");      
    }
    else{
        System.out.println("There must be atleast 3 points in the plane");
    }
}    

static  double checking(double x1,double y1,double x2,double y2,double x3,double y3){
        return (x1 * y2 + x3 * y1 + x2* y3 - x3 * y2 - x2 *y1 - x1 * y3);
}
}

