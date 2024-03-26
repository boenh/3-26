import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		 if (width <= 1) {
			 return;
		 }
		 
		 g.drawOval(x,y, width, width);
		 concentricCircles(g, width-8, x+4, y+4);
	}	
	public void clover(Graphics g, int width, int x, int y) {
		 if (width <= 1) {
			 return;
		 }
		 else {
			 clover(g, width-10, x+10, y+10);
			
			 g.drawOval(x ,y, width, width);
			 g.drawOval(x+width ,y, width, width);
			 g.drawOval(x ,y+width, width, width);
			 g.drawOval(x+width ,y+width, width, width);

		 }
	}
	
	
	
	public void squares(Graphics g, int width, int x, int y) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		if (width <= 1) {
			 return;
		 }
		Color c = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
		
		g.setColor(c);
		g.fillRect(x, y, width, width);
		int w1 = width/3;
		int w = width;
		squares(g, w1, x+width+w, y+width+w);
		squares(g, w1, x-w-w1, y+width+w);
		squares(g, w1, x+width+w, y-w1-w);
		squares(g, w1, x-w1-w, y-w1-w);
		squares(g, w1, x+(w/2)-w1/2, y-w1-w);
		squares(g, w1, x-w1-w, y+(w-w1)/2);
		squares(g, w1, x+(w-w1)/2, y+width+w);
		squares(g, w1, x+width+w, y+(w-w1)/2);
		
		
//		g.fillRect(x+width+w, y+width+w, w1, w1);
//		g.fillRect(x-w-w1, y+width+w, w1, w1);
//		g.fillRect(x+width+w, y-w1-w, w1, w1);
//		g.fillRect(x-w1-w, y-w1-w, w1, w1);
//		g.fillRect(x+w1/2, y-w1-w, w1, w1);
//		g.fillRect(x-w1-w, y+w1/2, w1, w1);
//		g.fillRect(x+w1/2, y+width+w, w1, w1);
//		g.fillRect(x+width+w, y+w1/2, w1, w1);
	}
	
	public void circles(Graphics g, int width, int x, int y, int c, int step, Color c1, Color c2) {
		 if (c <= 1) {
			 return;
		 }
		 else {
			 
			 
			 int r = width/4;
			 if (c%2==0) {
				 g.setColor(c1);
			 }
			 else {
				 g.setColor(c2);
			 }
			g.drawOval(x+(int)(r*Math.cos(c*step*0.0174533)), y+(int)(r*Math.sin(c*step*0.0174533)), r*2, r*2);
			circles(g, width, x, y, c-1, step, c1, c2);

			 
			 

		 }
	}	
	public void mullusk(Graphics g, int width, int x, int y, int c, int delta, int step) {
		 if (c <= 1) {
			 return;
		 }
		 else {
			 
			 
			 int r = width/4;
			 
			g.drawOval(x-(int)(r*Math.cos((c+delta)*step*0.0174533)), y-(int)(r*Math.sin((c+delta)*step*0.0174533)), r*2, r*2);
			mullusk(g, width+delta, x, y, c-1, delta, step);
		 }
	}
	
	public void flake(Graphics g, int length, int x, int y) {
		if (length<=1) {
			return ;
		}
		else {
			g.drawLine(x, y, x-length, y);
			g.drawLine(x, y, x+length, y);
			g.drawLine(x, y, (int)(x-length/2), (int)(y-length*Math.sqrt(3.0)/2));
			g.drawLine(x, y, (int)(x+length/2), (int)(y-length*Math.sqrt(3.0)/2));
			g.drawLine(x, y, (int)(x-length/2), (int)(y+length*Math.sqrt(3.0)/2));
			g.drawLine(x, y, (int)(x+length/2), (int)(y+length*Math.sqrt(3.0)/2));
			
			flake(g, length/4, x-length, y);
			flake(g, length/4, x+length, y);
			flake(g, length/4, (int)(x-length/2), (int)(y-length*Math.sqrt(3.0)/2));
			flake(g, length/4, (int)(x+length/2), (int)(y-length*Math.sqrt(3.0)/2));
			flake(g, length/4, (int)(x-length/2), (int)(y+length*Math.sqrt(3.0)/2));
			flake(g, length/4, (int)(x+length/2), (int)(y+length*Math.sqrt(3.0)/2));
		}
	}
	
	public void tree(Graphics g, int length, int x, int y) {
		if (length<=1) {
			return ;
		}
		else {
			g.drawLine(x, y, x, y+length);
			
			g.drawLine(x, y, (int)(x-length/2), (int)(y-length*Math.sqrt(3.0)/2));
			g.drawLine(x, y, (int)(x+length/2), (int)(y-length*Math.sqrt(3.0)/2));
			

			
//			flake(g, length/4, x-length, y);
//			flake(g, length/4, x+length, y);
//			flake(g, length/4, (int)(x-length/2), (int)(y-length*Math.sqrt(3.0)/2));
//			flake(g, length/4, (int)(x+length/2), (int)(y-length*Math.sqrt(3.0)/2));
//			flake(g, length/4, (int)(x-length/2), (int)(y+length*Math.sqrt(3.0)/2));
//			flake(g, length/4, (int)(x+length/2), (int)(y+length*Math.sqrt(3.0)/2));
		}
	}
	

	


	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		g.setColor(Color.red);
		//squares(g, 200, 600, 600);
//		circles(g, 200, 100, 100, 120, 3, Color.RED, Color.BLUE);
//		mullusk(g, 200, 100, 100, 90, 1,4);
		tree(g, 100, 200, 200);
	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
		
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(16, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete