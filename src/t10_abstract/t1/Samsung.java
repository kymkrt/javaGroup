package t10_abstract.t1;

public class Samsung extends Phone {

	public Samsung(String name) {
		super(name+"(samsung)");
		
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 삼성페이 기능이 우수합니다");
	}

	@Override
	public void sound() {
		System.out.println(getName()+"폰의 전화벨소리는 띠리리리리리리리리 입니다");
	}
	
	@Override
	public void functionSamsung() {
		System.out.println("이번에 새로 추가된 기능은 ai번역입니다");
	}

}
