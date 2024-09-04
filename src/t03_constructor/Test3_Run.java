package t03_constructor;

public class Test3_Run {
	public static void main(String[] args) {
		new Test3();
		System.out.println();
		
		new Test3(500);
		System.out.println();
		new Test3(3.14);
		System.out.println("====================");
		
		Test3 t31 = new Test3();
		System.out.println("1 : "+t31.atom1);
		
		Test3 t32 = new Test3();
		System.out.println("2 : "+t32.atom1);
		
		t31.atom1=-100;
		System.out.println("3 : "+t31.atom1);
		System.out.println("4 : "+t32.atom1);
		System.out.println();
		
		Test3 t33= new Test3(1234);
		t33.atom1=4321;
		System.out.println("5 : "+t33.atom1);
		
		System.out.println("6 : "+t31.atom1);
		System.out.println("7 : "+t32.atom1);
		
		
		
		
		
		
	}
}
