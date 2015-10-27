package nirvana007;
import java.io.*;
public class FileWRTest {
	public static void main(String[] args){
		FileReader r = null;
		FileWriter w = null;
		try{
			r = new FileReader("D:/WorkSpace/nirvana/src/nirvana007/FileInputStreamTest.java");
			w = new FileWriter("D:/WorkSpace/nirvana/src/nirvana007/WRT.txt");
			int c = 0;
			while((c=r.read())!=-1){
				w.write(c);
			}
			r.close();
			w.close();
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
	}
}