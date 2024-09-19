package t20_AWT.T1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//스윙같은거는 익명 이너 클래스를 정말 많이 씀
//아답터 사용

@SuppressWarnings("serial")//이거에대해서는 예외체크안함 마우스 올리고 슈퍼리스워닝
public class Test9 extends Frame{
	public Test9() {//위치는 상관없다 기준잡으면 편함
//	super("awt frame");//set title하고 똑같음 사용자정의생성자라 이름 정하는걸로 정해놓음
		
		setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
//		setSize(300, 250);
		setBounds(300, 200, 350, 250);//x(0에서 x로 이만큼 떨어진다) y(x랑 같음)  
		
		//레이블 컴포넌트 
		Label label=new Label("레이블 테스트 입니다");//괄호안은 전부 제목
		this.add(label);//지금은 frame 사용중 this

		//버튼컴포넌트
		Button exitBtn=new Button("Exit");
//		this.add(button);
		add(exitBtn);//this는 내거라서 생략가능
		
		exitBtn.addActionListener(new ActionListener() {//인터페이스가 없어서 익명 이너 클래스 사용
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//그냥 쓰면 안쓰는게 너무 많다 =그래서 나온데 아답터 2개이상의 추상메소드를 가진건 무조건 아답터가 있다 
		addWindowListener(new WindowAdapter() {//아답터도 익명이너클래스 단점 안나와서 자기가 알아서 해야함
			@Override //아답터를 쓰면 예외임(인터페이스의 모든 추상메소드를 사용하지 않아도됨)
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test9(); //생성자
	}
}