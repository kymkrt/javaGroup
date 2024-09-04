package t04_method;

public class Test1Run {
	public static void main(String[] args) {
		int su1;
		
		//기본생성자연습
		Test1 t11=new Test1();
		su1 = t11.mod2();
		System.out.println("su1 : "+su1);
		t11.mod3(500);
		System.out.println();
	
		//사용자 정의 생성자 연습
		Test1 t12 = new Test1(50);
		su1=t12.mod2();
		System.out.println("su1 : "+su1);
		t12.mod3(-500);
		System.out.println();
		t12.mod4();
		t12.mod5("김말숙");
	}
}
