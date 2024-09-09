package t15_API.t02_System;


public class Test4 {
	public static void main(String[] args) {
		int i, tot=0;
		
//		long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		
		
		for(i=1;i<=1000000;i++) {
			tot+=i;
		}
		
//		long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모된 시간: "+(endTime-startTime));
	}
}
