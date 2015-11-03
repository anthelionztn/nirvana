package nirvana011;
import java.awt.*;
public class PaintTest {
	public static void main(String[] args){
		PaintFrame pf = new PaintFrame();
		pf.launchFrame();
	}
}
class PaintFrame extends Frame{
	public void launchFrame(){
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
	}
	public void paint(Graphics g){
		Color c = g.getColor();//记录现场颜色
		g.setColor(Color.MAGENTA);
		g.fillRect(50, 50, 100, 100);
		g.setColor(c);//恢复现场颜色
	}
}
