package t24_Lambda;

// 람다식을 이용하여 제곱 값을 구하시오(5를 입력받으면 5*5=25를 출력)

@FunctionalInterface
interface Myfunc7 {
	int calc (int x);
}

public class Test7 {
	public static void main(String[] args) {
//		x에 int 생략가능 위에서 int 를 썼기 때문에 int라는걸 알고 있다 위와 같은 타입기기만 하면됨 값이 아예 없을수도 있다 값을 안넘길경우
	Myfunc7 myfunc7 = (x) -> x*x;
	System.out.println("5의 제곱은 : "+myfunc7.calc(5));
	}
}
