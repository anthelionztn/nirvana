package nirvana009;

public class ThreadSync implements Runnable{
	Timer t = new Timer();
	public void run(){
		t.add(Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
		ThreadSync ts = new ThreadSync();
		Thread th1 = new Thread(ts);
		Thread th2 = new Thread(ts);
		th1.start();
		th2.start();
	}
}
class Timer{
	private int num =0;
	public synchronized void add(String name){
		//synchronized (this){
		num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(name+",ÄãÊÇµÚ"+num+"¸ö");
		//}
	}
}