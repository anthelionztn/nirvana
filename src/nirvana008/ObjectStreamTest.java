package nirvana008;
import java.io.*;
public class ObjectStreamTest {
	public static void main(String[] args) throws IOException{
		T t = new T();
		t.a = 11;
		FileOutputStream fos = new FileOutputStream("D:/WorkSpace/nirvana/src/nirvana008/objectStreamTest.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("D:/WorkSpace/nirvana/src/nirvana008/objectStreamTest.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T rT = new T();
		try{
			rT = (T)ois.readObject();
			System.out.println(rT);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}
}
class T implements Serializable{
	int a = 15;
	double b = 2000;
	String c = "hello world";
	transient int d = 20;//object在序列化时不考虑此成员变量 
	public String toString(){
		return "a:"+a+"\n"+"b:"+b+"\n"+"c:"+c+"\n"+"d:"+d+"\n";
	}
}
