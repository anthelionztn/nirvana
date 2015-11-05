package SnakeGame;

import java.awt.*;
import java.awt.event.*;

public class Snake {
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	private Node n = new Node(20,30,Dir.L);
	private Yard y;
	//初始化一条蛇
	public Snake(Yard y){
		head = n;
		tail = n;
		size = 1;		
		this.y = y;
	}	
	
	public void addToTail(){
		Node node =null;
		switch(tail.dir){
			case L:
				node = new Node(tail.row,tail.col+1,tail.dir);break;
			case R:
				node = new Node(tail.row,tail.col-1,tail.dir);break;
			case U:
				node = new Node(tail.row+1,tail.col,tail.dir);break;
			case D:
				node = new Node(tail.row-1,tail.col,tail.dir);break;
		}
		tail.next = node;
		node.prev = tail;
		tail = node;//这是一个双向链表，先把原来tail的next指向new出来的node，再把node的prev指向原来的tail，
					//此时新node添加完毕，最后这个新node成为新tail
		size++;
	}
	
	public void addToHead(){
		Node node =null;
		switch(head.dir){
			case L:
				node = new Node(head.row,head.col-1,head.dir);break;
			case R:
				node = new Node(head.row,head.col+1,head.dir);break;
			case U:
				node = new Node(head.row-1,head.col,head.dir);break;
			case D:
				node = new Node(head.row+1,head.col,head.dir);break;
		}
		head.prev = node;
		node.next = head;
		head = node;//双向链表，同理
		size++;
	}
	//画整条蛇的draw方法
	public void draw(Graphics g){
		move();
		if(size<=0) return;
		for(Node n=head;n!=null;n=n.next){
			n.draw(g);
		}

	}
	
	private void move() {
		addToHead();
		deleteFromeTail();	
		checkDead();
	}

	private void checkDead() {
		if(head.row<0||head.row>Yard.ROWS||head.col<0||head.col>Yard.COLS){
			y.stop();
			System.out.println("Game Over!");
		}
		for(Node n=head.next;n!=null;n=n.next){
			if(head.row==n.row&&head.col==n.col){
				y.stop();
				System.out.println("Game Over!");
			}
		}
	}

	private void deleteFromeTail() {
		if(size==0) return;
		tail = tail.prev;
		tail.next = null;
	}
	
	public void eat(Egg e){
		if(this.getRect().intersects(e.getRect())){
			e.reAppear();
			this.addToHead();
			y.score+=5;
		}
	}
	
	public Rectangle getRect(){
		return new Rectangle(Yard.BLOCK_SIZE*head.col, Yard.BLOCK_SIZE*head.row, head.w, head.h);
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_LEFT:
				if(head.dir!=Dir.R)
					head.dir = Dir.L;
				break;
			case KeyEvent.VK_RIGHT:
				if(head.dir!=Dir.L)
					head.dir = Dir.R;
				break;
			case KeyEvent.VK_UP:
				if(head.dir!=Dir.D)
					head.dir = Dir.U;
				break;
			case KeyEvent.VK_DOWN:
				if(head.dir!=Dir.U)
					head.dir = Dir.D;
				break;
		}
	}
	//内部类Node
	private class Node{
		int w = Yard.BLOCK_SIZE;
		int h = Yard.BLOCK_SIZE;
		int row, col;
		Dir dir = Dir.L;
		Node next = null;
		Node prev = null;
		Node(int row, int col, Dir dir) {
			super();
			this.row = row;
			this.col = col;
			this.dir = dir;
		}
		//画node的draw方法
		void draw(Graphics g){
			Color c = g.getColor();
			g.setColor(Color.BLACK);
			g.fillRect(Yard.BLOCK_SIZE*col, Yard.BLOCK_SIZE*row, w, h);
			g.setColor(c);
		}	
	}
}
