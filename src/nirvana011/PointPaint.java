package nirvana011;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class PointPaint {
	public static void main(String[] args){
		PointFrame pf = new PointFrame();
		pf.init();
	}
}
class PointFrame extends Frame{
	Collection points = new ArrayList();
	
	public void init(){
		this.setBounds(100,100,300,300);
		this.setVisible(true);
		this.addMouseListener(new Monitor());
		this.addWindowListener(new WindowMonitor());
	}
	
	public void addPoints(Point p){
		points.add(p);
	}
 
	public void paint(Graphics g){
		Iterator<Point> i = points.iterator();
		while(i.hasNext()){
			Point p = i.next();
			g.setColor(Color.BLUE);
			g.fillOval(p.x, p.y, 10, 10);
		}
		
	}
	
	class Monitor extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			PointFrame pf = (PointFrame)e.getSource();
			pf.addPoints(new Point(e.getX(),e.getY()));
			pf.repaint();
		}
	}
	class WindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			setVisible(false);
			System.exit(0);
		}
	}
}