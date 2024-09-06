package t14_exception.t01;

public class T9_Throw {
	public static void main(String[] args) {
		
		try {
			findMethod();
			System.out.println("찾는 클래스가 있습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다 "+e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
		
	}

	private static void findMethod() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
