package t24_Lambda;


@FunctionalInterface
interface MyFunc4 {
//	선언부만 만들어준다
	int sub(int x, int y);
	
}

//함수인터페이스는 임플리 안하고 익명이너클래스로 만든다
public class Test4 {
	public static void main(String[] args) {
	MyFunc4 myFunc = new MyFunc4() {
		
		@Override
		public int sub(int x, int y) {
			return x-y;
		}
	};
	
//	int res = muFunc
	}
}