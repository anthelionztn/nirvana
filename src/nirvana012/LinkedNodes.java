package nirvana012;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LinkedNodes {
	public static void main(String[] args){
		System.out.println("今天看了算法，没写java，惭愧！");
		MyFrame mf = new MyFrame();
		mf.init();
	}	
}
class MyFrame extends Frame{
	public void init(){
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(new WindowMonitor());
	}

	class WindowMonitor extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
			setVisible(false);
			System.exit(0);
		}
	}
}
