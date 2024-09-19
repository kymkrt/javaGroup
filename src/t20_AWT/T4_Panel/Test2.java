package t20_AWT.T4_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//패널 앱솔루트 레이아웃 같은 느낌 
//버튼추가
//셀병합이 없기 때문에 일일히 다 쪼개야함 행 가로 열 세로
//색깔주기

public class Test2 extends Frame{
	Panel pn1, pn2, pn3, pn4, pn5; //컨테이너
	Label lbl1, lbl2, lbl3; //컴포넌트
	Button btnExit;
	
	public Test2() {
		setTitle("패널연습");
		setBounds(400, 350, 400, 350);
		setLayout(new GridLayout(1,2));
		
		//ui 설계 
		pn1 =new Panel();
		pn1.setLayout(new GridLayout(3,1));
		pn2 = new Panel();
		pn2.setLayout(new GridLayout(1,1));
		pn2.setBackground(Color.BLUE);//색은 열거형으로 되있음 color클래스
		
		btnExit = new Button("Exit");
		btnExit.setBackground(Color.magenta);
		pn2.add(btnExit);
		
		pn3 = new Panel();
		pn3.setBackground(Color.gray);
		pn4 = new Panel();
		pn4.setBackground(Color.darkGray);
		pn5 = new Panel();
		pn5.setBackground(Color.lightGray);
		
		lbl1 = new Label("첫번째 패널입니다");
		lbl2 = new Label("두번째 패널입니다");
		lbl3 = new Label("세번째 패널입니다");
		
		pn3.add(lbl1);
		pn4.add(lbl2);
		pn5.add(lbl3);
		
		pn1.add(pn3);
		pn1.add(pn4);
		pn1.add(pn5);
		
		add(pn1);
		add(pn2);
		
		setVisible(true);
		/*=================*/
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
		new Test2();
	}
}