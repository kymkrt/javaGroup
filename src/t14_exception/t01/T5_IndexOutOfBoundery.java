package t14_exception.t01;

//첨자오류
public class T5_IndexOutOfBoundery {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		for (int i=0;i<=array.length;i++) {
			try {
				System.out.println(i+"번째 : "+array[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("첨자 오류 : "+e.getMessage());
			}
		}
		System.out.println("작업끝");
	}
}
