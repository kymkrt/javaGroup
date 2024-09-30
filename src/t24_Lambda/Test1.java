package t24_Lambda;

//람다식을 구현하기 위해서는 '함수형(적) 인터페이스' 를 생성해준다.
//함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.
//함수형 인터페이스의 선언 : @FunctionalInterface

//어노테이션 이걸 쓰면 바로 함수형 인터페이스가 됨
@FunctionalInterface
interface myFunc1 {
	int add(int x, int y);
//	int sub(int x, int y); 2개 있으면 오류남
}

//대표적인 클래스만 앞에 public을 붙여야 한다
public class Test1 {
//	어차피 추상메소는드는 하나라서 굳이 오버라이드 할필요없음
//	그냥 쓸수 있다 그게 함수형 인터페이스?
//	public class Test1 implements myFunc1{
	private void mian() {
		// TODO Auto-generated method stub

	}

//	@Override
//	public int add(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
	}
//
	
