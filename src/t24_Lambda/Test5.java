package t24_Lambda;

//함수형 인터페이스를 이용한 두수의 곱을 구하는 '함수(추상메소드)'를 완성하시오

interface MyFunc5 {
//	앞에 public abstract가 생략
	int mul(int x, int y);
}

public class Test5 {
	public static void main(String[] args) {
	
//		원래는 이렇게 함
//	MyFunc5 myFunc5 = new MyFunc5() {
//		@Override
//		public int mul(int x, int y) {
//			return x*y;
//		}
//	};
//		선언부에서 펑션 부분 생략하고 구현부분을 쓴다?
//		펑션 부분 생략?
//		애로우 펑션
//		한줄일때는 리턴, 중괄호 생략가능
		MyFunc5 myFunc5 = (int x, int y) -> x*y;
		
//			이렇게도 가능
//			return x*y;
//		};
		
	int res = myFunc5.mul(10, 20);
	System.out.println("곱하기 값 : "+res);
	}
}
