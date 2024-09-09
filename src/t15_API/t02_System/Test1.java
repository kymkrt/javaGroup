package t15_API.t02_System;
//break으로 끝내기
public class Test1 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1;i<=1000000;i++) {
			tot+=i;
			if(tot>=10000) {
				System.out.println("합이 10000 이상일때의 i값은 "+i);
				break;
			}
		}
		System.out.println("tot: "+tot);
	}
}
