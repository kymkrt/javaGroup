package t09_polymorphism.t1;

public class T2Run {
	public static void main(String[] args) {
	Aa aa = new Aa();
	
	
//	Cc cc=a1; //처음 부터 부모가 자식객체로 타입변화될수는 없다
		
	//부모객체가 자식객체로 타입변환을 하기 위해서는 무조건 자식객체가 부모타입으로 변환했을때만 가능하다(강제 casting)
	
	Bb bb=new Bb();
	System.out.println("su : "+bb.su);
	Aa a1=bb;
	System.out.println("su : "+a1.su);
	System.out.println();
	
	Bb b1=(Bb)a1;
	System.out.println("su : "+b1.su);
	System.out.println();
	
	Aa a2 = new Dd();
	System.out.println("1.su : "+a2.su);
	System.out.println();
	
	Dd d1 = (Dd) a2;
	System.out.println("2.su : "+d1.su);
	System.out.println();
	
	Bb b2 = (Bb)a2;
	System.out.println("3.su : "+b2.su);
	b2.modAa();
	System.out.println();
	
	//Cc 객체가 Aa로 타입 변환된덕이 없기에 a2객체는 Cc객체로 타입변환 불가이다(컴파일상에서는 에러가 발생하지 않는다:실행오류)
//	Cc c1=(Cc) a2;
//	System.out.println("su : "+c1.su);
//	System.out.println();
	
	//오버라이드 적용시 
	Aa a3=new Bb();//업캐스팅
	System.out.println("4 su: "+a3.su);
	a3.modAa();
	System.out.println();
	
	Bb b3=(Bb) a3; //down casting
	System.out.println("5 su: "+b3.su);
	b3.modAa();
	
	
	
	}
}
