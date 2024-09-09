package t15_API.t05_Wrapper;

public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100;
		int intSu2 = 200;
		
		System.out.println("1.intSu1 +100 : "+(intSu1 +100));
		
		//정수형 Boxing처리(Integer) - 기본타입(int) 이 참조타입(객체)로 변환
		Integer objSu1 = new Integer(intSu1);
		System.out.println("2.objSu1 +100 : "+(objSu1 +100));
		
		//자동박싱
		Integer objSu2;
		objSu2 = intSu2; //참조타입=기본타입 원래는 오류 나지만 박싱되서 안남 
		System.out.println("3.objSu1 +100 : "+(objSu1 +100));
		//객체로 쓰고 싶어서 박싱한다
		
		//unboxing 기본타입으로 돌아가고 싶을때
		String strIntSu1 = "100";
		System.out.println("4.strIntSu1 + 100 : "+(strIntSu1+100));
		System.out.println("5.strIntSu1 + 100 : "+(Integer.parseInt(strIntSu1)+100));// 언박싱 되서 계산이 됨
		
		//double <--> Double
		double dblSu = 3.14;
//		Double objDblSu = dblSu; //박싱가능 얕은복사 주소만 줌
		Double objDblSu = new Double(dblSu); //객체니까 생성해서 넣어도 된다 깊은복사
		System.out.println("6.objDblSu + 100.5 : "+(objDblSu+100.5));
		
		//Boxing
		int su3 = 100;
//		Integer objSu3 = su3; // 가능 자동박싱
		Integer objSu3= Integer.valueOf(su3);
		
		//UnBoxing
		int su4 = Integer.valueOf(objSu3); //객체처리해둔건 밸류 오프로 풀어줘야한다
		System.out.println("su4 + 100 : "+(su4+100));
		
		
	}
}
