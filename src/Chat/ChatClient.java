package Chat;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient extends Frame {
	TextField tfTxt = new TextField();
	TextArea taContent = new TextArea();

	public void launchFrame(){
		this.setLocation(400, 300);
		this.setSize(300, 300);
		this.add(tfTxt, BorderLayout.SOUTH);
		this.add(taContent, BorderLayout.NORTH);
        this.pack();
        tfTxt.addActionListener(new TFListener());
		this.setVisible(true);
        connect();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}

    public void connect(){
        try{
            Socket s = new Socket("127.0.0.1",8888);
            System.out.println("Connected!");
        }catch(UnknownHostException e1){
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace();
        }


    }
    private class TFListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tfTxt.getText().trim();//trim()È¥µô¿Õ¸ñ
            taContent.setText(s);
            tfTxt.setText("");
        }
    }
	
	
	public static void main(String[] args){
        new ChatClient().launchFrame();
	}
}
