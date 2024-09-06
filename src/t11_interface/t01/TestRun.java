package t11_interface.t01;

public class TestRun {
	public static void main(String[] args) {
//		new Test1(); //인터페이스는 생성해서 사용할수 없다
		
		Seoul seoul =new Seoul();
		seoul.date();
		seoul.data2();
		System.out.println();
		
		Test1.data3();
		System.out.println();
		
		Busan busan = new Busan();
		busan.date();
		busan.date1(500);
		busan.date1(50000000);
		busan.date1(-500);
		
		
	}
}
