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
			ta.append("���� ���� ����.\n");
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
			ta.append("��Ʈ�� ����\n");
		}
		send_message(id);
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						String msg = dis.readUTF();//�����κ��� �޼����ö����� ������ ���
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
							break; // ���� �߻��ϸ� while�� ����
						} catch (IOException e1) {
						}
					}//error ó��
				}//while��
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
		user_TextArea.append("������ ��� \n");
		for (int i = 0; i < server.userArray.length; i++) {
			if(server.userArray[i]!=null)
			user_TextArea.append(server.userArray[i]+"\n");
		}
		
	}
}
