package multyChatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JTextArea;

public class user_Info extends Thread {
	private InputStream is;
	private DataInputStream dis;
	private OutputStream os;
	private DataOutputStream dos;
	private Socket User_socket;
	private JTextArea ta;
	private Vector vc;
	private String id;
	private int i=0;;
	
	public user_Info(Socket socket,JTextArea ta,Vector vc,String[] userArray){
		this.User_socket=socket;
		this.ta=ta;
		this.vc=vc;
		user_Network(userArray);
	}
	public void user_Network(String[] userArray){
		
		try{
			is=User_socket.getInputStream();
			dis=new DataInputStream(is);
			os=User_socket.getOutputStream();
			dos=new DataOutputStream(os);
			
			id=dis.readUTF();
		
			send_Message(id+" ���� ���� �Ϸ�.\n");
			send_Allpeople(id+"���� �����̽��ϴ�.\n");
			}
			catch (IOException e){
				ta.append("��Ʈ�� ����\n");
			}
		
		i=0;
		while(true){
			if(userArray[i]==null){
				userArray[i]=id;
				break;
			}
			i++;
		}
	}
	public void send_Allpeople(String str){
		for (int i = 0; i < vc.size(); i++) {
			user_Info ui=(user_Info)vc.elementAt(i);
			ui.send_Message(id+" : "+str);
		}
		
	}
	public void send_Message(String msg){
		try {
			dos.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		ta.append("�޽����۽ſ��� \n");
		}
	}
	
	public void run(){
		while(true){
			try {
				String message = dis.readUTF();//�۽ſË����� ������ ���
				send_Allpeople(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				try {
					dos.close();
					dis.close();
					User_socket.close();
					vc.removeElement( this ); // �������� ���� ��ü�� ���Ϳ��� �����
					ta.append(vc.size() +" : ���� ���Ϳ� ����� ����� ��\n");
					ta.append("����� ���� ������ �ڿ� �ݳ�\n");
					break;
				
				} catch (Exception ee) {
				
				}// catch�� ��
			}
		}
		
		
	}
}
