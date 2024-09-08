package t11_interface.t02;

public class Bear implements Toy {
	private int age = 0;

	@Override
	public void age(int age) {
		System.out.println(age +" 살은 사용가능");
	}

	@Override
	public void monving() {
		System.out.println("팔다리가 모두 움직일 수 있습니다");
	}

	@Override
	public void fire() {}

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
	
	@Override
	public int getAge() {
		return this.age;
	}

}