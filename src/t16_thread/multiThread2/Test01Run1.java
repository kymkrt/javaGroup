package t16_thread.multiThread2;

public class Test01Run1 {

	public static void main(String[] args) {
		System.out.println("현재 클래스명: Test01Run1");
		System.out.println("현재 스레드명: "+Thread.currentThread().getName());
		System.out.println();
		
		//3개의 스레드 생성/실행
		Test01 th1 = new Test01();
		Test01 th2 = new Test01();
		Test01 th3 = new Test01();
		
		th1.start();
		th2.start();
		th3.start();
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("=====================");
		System.out.println("현재 클래스명: Test01Run1");
		System.out.println("현재 스레드명: "+Thread.currentThread().getName());
		System.out.println("=====================");
		
	}
}
