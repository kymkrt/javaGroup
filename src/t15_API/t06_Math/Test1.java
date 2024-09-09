package t15_API.t06_Math;

public class Test1 {

	public static void main(String[] args) {
		int su1 =100;
		int su2 =-100;
		
		//절대값 : Math.abs()
		System.out.println("su1: "+su1 +", su2: "+su2);
		System.out.println("Math.abs(su1): "+Math.abs(su1) +", Math.abs(su2): "+Math.abs(su2));
		System.out.println();
		
		double d1 = 1234.5678;
		double d2 = -1234.5678;
		
		//반올림 : Math.round() 무조건 정수형 반올림(소수첫째자리에서 반올림후 정수로 표시) 더아래에서 반올림하는 함수는 없음
		System.out.println("d1: "+d1+", d2: "+d2);
		System.out.println("Math.round(d1): "+Math.round(d1)+", Math.round(d2): "+Math.round(d2));
		
		//소수 1째자리에서의 반올림: 1234.567 + 0.5 = (int)1235.067 = 1235
		//소수 2째자리에서의 반올림: 1234.567 + 0.05 = 1235.617 * 10 = (int)12346.17 =12346 /10 = 1234.6
		System.out.println(Math.round(d1*10)/10.0); //정수로 나오기 때문에 10.0으로 실수 계산해준다
		//소수 3째자리에서의 반올림: 1234.567 + 0.005 = 1234.572*100 = (int)123457.2 = 123457/100 = 1234.57
		System.out.println(Math.round(d1*100)/100.0); 
		System.out.println();
		
		//String.format("%.nf", 실수); 자동반올림된다
		System.out.println(String.format("%.0f", d1));
		System.out.println(String.format("%.1f", d1));
		System.out.println(String.format("%.2f", d1));
		System.out.println(String.format("%.3f", d1));
		System.out.println();
		
		//소수부 무조건 올림: Math.ceil()
		System.out.println("1.ceil(): "+Math.ceil(d1));
		double d3 = 123.45;
		System.out.println("2.ceil(): "+Math.ceil(d3));
		//소수이하 2째 자리에서 무조건 올림
		System.out.println("3.ceil()*10/10: "+Math.ceil(d1*10)/10); //이미 실수라 뒤에 .0 안붙여도 됨
		System.out.println();
		
		//소수부 무조건 내림: floor()
		System.out.println("1.floor(): "+Math.floor(d1));
		System.out.println("2.floor(): "+Math.floor(d3));
		//소수이하 2째 자리에서 무조건 버림
		System.out.println("3.floor()*10/10: "+Math.floor(d1*10)/10); //이미 실수라 뒤에 .0 안붙여도 됨
		System.out.println();
		
		//최대값(max()) 최소값(min())
		double d4 = 345.678;
		System.out.println("max(): "+Math.max(d3, d4));
		System.out.println("min(): "+Math.min(d3, d4));
		System.out.println();
		
		//난수 Math.random() : 0이상 1미만 실수형 난수, (int)(Math.random()*(끝+1-시작)+시작
		System.out.println("0~1미만의 실수형난수: "+Math.random());
		System.out.println("1~100까지의 정수형난수: "+(int)(Math.random()*(100+1-1)+1));
		System.out.println("5~10까지의 정수형난수: "+(int)(Math.random()*(10+1-5)+5));
		
		
	}
}