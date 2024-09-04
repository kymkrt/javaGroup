package t08_inheritance;

public class T01Run {
	public static void main(String[] args) {
		T01_C t01 =new T01_C();
		
		t01.mod2();
		
		int res1 =t01.absMod(-5);
		
		System.out.println("res : "+res1);
		
		int res2 =t01.add(10, 20);
		System.out.println("res2 : "+res2);
		
	}
}
