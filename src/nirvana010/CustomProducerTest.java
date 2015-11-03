package nirvana010;

public class CustomProducerTest {
	public static void main(String[] args){
		SyncStack ss = new SyncStack();
		Producer p1 = new Producer(ss);
		Producer p2 = new Producer(ss);
		Customer c1 = new Customer(ss);
		Customer c2 = new Customer(ss);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(c1);
		Thread t4 = new Thread(c2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Cake{
	int id = 0;
	public Cake(int id){
		this.id = id;
	}
	public String toString(){
		return "Cake id:"+id;
	}
}

class SyncStack{
	int index = 0;
	Cake[] cakeStack = new Cake[6];
	
	public synchronized void push(Cake c){
		while(index==cakeStack.length-1){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notifyAll();
		cakeStack[index] = c;
		index++;
	}
	
	public synchronized Cake pop(){
		while(index==0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notifyAll();
		index--;
		return cakeStack[index];
	}
}

class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	public void run(){
		for(int i=0;i<10;i++){
			Cake c = new Cake(i);
			ss.push(c);
		}
	}		
}

class Customer implements Runnable{
	SyncStack ss = null;
	Customer(SyncStack ss){
		this.ss = ss;
	}
	public void run(){
		for(int i=0;i<10;i++){
			ss.pop();
		}
	}
}





