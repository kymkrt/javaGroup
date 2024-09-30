package t24_Lambda;

//Test2, Test3 둘다 쓰인데 취향차이

//나는 인터페이스지만 함수형인터페이스라고 알려줘야함
@FunctionalInterface
interface MyFunc2 {
//	함수형 인터페이스라서 안에 한개의 추상 메소드가 필요
	int add (int x, int y);
}

//그냥은 못쓰고 가져와야함 방법 1 임플리먼트 2 생성 근데 함수인터페이스는 상속이나 생성도 못함
//그래서 익명 이너 클래스사용
public class Test2 {
	public static void main(String[] args) {
		MyFunc2 myFunc2 = new MyFunc2() {
//스윙하고 비슷함 익명 이너 클래스			
//			자동으로 오버라이딩 됨
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
//		사용할때 불러씀
		int res=myFunc2.add(10, 20);
		System.out.println("두수의 합 : "+res);
	}
}
