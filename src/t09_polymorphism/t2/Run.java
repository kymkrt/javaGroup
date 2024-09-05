package t09_polymorphism.t2;

//instanceof 과거에 부모객체로 타입 변환이 되어었는지를 알아보는 연산자(true/false) 
public class Run {
	public static void main(String[] args) {
		Aa aa =new Bb();
		
//		Bb bb=(Bb)aa; //(O)
		
//		Cc cc = (Cc)aa;//(X)
		
		//down casting을 하기위해서는 up casting이 선행되어있어야 한다
		if(aa instanceof Bb) {
			Bb bb=(Bb)aa;
			System.out.println("1.down casting 성공");
		}
		else {
			System.out.println("1.down casting 실패");
		}
		System.out.println();
		if(aa instanceof Cc) {
			Cc cc=(Cc)aa;
			System.out.println("2.down casting 성공");
		}
		else {
			System.out.println("2.down casting 실패");
		}
	}
}