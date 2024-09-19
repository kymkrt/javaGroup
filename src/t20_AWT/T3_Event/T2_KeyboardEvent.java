package t20_AWT.T3_Event;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T2_KeyboardEvent extends Frame implements WindowListener, KeyListener{
	
	public T2_KeyboardEvent() {
		setTitle("키보드 이벤트 연습");
		setBounds(300, 250, 300, 300);
		
		
		setVisible(true);
		/*================*/
		addWindowListener(this);//이미 임플리먼트함
		addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new T2_KeyboardEvent();
	}
	
	//키보드 핸들러
	@Override
	public void keyTyped(KeyEvent e) {//키보드입력중
		System.out.println("키보드입력중");
	}
	@Override
	public void keyPressed(KeyEvent e) {//값을 입력받을때 보통 여기서 쓴다
		System.out.println("키보드 누르는순간"); //받는건 무조건 get
		System.out.println("입력된 키는 "+e.getKeyChar()+"/"+e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드 눌렀다가 놓는 순간");
	}
	//윈도우 핸들러
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}
