package t09_polymorphism.t1;

public class Bb extends Aa{
	public int su = 20;
	
	public Bb() {
		System.out.println("이곳은 Bb 기본생성자입니다");
	}
	
	public void modBb() {
		System.out.println("이곳은 Bb클래스의 modBb 메소드 입니다");
	}
	@Override
	public void modAa() {
		System.out.println("이곳은 Bb클래스의 modAa 메소드 입니다");
	}
	
}
