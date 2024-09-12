package t17_generic;
//타입을 T라고 하는것
class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
}
//하위타입을 제어하겠다 : 제네릭
public class Test1 {
	public static void main(String[] args) {
//		MyClass<String> mc1 = new MyClass<String>(); //원래는 이렇지만 생략가능
		MyClass<String> mc1 = new MyClass<>();
		mc1.setT("안녕하쇼");
		System.out.println("mc1 : "+mc1.getT());
		System.out.println();
		
		//여기에는 객체가 들어가야함 즉 객체타입으로
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);
		System.out.println("mc2 : "+mc2.getT());
		System.out.println();
		
	}
}
