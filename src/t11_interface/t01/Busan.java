package t11_interface.t01;

public class Busan implements Test1{

	@Override
	public void date() {
		System.out.println("이곳은 Busan 클래스의 data메소드입니다");
	}

	@Override
	public void date1(int su) {
		int sori=0;
		if(su>MAX) sori=MAX;
		else if(su<MIN) sori=MIN;
		System.out.println("sori : "+sori);
	}

}
