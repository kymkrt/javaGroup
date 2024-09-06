package t11_interface.t03;

public class Fireman implements Action {

	@Override
	public void catching() {}

	@Override
	public void searching() {}

	@Override
	public void fire() {
		System.out.println("화재진압을 합니다");
	}

	@Override
	public void rescue() {
		System.out.println("생명구조를 합니다");
	}

	@Override
	public void pizza() {}

	@Override
	public void spaghetti() {}


}
