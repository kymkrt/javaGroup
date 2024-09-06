package t14_exception.t01;

public class T3_Arrithmetic {
	public static void main(String[] args) {
		//계산오류
		int su1 =10, su2 =0;
		
		try {
		System.out.println("10/0 = "+(su1/su2));
		System.out.println("정상처리");
		} catch(ArithmeticException e){
			System.out.println("연산오류 : "+e.getMessage());
		}
		System.out.println("작업끝");
	}
}