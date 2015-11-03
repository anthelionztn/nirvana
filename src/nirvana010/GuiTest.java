package nirvana010;
import java.awt.*;
public class GuiTest {
	public static void main(String[] args){
		Frame f = new Frame("My first frame");
		Button b1 = new Button("hello");
		Button b2 = new Button("world");
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setBackground(Color.cyan);
		f.setVisible(true);
		f.add(b1);
		f.add(b2);
	}
}
