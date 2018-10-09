package face;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Face extends JApplet{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Sonic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JApplet applet = new Face();
		applet.init();
		
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
		
		
		
				
	}
	
	public void init() {
		JPanel panel = new MyPanel();
		getContentPane().add(panel);
	}

}

class MyPanel
extends JPanel
implements MouseListener
{
private int x;
private int y;

public MyPanel()
{
  setBackground(new Color(255, 255, 255));
  setPreferredSize(new Dimension(400, 400));
  addMouseListener(this);
  
}

public void paintComponent(Graphics g)
{
  super.paintComponent(g);
  Graphics2D g2 = (Graphics2D)g;
  DrawSonic(g2);
}

private void DrawSonic(Graphics2D g2)
{
  Shape base = new Ellipse2D.Double(this.x - 75, this.y - 85, 150, 150);
  
  int xEarE = this.x - 50;
  int yEarE = this.y - 40;
  int xEarE2 = this.x - 55;
  int yEarE2 = this.y - 38;
  
  GeneralPath LeftEar = new GeneralPath();
  LeftEar.moveTo(xEarE, yEarE);
  LeftEar.curveTo(xEarE - 65, yEarE -35 , xEarE - 75, yEarE - 50, xEarE - 110, yEarE - 20);
  LeftEar.curveTo(xEarE - 80, yEarE - 20, xEarE - 75, yEarE + 30, xEarE - 30, yEarE + 30);
  LeftEar.closePath();
  
  GeneralPath LeftEar2 = new GeneralPath();
  LeftEar2.moveTo(xEarE2, yEarE2);
  LeftEar2.curveTo(xEarE2 - 65, yEarE2 - 20, xEarE2 - 73, yEarE2 - 48, xEarE2 - 98, yEarE2 - 24);
  LeftEar2.curveTo(xEarE2 - 78, yEarE2 - 20, xEarE2 - 75, yEarE2 + 20, xEarE2 - 28, yEarE2 + 25);
  LeftEar2.closePath();
  
  int xEarD = this.x + 50;
  int yEarD = this.y - 40;
  int xEarD2 = this.x + 55;
  int yEarD2 = this.y - 38;
  GeneralPath RightEar = new GeneralPath();
  RightEar.moveTo(xEarD, yEarD);
  RightEar.curveTo(xEarD + 65, yEarD - 25, xEarD + 75, yEarD - 50, xEarD + 110, yEarD - 20);
  RightEar.curveTo(xEarD + 80, yEarD - 20, xEarD + 75, yEarD + 30, xEarD + 40, yEarD + 30);
  RightEar.closePath();
  
  GeneralPath RightEar2 = new GeneralPath();
  RightEar2.moveTo(xEarD2, yEarD2);
  RightEar2.curveTo(xEarD2 + 65, yEarD2 - 20, xEarD2 + 73, yEarD2 - 48, xEarD2 + 98, yEarD2 - 24);
  RightEar2.curveTo(xEarD2 + 75, yEarD2 - 20, xEarD2 + 75, yEarD2 + 20, xEarD2 + 28, yEarD2 + 25);
  RightEar2.closePath();
  
  int xEyeLeft = this.x - 15;
  int yEyeLeft = this.y - 23;
  int xEye2 = this.x - 20;
  int yEye2 = this.y - 30;
  Shape EyeLeft = new Ellipse2D.Double(xEyeLeft - 10, yEyeLeft - 35, 20, 20);
  Shape Eye2 = new Ellipse2D.Double(xEye2 - 20, yEye2 - 45, 40, 40);
  
  int xEyeRight = this.x + 25;
  int yEyeRight = this.y - 23;
  Shape EyeRight = new Ellipse2D.Double(xEyeRight - 10, yEyeRight - 35, 20, 20);
  int xEye3 = this.x + 20;
  int yEye3 = this.y - 30;
  Shape Eye3 = new Ellipse2D.Double(xEye3 -20 , yEye3 - 45, 40, 40);
  
  int xMouth = this.x - 15;
  int yMouth = this.y + 5;
  
  GeneralPath Mouth = new GeneralPath();
  Mouth.moveTo(xMouth, yMouth);
  Mouth.quadTo(xMouth + 15, yMouth + 45, xMouth + 50, yMouth);
  Mouth.closePath();
  
  Shape nose = new Ellipse2D.Double(this.x - 10, this.y - 35, 10, 10);
 
  
  g2.setColor(new Color(0,0,255));
  g2.fill(base);
  g2.draw(base);
  
  g2.setColor(new Color(0,0,255));
  g2.fill(LeftEar);
  
  g2.setColor(new Color(0,0,255));
  g2.fill(RightEar);
  
  g2.setColor(Color.WHITE);
  g2.fill(Eye2);
  g2.setColor(Color.WHITE);
  g2.fill(Eye3);
  g2.setColor(Color.GREEN);
  g2.fill(EyeLeft);
  g2.setColor(Color.GREEN);
  g2.fill(EyeRight);
  
  g2.setColor(Color.WHITE);
  g2.fill(Mouth);
  
  g2.setColor(new Color(210, 180, 140));
  g2.fill(LeftEar2);
  g2.setColor(new Color(210, 180, 140));
  g2.fill(RightEar2);
  
  g2.setColor(Color.BLACK);
  g2.fill(nose);
 
}

public void mouseClicked(MouseEvent eMouse)
{
  this.x = eMouse.getX();
  this.y = eMouse.getY();
  repaint();
}

public void mousePressed(MouseEvent e) {}

public void mouseReleased(MouseEvent e) {}

public void mouseEntered(MouseEvent e) {}

public void mouseExited(MouseEvent e) {}

public void mouseDragged(MouseEvent e) {}

public void mouseMoved(MouseEvent eMouseD) {}
}
