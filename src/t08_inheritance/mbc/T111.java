package t08_inheritance.mbc;

public class T111 {
	public int a1=10;
	protected int b1=20;
	int c1=30;
	private int d1 = 40;
	
	protected void mul(int su1, int su2) {
		int res = su1*su2;
		System.out.println("두수의 곱은 : "+res);
	}
}
