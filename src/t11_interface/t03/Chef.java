package t11_interface.t03;

public class Chef implements Action {

	@Override
	public void catching() {}

	@Override
	public void searching() {}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void pizza() {
		System.out.println("피자를 굽습니다");
	}

	@Override
	public void spaghetti() {
		System.out.println("스파게티 요리를 합니다");
	}


}
