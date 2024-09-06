package t11_interface.t02;

public class Robot implements Toy {
	private int age = 8;

	@Override
	public void age() {
		System.out.println(age+"세 이상만 사용하실수 있습니다");
	}

	@Override
	public void monving() {
		System.out.println("팔다리가 모두 움직일 수 있습니다");
	}

	@Override
	public void fire() {
		System.out.println("레이저 빔 발사기능이 있습니다");
	}

	@Override
	public void missile() {}

	@Override
	public int possibleAge() {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : "+name);
	}


}