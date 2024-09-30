package t24_Lambda;
// Test2, Test3 둘다 쓰인데 취향차이
//함수형인터페이스를 사용하기 위해서는 선언해야함 인터페이스라 추상메소드가 있어야 함 그걸 하려면 생성자에 넣어서 하던가?

//나는 인터페이스지만 함수형인터페이스라고 알려줘야함
@FunctionalInterface
interface MyFunc3 {
//	함수형 인터페이스라서 안에 한개의 추상 메소드가 필요
	int add (int x, int y);
}

//함수를 만들고 그 함수를 이용할? 
//생성할때 이 내용을 적어줌


//그냥은 못쓰고 가져와야함 방법 1 임플리먼트 2 생성 근데 함수인터페이스는 상속이나 생성도 못함
//그래서 익명 이너 클래스사용
public class Test3 {

//	아예 생성자를 만들고 거기에 넣어버리는걸 자주씀
//	값을 받아야 함
	public Test3(int x, int y) {
		MyFunc3 myFunc3 = new MyFunc3() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
// 그냥 x y 넣으면 오류남
		int res=myFunc3.add(x, y);
		System.out.println("두수의 합 : "+res);
	}
		//사용자측(메인클래스)과 구현 클래스를 구별?
	public static void main(String[] args) {
//		함수적 인터페이스? 구현객체? 가 값을 받아서 해줌
		new Test3(20, 30);
	}
}
