package t16_thread.Properties;


//스레드 우선순위: 
public class Test2 {
	public static void main(String[] args) {
		//CPU Core 수 가져오기
		System.out.println("코어수: "+Runtime.getRuntime().availableProcessors());
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.print(i+".번째 ");
			Thread thread = new MyThread();
			thread.start();
		}
		System.out.println("======================");
		
		//스레드 우선순위 지정/변경 우선순위숫자가 높을수록 우선순위가 더 높다
		for(int i = 0;i<15;i++) {
			System.out.print(i+".번째 ");
			Thread thread = new MyThread();
			if(i==7) thread.setPriority(Thread.MAX_PRIORITY);
			thread.start();
		}
		
		System.out.println("\n현재 진행중인 스레드명: "+Thread.currentThread().getName());
		
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(400);} catch (Exception e) {}
		System.out.println(getName()+" 우선순위: "+getPriority()); //기본우선순위는 모두 5이다
		System.out.println();
	}
}