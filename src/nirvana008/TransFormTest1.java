package nirvana008;
import java.io.*;
public class TransFormTest1 {
	public static void main(String[] args){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("D:/WorkSpace/nirvana/src/nirvana008/osw.txt"));
			osw.write("Hello World\n");//ʹ����OutputStreamWriter֮��Ϳ���ֱ��д��String��
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(
					new FileOutputStream("D:/WorkSpace/nirvana/src/nirvana008/osw.txt",true),"ISO8859_1");
			osw.write("Hello World again");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(FileNotFoundException e1){
			System.out.println("Can not find the file.");
		}catch(IOException e2){
			e2.printStackTrace();
		}		
	}
}
