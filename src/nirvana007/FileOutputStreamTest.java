package nirvana007;
import java.io.*;
public class FileOutputStreamTest {
	public static void main(String[] args){
		FileOutputStream out = null;
		FileInputStream in = null;
		int b = 0;
		try{
			in = new FileInputStream("D:/WorkSpace/nirvana/src/nirvana007/hwin.txt");
			out = new FileOutputStream("D:/WorkSpace/nirvana/src/nirvana007/hwout.txt");
			while((b=in.read())!=-1){
				out.write(b);
			}
			in.close();
			out.close();
		}catch(IOException i){
			i.printStackTrace();
			System.exit(-1);
		}
	}
}
