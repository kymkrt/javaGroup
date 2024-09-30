package t24_Lambda;

//람다식을 사용하여 두수의 나눗셈을 구하시오

@FunctionalInterface
interface MyFunc6 {
	double div(double x, double y);
}



public class Test6 {
	public static void main(String[] args) {
		MyFunc6 myFunc6 = (double x, double y) -> x/y;
		
		double res = myFunc6.div(20.0, 5.0);
		System.out.println("res : "+res);
	}
}
