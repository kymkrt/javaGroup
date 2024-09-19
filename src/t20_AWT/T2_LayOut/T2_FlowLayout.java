package t20_AWT.T2_LayOut;
//플로우 레이아웃과 일반 레이아웃의 차이

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//스윙하면 기본 메인(클래스 생성), 생성자(내용)
@SuppressWarnings("serial")
public class T2_FlowLayout extends Frame{
	//생성자 안쓰면 메인메소드에 다 써야함 뷰는 생성할때 화면에 띄어야하기 때문에 생성자에 다 해놓음
	//생성자를 통해서 UI 설계처리한다
	public T2_FlowLayout() {
		super("FlowLayOut 연습!");//무슨 이유로 frame을 상속하나?
		
		setBounds(300, 250, 300, 300);
		setLayout(new FlowLayout());//플로우 레이아웃을 만들겠다
		//콘테이너 쌓고 플로우 레이아웃 쌓고 버튼 쌓음
		//플로우레이아웃의 특징 왼쪽부터 채우고 다 차면 아래로 내림
		
		Button btn1 = new Button("버튼 1");//한글깨지는거 주의
		Button btn2 = new Button("버튼 2");
		Button btn3 = new Button("버튼 3");
		Button btn4 = new Button("버튼 4");
		Button btn5 = new Button("버튼 5");
		Button btn6 = new Button("종료");
		
		//컨테이너에 올리는 명령 add
		add(btn1);
		add(btn2);//이렇게만 올리면 버튼1이 가려진다
		//그걸 안가려지게 디자인하는것 UI 설계, 직접쓰는것 UI 구현
		//여기서는 플로우레이아웃으로 배치
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		
		//add 빼고 넣기
		addWindowListener(new WindowAdapter() {//a로 바꿔주면 아답터 나옴
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//하나밖에 없어서 이렇게 나옴
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new T2_FlowLayout();
	}
}