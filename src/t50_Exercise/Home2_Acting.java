package t50_Exercise;


public class Home2_Acting implements Home2_Actor{

	@Override
	public void catching(String name) {
		System.out.println(name+"은 범인을 잡습니다");
	}

	@Override
	public void searching(String name) {
		System.out.println(name+"은 물건을 찾습니다");
	}

	@Override
	public void rescue(String name) {
		System.out.println(name+"은 구조를 합니다");
	}

	@Override
	public void extinguish(String name) {
		System.out.println(name+"은 불을 끕니다");
	}

	@Override
	public void pizza(String name) {
		System.out.println(name+"는 피자를 만듭니다");
	}

	@Override
	public void spaghetti(String name) {
		System.out.println(name+"는 스파게티를 만듭니다");
	}

	@Override
	public void info(String name) {
		System.out.println("선택하신 직업은 "+name+" 입니다.");
		
	}

}
