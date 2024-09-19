package t20_AWT.T1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//컴포넌트 사용 여기서는 버튼
//모든게 다 객체다
//데이터 베이스의 명령어도 한줄 한줄이 다 객체다 vo에서 가져와서 vos
//이 객체 하나하나를 컴포넌트라고 한다 여기서는 버튼 컴포넌트 사용
//사용하는 모든 컴포넌트는 생성

//창닫는 기능이 frame에 없어서 다른걸로 가져옴 감지=리스너 윈도우에 제공하는 윈도우 윈도우 창에서 열엇기 때문ㅇ
@SuppressWarnings("serial")//이거에대해서는 예외체크안함 마우스 올리고 슈퍼리스워닝
public class Test6 extends Frame implements WindowListener{
	public Test6() {//위치는 상관없다 기준잡으면 편함
//	super("awt frame");//set title하고 똑같음 사용자정의생성자라 이름 정하는걸로 정해놓음
		
		setTitle("awt frame");//상속받은거라 그냥 쓰기 가능 
//		setSize(300, 250);
		setBounds(300, 200, 350, 250);//x(0에서 x로 이만큼 떨어진다) y(x랑 같음)  
		//윈도우는 좌표의 0점이 왼쪽위다(원래는 왼쪽 아래) -의 방향도 다르다
		
		//레이블 컴포넌트 
		Label label=new Label("레이블 테스트 입니다");//괄호안은 전부 제목
		//이 컴포넌트를 컨테이너에 올려야 보인다
		this.add(label);//지금은 frame 사용중 this
		//한글이 깨짐 AWT는 OS에 종속적 윈도우는 UTF8이 아니라 다른거 씀 그래서 깨짐
//		-Dfile.encoding=MS949 런컨프리케이션-아규먼트-vm아규먼트(대소문자 구별)에 붙여넣기 하고 저장
		//버튼컴포넌트
		Button button=new Button("Exit");
//		this.add(button);
		add(button);//this는 내거라서 생략가능
		//눌러도 작동없음 리스너가 없다
		
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
		System.exit(0);//0번쓰는 이유 0이 정상종료 1혹은 그 이상이면 비정상 종료 오류가 발생했을 경우 다른 값을 반환하여, 호출한 프로세스나 스크립트에서 오류를 감지할 수 있게 합니다.
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
		new Test6(); //생성자
	}
	
}
