import java.awt.*;

class GraphicsProgram extends Canvas{

    public GraphicsProgram(){
        setSize(200, 200);
        setBackground(Color.white);
    }

    public static void main(String[] argS){

         //GraphicsProgram class is now a type of canvas
          //since it extends the Canvas class
          //lets instantiate it
        GraphicsProgram GP = new GraphicsProgram();  

        //create a new frame to which we will add a canvas
        Frame aFrame = new Frame();
        aFrame.setSize(300, 300);
        
        //add the canvas
        aFrame.add(GP);
        
        aFrame.setVisible(true);
    }

    public void paint(Graphics g){
     
        g.setColor(Color.blue);
        g.drawLine(30, 30, 80, 80);
        g.drawRect(20, 150, 100, 100);
        g.fillRect(20, 150, 100, 100);
        g.fillOval(150, 20, 100, 100); 
        Image img1 = Toolkit.getDefaultToolkit().getImage("sky.jpg"); 
        g.drawImage(img1, 140, 140, this); 
    }
}