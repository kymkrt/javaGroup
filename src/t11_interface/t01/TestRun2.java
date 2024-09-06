package t11_interface.t01;

public class TestRun2 {
	public static void main(String[] args) {
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
		System.out.println("=====================");
		
		Test1[] test1 = {new Seoul(), new Busan()};
		for(int i=0;i<test1.length;i++) {
			test1[i].date();
			test1[i].date1(600);
			test1[i].date1(600000000);
			test1[i].date1(-600);
			
		}
	}
}
