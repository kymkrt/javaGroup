package t20_AWT.T1_Basic;

import java.awt.Frame;//awt에서 제공하는 frame

//container 처리(frame)  프레임이라는 컨테이너 / 컨테이너는 가장 밑바닥이다
public class Test1 {
	public static void main(String[] args) {
		//상속받아 사용 
		Frame frame=new Frame();//생성해서 사용 만약 상속하면 생성없이 다쓸수 있어서 편하다
		//set 뭐설정하는것 get 받아오는것
		frame.setTitle("awt frame");
		frame.setSize(300, 250); // 프레임의 크기(폭,높이) - 픽셀단위
		
		frame.setVisible(true);// 이거만 있으면 크기가 없어서 안나옴
		//화면에 보이는거 컨테이너 여러 종류가 있는데 이건 frame 컨테이너 이게 뷰가 된다
		//이것만 하면 뷰가 안닫힘 리스너가 없어서 클릭 감지를 못함
		//아답터에 이어지는 실제 동작을 해주는 핸들러까지 만들어야함 지금은 안꺼지므로 콘솔에서 정지 해야한다
		
		
	}
}
