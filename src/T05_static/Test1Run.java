package T05_static;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1.su : "+t1.su);
		t1.add(50, 100);
		
		System.out.println("su : "+Test1.su);
		
		Test1.add(100, 200);
	}
}
