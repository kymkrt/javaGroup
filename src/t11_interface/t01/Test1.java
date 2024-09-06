package t11_interface.t01;

public interface Test1 {
//	int max = 1000000;
//	public final static int MAX = 1000000;
	int MAX = 1000000;
	int MIN = 0;
	
//	public void date();
//	void date();
	void date();
	void date1(int su);
	
	default void data2() {
		//실행할내용을 포함/생략
		System.out.println("이곳은 data2 메소드 (default)");
	}
	
	static void data3() {
		//실행할내용을 포함/생략
		System.out.println("이곳은 data3 메소드 (default)");
		
	}
	
	
}