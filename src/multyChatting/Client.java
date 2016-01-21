package multyChatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JTextArea;

public class Client {

	private Socket socket;
	private String id;
	private int port;
	private String ip;
	private JTextArea ta;
	private JTextArea user_TextArea;
	private String[] user;
	private InputStream is;
	private DataInputStream dis;
	private OutputStream os;
	private DataOutputStream dos;
	
	public Client(JTextArea ta,JTextArea user_TextArea,String id,String ip, int port){
		this.ta=ta;
		this.user_TextArea=user_TextArea;
		this.id=id;
		this.ip=ip;
		this.port=port;
		
		network();
	}
	private void network(){
		
		try {
			socket=new Socket(ip,port);
			if(socket!=null){
				connection();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ta.append("소켓 접속 에러.\n");
		}
	}
	
	private void connection(){
		try{
		is=socket.getInputStream();
		dis=new DataInputStream(is);
		os=socket.getOutputStream();
		dos=new DataOutputStream(os);
		}
		catch (IOException e){
			ta.append("스트림 에러\n");
		}
		send_message(id);
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						String msg = dis.readUTF();//서버로부터 메세지올때까지 무한정 대기
						ta.append(msg+"\n");
						userTextArea();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						try {
							os.close();
							is.close();
							dos.close();
							dis.close();
							socket.close();
							break; // 에러 발생하면 while문 종료
						} catch (IOException e1) {
						}
					}//error 처리
				}//while문
			}
		});
		
		th.start();
	}
	void send_message(String msg){
		try {
			dos.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}
	public void userTextArea(){
		user_TextArea.setText("");
		user_TextArea.append("접속자 명단 \n");
		for (int i = 0; i < server.userArray.length; i++) {
			if(server.userArray[i]!=null)
			user_TextArea.append(server.userArray[i]+"\n");
		}
		
	}
}
