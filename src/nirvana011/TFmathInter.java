package nirvana011;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TFmathInter {
	public static void main(String[] args){
		CalFrame2 cf2 = new CalFrame2();
		cf2.launchFrame();
	}
}
class CalFrame2 extends Frame{
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField();
		num2 = new TextField();
		num3 = new TextField();
		Label plus = new Label("+");
		Button eql = new Button("=");
		eql.addActionListener(new MyMonitor());
		this.add(num1);
		this.add(plus);
		this.add(num2);
		this.add(eql);
		this.add(num3);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	class MyMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int i = Integer.parseInt(num1.getText());
			int j = Integer.parseInt(num2.getText());
			num3.setText(""+(i+j));
		}
	}
}
