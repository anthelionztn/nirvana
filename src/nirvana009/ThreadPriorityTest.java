package nirvana009;

public class ThreadPriorityTest {
	public static void main(String[] args){
		Runner3 r1 = new Runner3();
		Runner4 r2 = new Runner4();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(Thread.NORM_PRIORITY+3);
		t1.start();
		t2.start();
	}
}
class Runner3 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("thread "+i);
		}
	}
}
class Runner4 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("_____thread "+i);
		}
	}
}