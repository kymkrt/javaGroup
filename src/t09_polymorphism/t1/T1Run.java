package t09_polymorphism.t1;

//자동타입변환
public class T1Run {
	public static void main(String[] args) {
		Aa aa=new Aa();
		System.out.println();
		
		
		Bb bb=new Bb();
		//Ff ff=bb;
		Aa a1= bb;
		System.out.println("su : "+a1.su);
		System.out.println();
		
		Cc cc=new Cc();
		System.out.println();
		
		Aa a2=new Cc();
		System.out.println("su : "+a2.su);
		System.out.println();
		
		Dd dd=new Dd();
		System.out.println();
		Bb b1 = new Dd();
		System.out.println("su : "+b1.su);
		System.out.println();
		
		Aa a3 = new Dd();
		System.out.println("su : "+a3.su);
		System.out.println();
		
	}
}
