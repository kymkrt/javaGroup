package t11_interface.t05;

public class Test2Run {
	public static void main(String[] args) {
//		new Test2();
		
		Test2 t22 = new Test2() {
			int atom=20;
			
			public void abc() {
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t22 익명 객체 안의 abc()메소드 입니다");
				System.out.println("AA = "+AA+" atom = "+atom+" tmep : "+temp);
			}
		};
		Test2 t23 = new Test2() {
			int atom=40;
			
			public void abc() {
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t23 익명 객체 안의 abc()메소드 입니다");
				System.out.println("AA = "+AA+" atom = "+atom+" tmep : "+temp);
			}
		};
		
		//익명개체 안의 메소드 접근(호출)
		//인터페이스 변수로 익명객체안의 필드와 일반변수는 접근 불가이다
//		t22.atom 은 호출불가
		t22.abc();
		System.out.println();
		t23.abc();
		
		if(t22==t23) {
			System.out.println("같은 객체를 가리킵니다");
		}else {
			System.out.println("서로 다른 객체를 가리킵니다");
		}
	}
}
