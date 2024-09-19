package t20_AWT.T1_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//인터페이스 임플리먼트하는 법도 있음 근데 상속이 편함
//만약 다른 기능도 쓰고 싶다면 2개의 부모를 가져야하는데 자바는 다중 상속이 안되서 주기능만 상속하고 나머지는 인터페이스로 가져옴

//창닫는 기능이 frame에 없어서 다른걸로 가져옴 감지=리스너 윈도우에 제공하는 윈도우 윈도우 창에서 열엇기 때문ㅇ
public class Test3 extends Frame implements WindowListener{
	public Test3() {
//	super("awt frame");//set title하고 똑같음 사용자정의생성자라 이름 정하는걸로 정해놓음
	setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
		
		setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
		setSize(300, 250);
		
		setVisible(true);
		
		//이 스레드? 이므로 this 사용
		addWindowListener(this);//윈도우 감지 리스너가 동작 감지를 해서 핸들러(여기서는 클로징)에게 넘김
		//자바뿐만 아니라 웹에서도 작동원리 똑같음
	}
	
	//인터페이스라 추상메소드가 있어 오버라이딩
	//리스너이므로 이런것들을 감지하는것
	@Override
	public void windowOpened(WindowEvent e) {	}

	@Override
	public void windowClosing(WindowEvent e) {//닫는 동작
		//닫는다 메인스레드를 사용하지 않겠다
		System.exit(0);//0번쓰는 이유?
	}

	@Override
	public void windowClosed(WindowEvent e) {}//닫은것

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new Test3(); //생성자
	}
	
}
