package t16_thread.basicThread;
//스레드 만드는 방법 2가지
//1. Thread 클레스를 상속받아서 클래스를 정의한다.
public class T03_Extends {
	public static void main(String[] args) {
		System.out.println("현재 진행중인 스레드명: "+Thread.currentThread().getName());
		MyThread1 mt1 = new MyThread1();//3. Thread 객체 생성 일반클래스지만 스레드를 상속받아서 스레드임
//		mt1.run();
		mt1.start();//4. 스레드 실행 run()말고 start()메소드를 이용한 스레드 호출
	
	}
}
//근데 이렇게 하면 스레드가 아니라 jvm이 메인으로 돌린다
//run이 아니라 start로 쓰자
class MyThread1 extends Thread{ //1. Thread클래스를 상속한 클래스 정의/ 약속된 메소드만 사용가능
	@Override
	public void run() { //2. run() 메소드를 오버라이드 하여 스레드 처리에 필요한 코드를 작성/스레드의 동작을 정해주는 약속된 메소드
		System.out.println("스레드명: "+this.getName());//실행되는 스레드의 이름은 자동적으로 jvm이 Thread-0, 1, 2 --부터 붙여나간다
	}
}