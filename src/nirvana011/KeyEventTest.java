package nirvana011;
import java.awt.*;
import java.awt.event.*;
public class KeyEventTest {
	public static void main(String[] args){
		KeyFrame kf = new KeyFrame();
		kf.init();
	}
}
class KeyFrame extends Frame{
	Point p = new Point(100, 100);
	public void init(){
		this.setTitle("Moving ball");
		this.setSize(500, 450);
		this.setBackground(Color.DARK_GRAY);
		this.setLocation(300, 300);
		this.setVisible(true);
		this.addKeyListener(new MyKeyMonitor());
		this.addWindowListener(new WindowMonitor());
	}
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(p.x,p.y, 10, 10);
	}

	class MyKeyMonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int v = e.getKeyCode();
			switch(v){
			case KeyEvent.VK_UP:
				p.y-=1;break;
			case KeyEvent.VK_DOWN:
				p.y+=1;break;
			case KeyEvent.VK_RIGHT:
				p.x+=1;break;
			case KeyEvent.VK_LEFT:
				p.x-=1;break;
			}
			repaint();
		}
	}
	class WindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			setVisible(false);
			System.exit(0);
		}
	}
}
