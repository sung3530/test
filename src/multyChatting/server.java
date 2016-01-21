package multyChatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class server {

	private ServerSocket serverSocket;
	private Socket socket;
	private int port;
	private JButton jb;
	private JTextArea ta;
	private Vector vc=new Vector();
	static String[] userArray=new String[10];
	public server(int port,JButton jb,JTextArea ta){
		this.port=port;
		this.jb=jb;
		this.ta=ta;
		server_Start();
	}
	private void server_Start(){
		try {
			serverSocket=new ServerSocket(port);
			jb.setText("서버 실행중\n");
			jb.setEnabled(false);
			if(serverSocket!=null){
				connection();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ta.append("소켓이 이미 사용중입니다...\n");
		}
	}
	public void server_stop(){
		if(!serverSocket.isClosed()){
		try {
			
				serverSocket.close();
				ta.append("서버 종료중\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ta.append("서버 중지 실패\n");
			}
		}
		
	else{
		ta.append("서버 닫혀있어 뀨!!\n");
	}
		}
	private void connection(){
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while(true){
					try {
						ta.append("접속자 대기중...\n");
						socket=serverSocket.accept();
						ta.append("사용잡 접속!\n");
						user_Info user=new user_Info(socket,ta,vc,userArray);
						vc.add(user);
						user.start();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						ta.append("에러 발생.\n");
						if(serverSocket.isClosed())
							break;
					}
				}
			}
		});
		th.start();
	}
}
