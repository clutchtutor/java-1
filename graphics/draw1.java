import javax.swing.*;
import java.awt.*;
class draw1
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("Empty Frame");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCanvas canvas=new JCanvas();
		frame.add(canvas);
		frame.setVisible(true);
		canvas.drawRect(10,20,40,50);
		canvas.drawOval(30,50,30,40);
	}
}