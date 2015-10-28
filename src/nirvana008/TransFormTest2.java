package nirvana008;
import java.io.*;
public class TransFormTest2 {
	public static void main(String[] args){

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			try{
			while(s!=null){
				s = br.readLine();
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
