package nirvana007;
import java.io.*;
public class FileInputStreamTest {
	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		int b = 0;
		
		try{
			in = new FileInputStream("D:/WorkSpace/nirvana/src/nirvana007/FileInputStreamTest.java");
		}catch(FileNotFoundException e){
			System.out.println("Can not find this file");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b=in.read())!=-1){
				System.out.print((char)b);
				num++;
			}
			System.out.println();
			System.out.println("一共输出了"+num+"个字符。");
		}catch(IOException i){
			System.out.println("Error");
			System.exit(-1);
		}
		in.close();
		
	}
}
