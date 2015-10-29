package nirvana009;

public class ThreadTest1 {
	public static void main(String[] args){
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<1000;i++){
			System.out.println("Main thread"+i);
		}
		
	}

}
class Runner1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Runner thread"+i);
		}		
	}
}
