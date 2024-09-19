package t20_AWT.T3_Event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//여러가지 이벤트 그중 마우스 리스너
public class T1_MouseEvent extends Frame implements WindowListener, MouseListener{
	
	
	public T1_MouseEvent() {
		setTitle("마우스 이벤트 연습");
		setBounds(300,200,300,300);
		
		setVisible(true);
		
		/*=======================*/
		//리스너
		addWindowListener(this);
		addMouseListener(this);
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

	public static void main(String[] args) {
		new T1_MouseEvent();
	}
	//마우스 핸들러
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭했을때"); //콘솔에 뜸 시스템 아웃이기 때문
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스클릭하는 순간");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 클릭하고 놓는순간");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 객체안으로 들어갈때(진입할때)");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 객체밖으로 나갈때(진출할때)");
	}
}
