package nirvana009;
import java.util.*;
public class ThreadTest2 {
	public static void main(String[] args){
		Runner2 r = new Runner2();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<2000;i++){
			for(int j=0;j<10000;j++){
				System.out.println("Main thread"+i);
			}
		}	
		r.shutDown();
	}
}
class Runner2 implements Runnable{
	boolean flag = true;
	public void run(){
		while(flag){
			System.out.println("---"+new Date()+"---");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				return;
			}
		}		
	}
	public void shutDown(){
		flag = false;
	}
}