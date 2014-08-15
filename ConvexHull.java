import java.io.*;  
import java.util.Scanner;
class ConvexHull 
{  
   float angle1(int a[][],int m,int n)  
   {  
      float angle=0;  
      float temp;  
      // angle less than 90  
      if(a[n][1]>a[m][1] && a[n][0]>a[m][0])  
      {  
            temp=(float)Math.sqrt(Math.pow((a[n][1]-a[m][1]),2)+Math.pow((a[n][0]-a[m][0]),2));  
            angle=(float)(a[n][1]-a[m][1])/temp;  
      }  
      //angle b/w 90 and 180  
      if(a[n][1]>a[m][1] && a[m][0]>a[n][0])  
      {  
            temp=(float)Math.sqrt(Math.pow((a[n][1]-a[m][1]),2)+Math.pow((a[m][0]-a[n][0]),2));  
            angle=(float)(a[m][0]-a[n][0])/temp;  
            angle=angle+1;  
       }  
      //angle b/w 180 and 270  
      if(a[m][1]>a[n][1] && a[m][0]>a[n][0])  
      {  
            temp=(float)Math.sqrt(Math.pow((a[m][1]-a[n][1]),2)+Math.pow((a[m][0]-a[n][0]),2));  
            angle=(float)(a[m][1]-a[n][1])/temp;  
        angle=angle+2;  
      }  
      //angle b/w 270 and 360  
      if(a[n][0]>a[m][0] && a[m][1]>a[n][1])  
      {   
            temp=(float)Math.sqrt(Math.pow((a[m][1]-a[n][1]),2)+Math.pow((a[n][0]-a[m][0]),2));  
        angle=(float)(a[n][0]-a[m][0])/temp;  
        angle=angle+3;  
      }  
      //angle 0  
      if(a[n][0]>=a[m][0] && a[m][1]==a[n][1])  
      {  
            angle=0;  
      }  
      //angle 90  
      if(a[n][0]==a[m][0] && a[n][1]>a[m][1])  
      {  
            angle=1;  
      }  
      // angle 180  
      if(a[n][1]==a[m][1] && a[n][0]<a[m][0])  
      {  
            angle=2;   
      }  
      //angle 270  
      if(a[n][0]==a[m][0] && a[n][1]<a[m][1])  
      {  
            angle=3;  
      }  
      return angle;  
  }  
public static void main(String args[]) throws IOException  
{  
         int n,i,j,k,temp1,temp2,fp=0,z;  
         float min=0,previous;  
         ConvexHull c = new ConvexHull();  
         System.out.println("Enter the number of points the hull");  
         Scanner input = new Scanner(System.in); 
         n=input.nextInt();
if(n>2)
{        	 
         int a[][] = new int[n][2];  
         int f[][] = new int[n][2];  
         System.out.println("Enter the coordinates of the points");  
         for(i=0;i<n;i++)  
         {   
              System.out.println("Enter the x-coordinate and y-coordinate of "+(i+1)+"th point");  
              a[i][0]=input.nextInt();;  
              a[i][1]=input.nextInt();;   
         }  
         i=0;     
         for(j=i+1;j<n;j++)  
         {   
        if(a[i][1]>=a[j][1])  
        {     
              if(((a[i][1]==a[j][1]) && (a[i][0]>a[j][0])) || (a[i][1]>a[j][1]))  
          {       
                     temp1=a[i][0];  
             a[i][0]=a[j][0];  
             temp2=a[i][1];  
             a[i][1]=a[j][1];  
             a[j][0]=temp1;  
                 a[j][1]=temp2;  
          }  
            }   
     }  
         f[fp][0]=a[0][0];  
         f[fp][1]=a[0][1];  
         fp++;  
         j=1;  
         k=0;  
         min=c.angle1(a,k,1);  
         for(i=2;i<n;i++)  
         {   
           if(c.angle1(a,k,i)<=min)  
           {     
             if(c.angle1(a,k,i)<min)  
         {  
                 min=c.angle1(a,k,i);  
             j=i;  
         }  
             else  
         {   
                 if(a[i][0]<a[j][0] || a[i][1]<a[j][1])  
             j=i;  
         }  
           }  
         }  
         f[fp][0]=a[j][0];  
         f[fp][1]=a[j][1];  
         fp++;  
         z=k;  
         do  
         {  
              previous=c.angle1(a,j,z);  
              z=j;  
              min=previous+4;  
              if(previous>=2)  
                  previous=previous-4;  
          for(i=0;i<n;i++)  
          {  
                 if(i!=j )  
             {  
                       if(c.angle1(a,j,i)<=min && c.angle1(a,j,i)>previous)  
                   {   
                          if(c.angle1(a,j,i)<min)  
                            {  
                               min=c.angle1(a,j,i);  
                               k=i;  
                             }  
                          else  
                       {  
                             if(min<2)  
                              {  
                                 if(a[i][0]<a[k][0] || a[i][1]<a[k][1])  
                                     k=i;  
                              }  
                             if(min>2)  
                              {  
                                if(a[i][0]>a[k][0]  ||   a[i][1]>a[k][1])  
                        k=i;  
                              }  
                       }  
                    }  
               }  
            }  
                f[fp][0]=a[k][0];  
                f[fp][1]=a[k][1];  
                fp++;  
                j=k;  
          }while(fp<n && (f[fp-1][0]!=f[0][0] || f[fp-1][1]!=f[0][1]));  
          System.out.println("The sides of convex hull will be");  
          for(i=0;i<fp-1;i++)  
          {  
              System.out.println("\t("+f[i][0]+","+f[i][1]+")   ("+f[i+1][0]+","+f[i+1][1]+")");  
          }  
          System.out.println("\t("+f[fp-1][0]+","+f[fp-1][1]+")   ("+f[0][0]+","+f[0][1]+")");
   }
else
{
	 System.out.println("points must be greater than 3");
	
}
}

}