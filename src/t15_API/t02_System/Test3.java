package t15_API.t02_System;
//시스템의 엑싯 : 말그대로 메인을 종료해버리는것(0)이면 그냥 강제종료
// 리턴은 정상 종료 다 돌린것
public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1;i<=1000000;i++) {
			tot+=i;
			if(tot>=10000) {
				System.out.println("합이 10000 이상일때의 i값은 "+i);
//				break;
//				return;
				System.exit(0);
			}
		}
		System.out.println("tot: "+tot);
	}
}
