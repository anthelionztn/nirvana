package nirvana010;
import java.io.*;
import java.net.*;
public class TcpServer {
	public static void main (String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(6666);
		while(true){
			Socket s = ss.accept();
			System.out.println("I'm connecting...");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
		}

	}
}
