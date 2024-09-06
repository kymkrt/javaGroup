package t13_anonymous.t01;

public class Car extends Tire {

	@Override
	public void roll() {
		System.out.println("추상타이어가 굴러갑니다");
	}
	
	public void mod1() {
		System.out.println("이곳은 Car(자식객체)클래스의 mod1메소드입니다");
	}
	
	//추상클래스를 구현한 익명클래스 멤버클래스?
	Tire tire1 = new Tire() {//변수를 필드로 봄
		@Override
		public void roll() {
			System.out.println("익명개체에서의 타이어가 굴러갑니다");
		}
	};
	
	//여기까지가 익명크래슨
	public void mod2() {
		tire1.roll();
		tire1.roll2();
	}
	//메소드 안에서 익명클래스 사용 로컬클래스
	public void mod3() {
		Tire tire2 = new Tire() {
			@Override
			public void roll() {
				System.out.println("메소드안의 익명클래스안의 roll()메소드");
			}
		};
		tire2.roll();
		tire2.roll2();
	}
}