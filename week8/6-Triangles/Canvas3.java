import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

public class Canvas3 extends JPanel implements MouseListener {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 800;

  public int[] xPoints = {0,0,0};
  public int[] yPoints = {0,0,0};

  int counter = 0;

  public Canvas5() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    if(counter==3){
	Random r = new Random();
	   g2.setPaint(Color.getHSBColor(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
	   g2.fillPolygon(xPoints, yPoints, 3);
       }
  }

  
  public void mouseClicked(MouseEvent e) {
    // magic happens here 
	  
	  if (counter<3){
	  xPoints[counter] = e.getX();
	  yPoints[counter] = e.getY();
	  counter++;}
	  else{
		  counter = 0;
		  xPoints[0] =e.getX();
		  xPoints[1] =0;
		  xPoints[2] =0;
		  yPoints[0] =e.getY();
		  yPoints[1] =0;
		  yPoints[2] =0;
		  
	  }
    // calling repaint is important 
    repaint();
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}
