package t20_AWT.T1_Basic;
//보통 이렇게 상속하는걸로 사용
import java.awt.Frame;

public class Test2 extends Frame{// 상속받아서 사용하는법
	
	public Test2() {// 상속 받으므로 자동으로 frame도 만듬 슈퍼로
		super("awt frame");//set title하고 똑같음 사용자정의생성자라 이름 정하는걸로 정해놓음
//		setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
		setSize(300, 250);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test2();//프레임을 상속받은 테스트 2를 생성하면 자동으로 부모까지 생성됨
	}
}
