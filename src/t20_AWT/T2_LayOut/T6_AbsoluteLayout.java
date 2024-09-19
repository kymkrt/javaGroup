package t20_AWT.T2_LayOut;
//절대지정레이아웃 사용자지정 위치를 내가 주겠다

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T6_AbsoluteLayout extends Frame{
	Button btn1,btn2,btn3,btn4,btn5, btnExit;
	Label lbl1,lbl2,lbl3,lbl4,lbl5,lblExit;//레이블 넣기
	
	public T6_AbsoluteLayout() {
		setTitle("AbsoluteLayout 사용자지정 레이아웃");
		setBounds(400,300,350,400);
		setLayout(null);//아무것도 안줌 수동레이아웃
		//이러면 버튼을 디자인해서 뿌려야함
		
		btn1 = new Button("첫번째");
		btn2 = new Button("두번째");
		btn3 = new Button("세번째");
		btn4 = new Button("네번째");
		btn5 = new Button("다섯번째");
		btnExit = new Button("종료");
		
		//위치를 옮기고 싶을때 변수줘서 옮기면 편하다 
		int btnx = 150, btny =100;
		
		btn1.setBounds(btnx, btny, 150, 30);//바운드로 값을 줌 똑같이 하면 같은데서 나옴
		btn2.setBounds(btnx, btny+40, 150, 30);
		btn3.setBounds(btnx, btny+80, 150, 30);
		btn4.setBounds(btnx, btny+120, 150, 30);
		btn5.setBounds(btnx, btny+160, 150, 30);
		btnExit.setBounds(btnx, btny+200, 150, 30);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btnExit);
		
		//모두가 객체라 다 생성해야함
		lbl1 = new Label("하나");
		lbl2 = new Label("둘");
		lbl3 = new Label("셋");
		lbl4 = new Label("넷");
		lbl5 = new Label("다섯");
		lblExit = new Label("끝내기");
		
		lbl1.setBounds(50, 100, 100, 30);
		lbl2.setBounds(50, 140, 100, 30);
		lbl3.setBounds(50, 180, 100, 30);
		lbl4.setBounds(50, 220, 100, 30);
		lbl5.setBounds(50, 260, 100, 30);
		lblExit.setBounds(50, 300, 100, 30);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		add(lblExit);
		
		setVisible(true);
		/*=========메소드===============*/
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T6_AbsoluteLayout();
	}
}
