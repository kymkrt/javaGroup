package t07_Singletone;

public class Singletone {
	// 2.정적필드(자신의 객체타입)를 선언하고 초기값으로 객체를 생성시킨다
	private static Singletone singletone = new Singletone();
	
	//1. 객체를 외부에서 생성하지 못하도록 생성자 앞에 접근제한자로 붙여준다  private
	private Singletone() {
	}
	
	//3. 외부에서 호출하여 사용할수 있는 정적메소드(게터)를 만든다
	static Singletone getInstance() {
		return singletone;
	}
}