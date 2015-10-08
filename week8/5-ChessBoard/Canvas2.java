import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JPanel;

public class Canvas2 extends JPanel {

  public static int WIDTH = 800;
  public static int HEIGHT = 800;

  public static int SQUARE_WIDTH = 50;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
   
    g.fillRect(0, 0, WIDTH, HEIGHT);
    for(int i = 0; i <= WIDTH-SQUARE_WIDTH; i+=SQUARE_WIDTH*2){ 
    	for(int j = 0; j <= HEIGHT-SQUARE_WIDTH; j+=SQUARE_WIDTH*2){ 
    		g.clearRect(i, j, SQUARE_WIDTH, SQUARE_WIDTH); } } 
    for(int i = SQUARE_WIDTH; i <= WIDTH; i+=SQUARE_WIDTH*2){ 
    	for(int j = SQUARE_WIDTH; j <= HEIGHT; j+=SQUARE_WIDTH*2){ 
    		g.clearRect(i, j, SQUARE_WIDTH, SQUARE_WIDTH); } } }


  public Canvas2() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
  }
}
