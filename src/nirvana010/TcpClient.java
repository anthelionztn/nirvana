package nirvana010;
import java.net.*;
import java.io.*;
public class TcpClient {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("172.0.0.1",6666);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Hello");
		dos.flush();
		dos.close();
	}
}
