package nirvana005;
import java.io.*;
public class FileTest {
	public static void main(String[] args){
		File f = new File("d:/WorkSpace/nirvana/src");
		FileTree(f,0);
		
	}
	public static void FileTree(File f,int l){
		File[] list = f.listFiles();
		String preStr = "    ";
		for(int i=0;i<l;i++){
			preStr+="    ";
		}
		for(int i=0;i<list.length;i++){
			System.out.println(preStr+list[i].getName());
			if(list[i].isDirectory()){
				FileTree(list[i],l+1);
			}
		}
	}
}
