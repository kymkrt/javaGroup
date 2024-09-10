package t15_API.t07_DateTime;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class T06_DecimalFormat {

	public static void main(String[] args) {
		//DecimalFormat(): 데이터의 출력포맷을 지정한다. (소수이하 자리 처리에서 많이 사용)
		//서식기호: 0(숫자-자리확보), #(숫자-의미없는 0은 표시안함)
		double su=12345.0;
//		double su=0;
		
		System.out.println("원본: "+su);
		
		DecimalFormat df= new DecimalFormat();
		System.out.println("1: "+df.format(su));//자동쉼표 정수 12,345
		
		df= new DecimalFormat("0");
		System.out.println("2: "+df.format(su));//정수 12345
		
		df= new DecimalFormat("0,000");
		System.out.println("3: "+df.format(su));//정수 12,345

		
		df= new DecimalFormat("0,000,000");
		System.out.println("4: "+df.format(su));//정수 0,012,345 남는만큼 자리 확보

		df= new DecimalFormat("#");
		System.out.println("5: "+df.format(su));//정수 12345 의미없는 형 제거
		
		df= new DecimalFormat("#,###");
		System.out.println("6: "+df.format(su));//정수 12,345
		
		df= new DecimalFormat("@@@@@@@,0");
		System.out.println("7: "+df.format(su));//정수 @@@@@@@1,2,3,4,5 남는자리를 이걸로 채운다
		
		df= new DecimalFormat("\u00A4#.0");
		System.out.println("8: "+df.format(su));//실수 ￦12345.0
		
		//US달러표시
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);//다 스태틱이라 그냥 쓸수 있다
		System.out.println("9. "+nf.format(su)); //$12,345.00
		
		//달러 원화는 외우면 좋다
		
	}
}
