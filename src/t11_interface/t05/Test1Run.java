package t11_interface.t05;

interface Aa{
	int AA = 10;
	void abc();
}

class Bb implements Aa{

	@Override
	public void abc() {
		System.out.println("이곳은 Bb클래스의 abc()메소드입니다");
	}
}
class Cc implements Aa{
	
	@Override
	public void abc() {
		System.out.println("이곳은 Cc클래스의 abc()메소드입니다");
	}
}

public class Test1Run {
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Cc c2 = new Cc();
	
		Aa b1 = new Bb();
		Aa b2 = new Bb();
		Aa c1 = new Cc();
		Aa c2 = new Cc();
		
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
		
	}
}
