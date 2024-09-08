package t11_interface.t02;

public class Airplane implements Toy {
	private int age = 16;

	@Override
	public void age(int age) {
		System.out.println(age +" 살은 사용가능");
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
	
	@Override
	public int getAge() {
		return this.age;
	}

}