package t13_anonymous.t02;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		car.roll();
		car.roll2();
		System.out.println();
		
		car.mod1();
		car.mod2();
		System.out.println();
		
		car.mod3();
		System.out.println();
		
		//인터페이스의 내용처리
		car.companyName("금호타이어");
		System.out.println();
		
		car.mod4();
	}
}