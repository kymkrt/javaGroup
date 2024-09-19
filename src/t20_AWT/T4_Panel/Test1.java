package t20_AWT.T4_Panel;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//패널 앱솔루트 레이아웃 같은 느낌 

public class Test1 extends Frame{
	Panel pn1, pn2, pn3; //컨테이너
	Label lbl1, lbl2, lbl3; //컴포넌트
	
	public Test1() {
		setTitle("패널연습");
		setBounds(400, 350, 400, 350);
		setLayout(new GridLayout(3,1));
		
		//첫번째 패널
		pn1 =new Panel();
		lbl1 = new Label("첫번째 패널입니다");// 이 구조를 알아야 한다 프레임 컨테이너에 패널 컨테이너들을 여러개 올린다 그위 각각 패널에 컴포넌트 올림
		pn1.add(lbl1);//컨테이너(패널)에 컴포넌트(레이블)
		add(pn1);//프레임 컨테이너에 패널컨테이너
		
		//2번째 패널
		pn2 = new Panel();
		lbl2 = new Label("두번째 패널입니다");
		pn2.add(lbl2);
		add(pn2);
		
		//3번째 패널
		pn3 = new Panel();
		lbl3 = new Label("세번째 패널입니다");
		pn3.add(lbl3);
		add(pn3);
		
		
		setVisible(true);
		/*=================*/
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Test1();
	}
}