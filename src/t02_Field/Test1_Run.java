package t02_Field;

public class Test1_Run {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println("t1.su1 : "+t1.su1);
		System.out.println("t1.su2 : "+t1.su2);
		System.out.println();
		System.out.println("t1.d1 : "+t1.d1);
		System.out.println("t1.d2 : "+t1.d2);
		System.out.println();
		System.out.println("t1.l1 : "+t1.l1);
		System.out.println("t1.l2 : "+t1.l2);
		System.out.println("=======================================");
		
		Test1 t2 = new Test1();
		System.out.println("t2.su1 : "+t2.su1);
		System.out.println("t2.su2 : "+t2.su2);
		t2.su1=500;
		System.out.println("t2.su1 : "+t2.su1);
		t2.su1+=t1.su2;
		System.out.println("t2.su1 : "+t2.su1);
		System.out.println();
		
		System.out.println("t1.su1 : "+t1.su1);
		System.out.println("t1.su2 : "+t1.su2);
		
		
		
	}
}
