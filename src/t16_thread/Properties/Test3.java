package t16_thread.Properties;
//일반적인 경우: JVM은메인스레드가 끝나도 데몬스레드가 실행중이면 끝날때까지 기다려준다 
//데몬스레드를 메인스레드에 종속시켜 작업하게되면 메인스레드가 끝나면 데몬스레드는 작업량이 남았어도 강제 종료한다
//일반스레드의 setDaemon 은 false, seDaemon을 true로 하면 메인스레드에 데몬스레드는 종속적이데된다
public class Test3 {
	public static void main(String[] args) {
		Thread myThread = new MyThread2();
		myThread.setDaemon(false); //메인스레드에 종속되지 않는다 메인끝나도 계속됨
		myThread.setName("myThread2");
		myThread.start();
		
		//메인스레드를 3초간 지연처리후 종료시켜보자
		try {	Thread.sleep(3000);} catch (InterruptedException e) {}
		System.out.println("main 스레드 종료");
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + " : "+ (isDaemon()?"데몬스레드":"일반스레드"));
		for(int i =1;i<=6;i++) {
			System.out.println(getName()+" : "+i);
			try {	Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}