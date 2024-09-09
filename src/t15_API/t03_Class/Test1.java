package t15_API.t03_Class;
//나만 할수 있어서 쓰로우 안되고 트라이 캐치
//간단히 할때는 getmassage 다 나올게할때는 e.printStackTrace();
public class Test1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.Strings");
			System.out.println("String 클래스가 존재합니다");
		} catch (ClassNotFoundException e) {
			System.out.println("String 클래스가 존재하지 않습니다"+e.getMessage());
		}
		System.out.println("작업끝");
	}
}