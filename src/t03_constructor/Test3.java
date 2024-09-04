package t03_constructor;

public class Test3 {
	//기본생성자
	public Test3(){} 

	int atom1=30;
	
//	public Test3() {
//		System.out.println("atom1 : "+atom1);
//	}
	
	
	public Test3(int atom1) {
		this.atom1=atom1;
		System.out.println("atom1 : "+atom1);
		System.out.println("this.atom1 : "+this.atom1);
		
		this.atom1+=atom1;
		System.out.println("this.atom1 : "+this.atom1);
	}
	
	
	//int atom1=30;
	int atom2;
	double atom3;
	
	public Test3(double atom3){
		this.atom3=atom3;
		System.out.println("this.atom3 : "+this.atom3);
		
	}
	
}
