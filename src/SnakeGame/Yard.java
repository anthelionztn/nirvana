package SnakeGame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

public class Yard extends Frame {

	public static final int ROWS = 50;
	public static final int COLS = 50;
	public static final int BLOCK_SIZE = 10;
	Snake s = new Snake();
	
	Image offScreenImage = null;//Ë«»º³å
	
	public void launch(){
		this.setLocation(200,200);
		this.setSize(COLS*BLOCK_SIZE, ROWS*BLOCK_SIZE);
		this.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
			
		});
		this.addKeyListener(new KeyMonitor());
		this.setVisible(true);
		new Thread(new PaintThread()).start();
	}

	@Override
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, COLS*BLOCK_SIZE, ROWS*BLOCK_SIZE);
		g.setColor(Color.DARK_GRAY);
		//»­³öºáÏß
		for(int i=1;i<ROWS;i++){
			g.drawLine(0, BLOCK_SIZE*i, COLS*BLOCK_SIZE, BLOCK_SIZE*i);
		}
		//»­³öÊúÏß
		for(int j=1;j<ROWS;j++){
			g.drawLine(BLOCK_SIZE*j, 0, BLOCK_SIZE*j, ROWS*BLOCK_SIZE);
		}
		s.draw(g);
		g.setColor(c);
	}
	
	@Override//Ë«»º³å
	public void update(Graphics g) {
		if(offScreenImage==null){
			offScreenImage = this.createImage(COLS*BLOCK_SIZE, ROWS*BLOCK_SIZE);
		}
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	private class PaintThread implements Runnable{
		public void run() {
			while(true){
				repaint();
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}	
		}
	}
	
	public class KeyMonitor extends KeyAdapter{

		public void keyPressed(KeyEvent e) {
			s.keyPressed(e);
		}		
	}

	public static void main(String[] args) {
		new Yard().launch();
	}
}
