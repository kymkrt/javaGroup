package t11_interface.t02;

public class Airplane implements Toy {
	private int age = 16;

	@Override
	public void age() {
		System.out.println(age+"세 이상만 사용하실수 있습니다");
	}

	@Override
	public void monving() {}

	@Override
	public void fire() {}

	@Override
	public void missile() {
		System.out.println("미사일 발사 기능이 있습니다");
	}

	@Override
	public int possibleAge() {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : "+name);
	}


}