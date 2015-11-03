package nirvana011;
import java.awt.*;
import java.awt.event.*;

public class TFPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFrame2();
	}

}

class TFrame2 extends Frame{
	TFrame2(){
		TextField t = new TextField();
		t.addActionListener(new Al());
		t.setEchoChar('*');
		this.add(t);
		this.pack();
		this.setVisible(true);
	}
}
class Al implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText(null);
	}
}