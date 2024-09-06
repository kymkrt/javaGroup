package t14_exception.t01;

public class T6_NullPoint {

	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o : "+str.charAt(2));
		try {
			System.out.println("o : "+str2.charAt(2));
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("널값 오류 : "+e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
		
	}

}
