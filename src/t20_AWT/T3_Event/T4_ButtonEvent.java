package t20_AWT.T3_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T4_ButtonEvent extends Frame implements ActionListener{
	Button btnPlay, btnStop, btnExit, btnMessage;
	Label lblMessage;//버튼누르면 메세지 뛰우기
	
	public T4_ButtonEvent() {
		setTitle("버튼 이벤트 연습");
		setBounds(350, 300, 300, 250);
		setLayout(new FlowLayout());
		
		btnPlay = new Button("Start");
		btnStop = new Button("Stop");
		btnExit = new Button("Exit");
		btnMessage = new Button("Message");
		
		add(btnPlay);
		add(btnStop);
		add(btnExit);
		add(btnMessage);
		
		lblMessage = new Label();//컴포넌트 만들고
		add(lblMessage);//올리고 이렇게의 반복
		
		setVisible(true);
		/*================*/
		//이벤트 발생-리스너가 감지-핸들러가 처리
		
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);
		btnMessage.addActionListener(this);//메세지 버튼도 감시자가 있어야 한다
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T4_ButtonEvent();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//버튼 눌렀을때 동작
		Button btnText = (Button) e.getSource(); //해당객체에서 일어나는 모든 소스의 값을 지정
		
		if(btnText.getLabel().equals("Start")) {
			System.out.println("시작버튼을 눌렀습니다");
			lblMessage.setText("Start");
			
			}
		else if(btnText.getLabel().equals("Stop")) {
			System.out.println("정지버튼을 눌렀습니다");
			lblMessage.setText("Stop");
			}
		else if(btnText.getLabel().equals("Exit")){
			System.out.println("종료버튼을 눌렀습니다");
			lblMessage.setText("Exit");
			System.exit(0);
		}
		else if(btnText.getLabel().equals("Message")) {
			System.out.println("메세지 버튼을 눌렀습니다");
			lblMessage.setText("message");
		}
	}
}