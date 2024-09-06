package t14_exception.t01;

public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNo = "1234";
		String strNo2 = "1234c";
		
		int num = Integer.parseInt(strNo);
		System.out.println(num+1000);
		try {
			num = Integer.parseInt(strNo2);
			System.out.println(num+1000);
			System.out.println("정상처리");
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : "+e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
		
	}
}
