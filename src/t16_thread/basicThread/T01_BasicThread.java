package t16_thread.basicThread;

public class T01_BasicThread {
	public static void main(String[] args) {
		System.out.println("모든 실행 클래스는 main스레드 1개를 갖는다");
		System.out.println("현재 진행중인 스레드명: "+Thread.currentThread().getName());
		
		
	}
}
