package t15_API.t02_System;
//그냥 끝낼때 리턴 끝 문장 안나옴
public class Test2 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1;i<=1000000;i++) {
			tot+=i;
			if(tot>=10000) {
				System.out.println("합이 10000 이상일때의 i값은 "+i);
//				break;
				return;
			}
		}
		System.out.println("tot: "+tot);
	}
}
