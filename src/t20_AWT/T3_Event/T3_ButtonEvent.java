package t20_AWT.T3_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T3_ButtonEvent extends Frame implements ActionListener{
	Button btnPlay, btnStop, btnExit;
	
	public T3_ButtonEvent() {
		setTitle("버튼 이벤트 연습");
		setBounds(350, 300, 300, 250);
		setLayout(new FlowLayout());
		
		btnPlay = new Button("Start");
		btnStop = new Button("Stop");
		btnExit = new Button("Exit");
		
		add(btnPlay);
		add(btnStop);
		add(btnExit);
		
		setVisible(true);
		/*================*/
		//이벤트 발생-리스너가 감지-핸들러가 처리
		
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T3_ButtonEvent();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {//버튼 눌렀을때 동작
		Button btnText = (Button) e.getSource(); //해당객체에서 일어나는 모든 소스의 값을 지정
		
		if(btnText.getLabel().equals("Start")) System.out.println("시작버튼을 눌렀습니다");
		else if(btnText.getLabel().equals("Stop")) System.out.println("정지버튼을 눌렀습니다");
		else {
			System.out.println("종료버튼을 눌렀습니다");
			System.exit(0);
		}
	}
}