package t20_AWT.T1_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//창을 쓰는 다른 방법

//창닫는 기능이 frame에 없어서 다른걸로 가져옴 감지=리스너 윈도우에 제공하는 윈도우 윈도우 창에서 열엇기 때문ㅇ
public class Test4 extends Frame implements WindowListener{
	public Test4() {
//	super("awt frame");//set title하고 똑같음 사용자정의생성자라 이름 정하는걸로 정해놓음
		
		setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
//		setSize(300, 250);
		setBounds(300, 200, 350, 250);//x(0에서 x로 이만큼 떨어진다) y(x랑 같음)  
		//윈도우는 좌표의 0점이 왼쪽위다(원래는 왼쪽 아래) -의 방향도 다르다
		
		
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
		new Test4(); //생성자
	}
	
}
