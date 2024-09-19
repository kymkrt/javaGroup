package t20_AWT.T2_LayOut;
//보더레이아웃

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T3_BorderLayout extends Frame{
	//필요한 필드를 바깥에 빼서 메소드가 쓰기 편하게 해둔다 메소드가 너무 많으면 생성자 밖에 두는게 좋기 때문
	Button btn1,btn2,btn3,btn4,btn5;
	
	public T3_BorderLayout() {
		/*============UI(화면설계)============*/
		setTitle("BorderLayout 연습");
		setBounds(300, 200,300,300);//xy폭높이
		setLayout(new BorderLayout());//보더레이아웃은 동서남북 센터
		
		btn1=new Button("동쪽"); 
		btn2=new Button("서쪽"); 
		btn3=new Button("남쪽"); 
		btn4=new Button("북쪽"); 
		btn5=new Button("가운데"); 
		
		//보더레이아웃은 열겨형이다 즉 스태틱 파이널 그러므로 클래스명으로 들어간다
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
//		add(btn4, BorderLayout.NORTH);
//		add(btn5, BorderLayout.CENTER);//제일 마지막이 제일위
		add(btn4, "North");//상수취급해서 이렇게 쓸수도 있다 첫글자 대문자 위 방법이 정석이긴함
		add(btn5, "Center");
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		
		/*===========코드(메소드처리)================*/
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new T3_BorderLayout();
	}
}
