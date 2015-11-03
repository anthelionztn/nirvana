package nirvana011;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
public class TFmath {
	public static void main(String[] args){
		CalFrame cf = new CalFrame();
		cf.launchFrame();
	}
}
class CalFrame extends Frame{
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField();
		num2 = new TextField();
		num3 = new TextField();
		Label plus = new Label("+");
		Button eql = new Button("=");
		eql.addActionListener(new Al2(this));
		this.add(num1);
		this.add(plus);
		this.add(num2);
		this.add(eql);
		this.add(num3);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
}
class Al2 implements ActionListener{
	CalFrame cf = null;
	public Al2(CalFrame cf){
		this.cf = cf;
	}
	public void actionPerformed(ActionEvent e){
		int i = Integer.parseInt(cf.num1.getText());
		int j = Integer.parseInt(cf.num2.getText());
		cf.num3.setText(""+(i+j));
	}
}